package com.example.springstudy.jpa_study.jpa01_03.repository;

import com.example.springstudy.jpa_study.jpa01_03.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeRepository extends JpaRepository<Notice, Long> {


}
