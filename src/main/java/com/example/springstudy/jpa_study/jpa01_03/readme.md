# 스프링부트/JPA - 컨트롤러 구현 편

### Chapter 1 . Spring Rest Controller 를 통한 RestAPI 구현 게시판 기능

####11. 공지사항에 글을 등록하기 위해서 글작성에 대한 API를 만들어 보세요.
[조건]
- REST API 형식으로 구현
- HTTP METHOD 는 POST
- 요청 주소는 "/api/notice"
- 전달되는 파라미터는 x-www-form-urlencoded 형식의 제목, 내용을 입력 받음
- 파라미터는 추상화하지 않고 기본데이터 타입 형태로 전달받음
- 리턴값은 입력된 형태에 게시글ID(1)를 추가하여 모델 형태로 리턴

####12. 공지사항에 글을 등록하기 위해서 글작성에 대한 API를 만들어 보세요.
[조건]
- REST API 형식으로 구현
- HTTP METHOD 는 POST
- 요청 주소는 "/api/notice2"
- 전달되는 파라미터는 x-www-form-urlencoded 형식의 제목, 내용을 입력 받음
- 파라미터를 공지사항 모델로 추상화하여 전달받음
- 리턴값은 입력된 형태에 게시글ID(2)과 등록일자(현재시간)을 추가하여 모델 형태로 리턴

####13. 공지사항에 글을 등록하기 위해서 글작성에 대한 API를 만들어 보세요.
[조건]
- REST API 형식으로 구현
- HTTP METHOD 는 POST
- 요청 주소는 "/api/notice3"
- 전달되는 파라미터는 application/json 형식의 제목, 내용을 입력 받음
- 파라미터를 공지사항 모델로 추상화하여 전달받음
- 리턴값은 입력된 형태에 게시글ID(3)과 등록일자(현재시간)을 추가하여 모델 형태로 리턴

####14. 공지사항에 글을 등록하기 위한 글작성에 대한 API를 만들어 보세요.
[조건]
- REST API 형식으로 구현
- HTTP METHOD 는 POST
- 요청 주소는 "/api/notice4"
- 전달되는 값은 application/json 형식의 제목, 내용을 입력 받음
- 전달된 값을 저장하기 위한 JPA Repository 와 Entity를 통해서 Database 에 저장
- 리턴값은 저장된 id값이 포함된 Entity 리턴
  [이미설정되어 있는 부분]
  -h2db memorydb

####15.  공지사항에 글을 등록하기 위한 글작성에 대한 API를 만들어 보세요.
[조건]
- REST API 형식으로 구현
- HTTP METHOD 는 POST
- 요청 주소는 "/api/notice4"
- 전달되는 값은 application/json 형식의 제목, 내용을 입력 받음
- 공지사항 등록일은 현재시간을 저장, 공지사항 조회수와 좋아요수는 초기값을 0으로 설정
- 전달된 값을 저장하기 위한 JPA Repository 와 Entity를 통해서 Database 에 저장
- 리턴값은 저장된 id값이 포함된 Entity 리턴
  [이미설정되어 있는 부분]
  -h2db memorydb
  