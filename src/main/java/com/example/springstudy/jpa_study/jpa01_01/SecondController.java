package com.example.springstudy.jpa_study.jpa01_01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

  // 03번 문제
  @RequestMapping(value = "/hello-spring", method = RequestMethod.GET)
  public String helloSpring(){

    return "hello spring";
  }

  //04 문제

  @GetMapping("/hello-rest")
  public String helloRest(){
    return "hello rest";
  }

  //05 문제
  @GetMapping("/api/helloworld")
  public String helloAPI(){
    return "hello rest api";
  }
}
