package com.lastminute.bootcamp16.antani.domain;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RetrieveCoursesTest
{

  @Test
  public void noCourses() throws Exception
  {

    RetrieveCourses retrieveCourse = new RetrieveCourses(new ArrayList<Course>());
    List<Course> courses = retrieveCourse.all();
    assertThat(courses.size(), is(0));

  }

  @Test
  public void oneCourse() throws Exception
  {
    Course course = new Course();
    final ArrayList<Course> courses = new ArrayList<Course>();
    courses.add(course);
    RetrieveCourses retrieveCourse = new RetrieveCourses(courses);

    assertThat(retrieveCourse.all().size(), is(1));

  }
}
