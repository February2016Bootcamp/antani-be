package com.lastminute.bootcamp16.antani.domain;

import java.util.List;

public class RetrieveCourses
{
  private final List<Course> courses;

  public RetrieveCourses(List<Course> courses)
  {
    this.courses = courses;
  }

  public List<Course> all()
  {
    return new FileCoursesRepository(courses).invoke();
  }

  private class FileCoursesRepository
  {
    private final List<Course> courses;

    public FileCoursesRepository(List<Course> courses)
    {

      this.courses = courses;
    }

    public List<Course> invoke() {return this.courses;}
  }
}
