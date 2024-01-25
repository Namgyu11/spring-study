package com.example.springstudy.jpa_study.jpa01_02_notice;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NoticeModel {
  //ID 제목, 내용, 등록일
  private int id;
  private String title;
  private String contents;
  private LocalDateTime regDate;
}
