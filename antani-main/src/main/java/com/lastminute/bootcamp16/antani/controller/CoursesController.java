package com.lastminute.bootcamp16.antani.controller;

import com.lastminute.bootcamp16.antani.adapters.FileCoursesRepository;
import com.lastminute.bootcamp16.antani.domain.Course;
import com.lastminute.bootcamp16.antani.domain.RetrieveCourses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class CoursesController
{
  private RetrieveCourses retrieveCourses;

  public CoursesController(RetrieveCourses retrieveCourses)
  {
    this.retrieveCourses = retrieveCourses;
  }
  public CoursesController()
   {
     this.retrieveCourses = new RetrieveCourses(new FileCoursesRepository("db.csv"));
   }


  @RequestMapping(value = "/courses", method = GET)

  public List<Course> retrieveAllCourses()
  {
    List<Course> all = retrieveCourses.all();
    return all;
  }
}
