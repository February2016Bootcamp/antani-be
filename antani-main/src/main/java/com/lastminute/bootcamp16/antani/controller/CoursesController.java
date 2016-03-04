package com.lastminute.bootcamp16.antani.controller;

import com.lastminute.bootcamp16.antani.domain.Course;
import com.lastminute.bootcamp16.antani.domain.RetrieveCourses;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController
{
  private RetrieveCourses retrieveCourses;

  public CoursesController(RetrieveCourses retrieveCourses)
  {
    this.retrieveCourses = retrieveCourses;
  }

  public List<Course> retrieveAllCourses()
  {
    List<Course> all = retrieveCourses.all();
    return all;
  }
}
