# 스프링부트/JPA - 컨트롤러 구현 편

### Chapter 1 . Spring Rest Controller 를 통한 RestAPI 구현 게시판 기능

####1. 클라이언 요청에 대한 주소를 만들어 보세요.
[조건]
- 컨트롤러 인식을 위한 Controller 어노테이션 이용
- 주소매핑은 RequestMapping을 이용
- HTTP 메소드는 GET 방식
- 리턴값은 아무것도 없음
- 주소는 "/first-url"

####2. 클라이언트 요청에 대한 주소와 문자열을 리턴하는 함수를 작성해 보세요.
[조건]
- 컨트롤러 인식을 위한 Controller 어노테이션 이용
- 주소매핑은 RequestMappding을 이용
- HTTP 메소드는 GET 방식
- 요청 주소는 "/helloworld"
- 리턴값은 "hello world" 문자열 리턴
- 주소는 "/helloworld"

####3. 클라이언트 요청에 대한 주소에 대한 Rest 함수를 작성해 봅시다.
[조건]
- 컨트롤러 인식을 위한 Controller 어노테이션 이용
- 주소매핑은 RequestMapping이 아닌 Rest 형식의 어노테이션 이용
- HTTP 메소드는 GET 방식(어노테이션 이용)
- 요청 주소는 "/hello-spring"
- 리턴값은 "hello spring" 문자열 리턴
- 문자열을 리턴하기 위한 어노테이션 이용"

####4. 클라이언트 요청에 대한 Rest 형식의 함수를 작성해 보세요.
[조건]
- Rest 컨트롤러 형식의 어노테이션 이용
- 주소매핑 역시 Rest 형식의 어노테이션 이용
- HTTP 메소드는 GET
- 요청 주소는 "/hello-rest"
- 리턴값은 ""hello rest"" 문자열 리턴"

####5. 클라이언트 요청에 대한 Rest API 형식의 함수를 작성해 보세요.
[조건]
- Rest 컨트롤러 형식의 어노테이션 이용
- 주소매핑 역시 Rest 형식의 어노테이션 이용
- HTTP 메소드는 GET
- 요청 주소는 "/api/helloworld"
- 리턴값은 "hello rest api" 문자열 리턴

