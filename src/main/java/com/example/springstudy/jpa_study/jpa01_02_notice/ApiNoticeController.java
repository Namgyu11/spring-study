package com.example.springstudy.jpa_study.jpa01_02_notice;

import java.time.LocalDateTime;
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

  @GetMapping("/api/notice")
  public NoticeModel noticeAPI(){
    //   게시글ID = 1, 제목 = 공지사항입니다, 내용 = 공지사항 내용입니다, 등록일 = 2021-1-31
    NoticeModel noticeModel = NoticeModel.builder()
        .id(1)
        .title("공지사항입니다.")
        .contents("공지사항내용입니다.")
        .regDate(LocalDateTime.of(2021,01,31,0,0))
        .build();

    return noticeModel;
  }


}
