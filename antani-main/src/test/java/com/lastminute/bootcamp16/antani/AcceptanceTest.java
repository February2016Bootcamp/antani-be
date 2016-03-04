package com.lastminute.bootcamp16.antani;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import javax.ws.rs.core.MediaType;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.not;
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

  @Test
  public void restCallReturnsData()
  {
    Client client = Client.create(new DefaultClientConfig());
    WebResource service = client.resource("http://localhost:8080/");
    ClientResponse resp = service.path("courses")
                                 .accept(MediaType.APPLICATION_JSON)
                                 .get(ClientResponse.class);
    String courses = resp.getEntity(String.class);

    assertThat(courses,containsString("Lingua Kinglon per principianti"));
  }

  @AfterClass
  public static void stopServer()
  {
    SpringApplication.exit(context);
  }
}
