# 공부해야할 것
직렬화/역직렬화 -> gson

# 배포
## application.properties
```
// 어떤 주소로부터 오는 요청을 허용할 것인가
// 0.0.0.0은 모든 주소를 허용함
server.address=0.0.0.0
```

## 도커 이미지
1. 빌드<br/>
   ./gradlew build -x test

2. 이미지 생성<br/>
   docker build --build-arg DEPENDENCY=build/dependency -t {도커아이디}/{도커레파지토리} --platform linux/amd64 .

3. 태그 생성<br/>
   docker tag {이미지} {도커아이디}/{도커레파지토리}:{태그}

4. 원격에 올리기<br/>
   docker push hyuna919/wish:1.0.0

## EC2 인스턴스 생성

## EC2에 올리기
1. 도커 이미지 pull<br/>
   git pull {도커아이디}/{도커레파지토리}:{태그}
 
2. 도커 실행
   docker run -p {인스턴스포트}:{도커포트} {도커아이디}/{도커레파지토리}:{태그}
   
