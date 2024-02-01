package com.example.springstudy.jpa_study.jpa01_03;

import com.example.springstudy.jpa_study.jpa01_02_notice.NoticeDto;
import com.example.springstudy.jpa_study.jpa01_02_notice.NoticeInput;
import com.example.springstudy.jpa_study.jpa01_03.entity.Notice;
import com.example.springstudy.jpa_study.jpa01_03.repository.NoticeRepository;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NoticeApiController {

  private final NoticeRepository noticeRepository;

  // 11번 문제

  @PostMapping("/api/notice5")
  public NoticeDto addNotice(@RequestParam String title, @RequestParam String contents){

    NoticeDto noticeDto = NoticeDto.builder()
        .id(1)
        .title(title)
        .contents(contents)
        .build();

    return noticeDto;

  }

  // 12번 문제
  @PostMapping("/api/notice6")
  public NoticeDto addNotice2( NoticeDto noticeDto){

    noticeDto.setId(3);
    noticeDto.setRegDate(LocalDateTime.now());

    return noticeDto;
  }

  // 13번 문제
  @PostMapping("/api/notice7")
  public NoticeDto addNotice3(@RequestBody NoticeDto noticeDto){

    noticeDto.setId(2);
    noticeDto.setRegDate(LocalDateTime.now());

    return noticeDto;
  }

  // 14번 문제
  @PostMapping("/api/notice8")
  public Notice addNotice4 (@RequestBody NoticeInput input){

    Notice notice = Notice.builder()
        .title(input.getTitle())
        .contents(input.getContents())
        .regDate(LocalDateTime.now())
        .build();

    noticeRepository.save(notice);

    return notice;
  }



}
