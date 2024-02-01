package com.example.springstudy.jpa_study.jpa01_02_notice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiNoticeController {

  // 06번 문제

//  @GetMapping("/api/notice")
  public String notice(){

    return "공지사항입니다.";
  }

  // 07번 문제

 // @GetMapping("/api/notice")
  public NoticeDto noticeAPI(){
    //   게시글ID = 1, 제목 = 공지사항입니다, 내용 = 공지사항 내용입니다, 등록일 = 2021-1-31
    NoticeDto noticeDto = NoticeDto.builder()
        .id(1)
        .title("공지사항입니다.")
        .contents("공지사항내용입니다.")
        .regDate(LocalDateTime.of(2021,01,31,0,0))
        .build();

    return noticeDto;
  }

  // 08 문제
  @GetMapping("/api/notice")
  public List<NoticeDto> noticeAPI2(){

    List<NoticeDto> noticeDtos = new ArrayList<>();

    noticeDtos.add(NoticeDto.builder()
        .id(1)
        .title("공지사항입니다.")
        .contents("공지사항내용입니다.")
        .regDate(LocalDateTime.of(2021,01,30,0,0))
        .build());

    noticeDtos.add(NoticeDto.builder()
        .id(2)
        .title("두번째 공지사항입니다.")
        .contents("두번째 공지사항내용입니다.")
        .regDate(LocalDateTime.of(2021,01,31,0,0))
        .build());
    return noticeDtos;
  }

  //09번 문제
  @GetMapping("/api/notice3")
  public List<NoticeDto> noticeAPI3(){
    List<NoticeDto> noticeDtos = new ArrayList<>();

    return noticeDtos;
  }

  // 10번 문제
  @GetMapping("/api/notice4")
  public int noticeAPI4(){

    return 10; // 정수형으로 리턴하여도 결과는 문자열로 반환
  }
}
