package com.lastminute.bootcamp16.antani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.lastminute.bootcamp16.antani")
public class Application
{
  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }

}
