package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository;

import java.util.List;

public class RetrieveCourses
{
  private CoursesRepository fileCoursesRepository;

  public RetrieveCourses(CoursesRepository coursesRepository)
  {
    fileCoursesRepository = coursesRepository;
  }

  public List<Course> all()
  {
    return fileCoursesRepository.retrieveAll();
  }

}
