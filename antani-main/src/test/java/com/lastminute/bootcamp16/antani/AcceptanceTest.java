package com.lastminute.bootcamp16.antani;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class AcceptanceTest
{

  private static ApplicationContext context;

  @BeforeClass
  public static void setup()
  {
    context = SpringApplication.run(Application.class);
  }

  @Test
  public void retrieveAllCourses() throws Exception
  {
    final HtmlUnitDriver driver = new HtmlUnitDriver();
    driver.get("http://localhost:8080/courses");

    final String pageSource = driver.getPageSource();
    assertThat(pageSource, not(containsString("404")));
    assertThat(pageSource, not(containsString("500")));
  }

  @AfterClass
  public static void stopServer()
  {
    SpringApplication.exit(context);
  }
}
