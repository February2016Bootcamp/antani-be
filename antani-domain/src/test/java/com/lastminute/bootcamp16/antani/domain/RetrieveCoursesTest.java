package com.lastminute.bootcamp16.antani.domain;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RetrieveCoursesTest
{

  @Test
  public void noCourses() throws Exception
  {

    RetrieveCourses retrieveCourse = new RetrieveCourses();
    List<Course> courses = retrieveCourse.all();
    assertThat(courses.size(), is(0));

  }
}
