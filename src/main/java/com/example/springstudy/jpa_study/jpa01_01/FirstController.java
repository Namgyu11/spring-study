package com.example.springstudy.jpa_study.jpa01_01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

  // 01번 문제
  @RequestMapping(value = "/first-url", method= RequestMethod.GET)
  public void first(){

  }
  // 02번 문제
  @ResponseBody
  @RequestMapping("/helloworld")
  public String hello(){

    return "hello World";
  }



}
