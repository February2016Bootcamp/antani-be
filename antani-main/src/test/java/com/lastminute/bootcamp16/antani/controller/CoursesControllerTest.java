package com.lastminute.bootcamp16.antani.controller;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CoursesControllerTest
{
  @Test
  public void retrieveAllCourses() throws Exception
  {
    CoursesController controller = new CoursesController();
    assertThat(controller.retrieveAllCourses().size(), is(2));
  }
}
