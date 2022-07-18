#필요 모듈...?매번 받는건 아닌것같은데
import FinanceDataReader as fdr
from fbprophet import Prophet
from fbprophet.plot import plot_plotly, plot_components_plotly

# 환경변수 받아오기(주식명)
# 삼성전자 005930
STOCK_CODE = "005930"

# 데이터 가져오기
data = fdr.DataReader(STOCK_CODE)

# prophet사용 위한 전처리
## 반드시 y 컬럼과 ds 컬럼이 존재해야합니다.
## 예측 값은 y, 시계열 데이터는 ds에 지정합니다.
data['y'] = data['Close']
data['ds'] = data.index

# prophet사용
## 객체 선언
m = Prophet()
m.fit(data)


## 기간따라 반복
dates = [1,30,365]
for date in dates :
    ## 기간 설정
    future = m.make_future_dataframe(periods=date)
    ## 예측
    forecast = m.predict(future)

# DB에 가격 넣기