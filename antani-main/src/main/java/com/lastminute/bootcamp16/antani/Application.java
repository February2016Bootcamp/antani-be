package com.lastminute.bootcamp16.antani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Application
{
  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }

  @RequestMapping("/")
  @ResponseBody
  String home(){
    return "Hello Antani!";
  }
}
