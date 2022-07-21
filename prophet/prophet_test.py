#필요 모듈...?매번 받는건 아닌것같은데
import FinanceDataReader as fdr
from prophet import Prophet
from prophet.plot import plot_plotly, plot_components_plotly
from prophet.plot import add_changepoints_to_plot
import pymysql
import os
from google.cloud import storage


# DB에서 주식코드 받아오기
## DB연결
connect = pymysql.connect(host='localhost', user='root', password='ssafy', db='stocksafe_db', charset='utf8') # 한글처리 (charset = 'utf8')
cur = connect.cursor()
sql = "select id from stock"
cur.execute(sql)
list1 = cur.fetchall()

print(list1)

STOCK_CODE = "005930"

for stock in list1:
    # 데이터 가져오기
    STOCK_CODE = stock[0]
    data = fdr.DataReader(STOCK_CODE)

    print(2)
    # prophet사용 위한 전처리
    ## 반드시 y 컬럼과 ds 컬럼이 존재해야합니다.
    ## 예측 값은 y, 시계열 데이터는 ds에 지정합니다.
    data['y'] = data['Close']
    data['ds'] = data.index

    # prophet사용
    ## 객체 선언
    m = Prophet()
    m.fit(data)

    ## 기간 설정
    future = m.make_future_dataframe(periods=365)
    ## 예측
    forecast = m.predict(future)

    ### flexibilty조절
    # m = Prophet(changepoint_prior_scale=0.8)
    # forecast = m.fit(data).predict(future)


    # 예측 데이터 시각화
    ## 처음 80%의 시계열 데이터에 대하여 잠재적인 25개의 changepoints를 만들고, 그 중 선별하여 최종 changepoints를 그래프에서 vertical line으로 그려주게 됩니다.
    # https://hyperconnect.github.io/2020/03/09/prophet-package.html
    # https://zzsza.github.io/data/2019/02/06/prophet/
    fig = m.plot(forecast)

    file_name1 = "img/" + STOCK_CODE + ".png"
    graph = m.plot(forecast).savefig(file_name1)
    # add_changepoints_to_plot(fig.gca(), m, forecast)

    file_name2 = "img/" + STOCK_CODE + "_seasonality.png"
    graph_seasonality = m.plot_components(forecast).savefig(file_name2)

    # 이미지 저장 -> S3

    os.environ["GOOGLE_APPLICATION_CREDENTIALS"] = "key/exalted-arcanum-356907-6273c406bf43.json"

    print(1)

    storage_client = storage.Client()
    buckets = list(storage_client.list_buckets())

    print(buckets)

    # ----------------------------------------------------------
    print(file_name1)

    bucket_name = 'stocksafe_storage'    # 서비스 계정 생성한 bucket 이름 입력
    source_file_name = file_name1    # GCP에 업로드할 파일 절대경로
    destination_blob_name = file_name1    # 업로드할 파일을 GCP에 저장할 때의 이름


    storage_client = storage.Client()
    bucket = storage_client.bucket(bucket_name)
    blob = bucket.blob(destination_blob_name)

    blob.upload_from_filename(source_file_name)

    print('success')
