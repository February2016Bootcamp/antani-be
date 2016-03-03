package com.lastminute.bootcamp16.antani.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PingController
{

  @RequestMapping(value = "/", method = GET)
  @ResponseBody
  public String home(){
    return "Hello Antani!";
  }
}
