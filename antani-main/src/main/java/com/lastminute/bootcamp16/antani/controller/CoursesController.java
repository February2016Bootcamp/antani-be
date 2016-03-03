package com.lastminute.bootcamp16.antani.controller;

import com.lastminute.bootcamp16.antani.domain.Course;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CoursesController
{
  public List<Course> retrieveAllCourses()
  {
    final ArrayList<Course> courses = new ArrayList<>();
    courses.add(new Course(null, null, 0, null));
    courses.add(new Course(null, null, 0, null));
    return courses;
  }
}
