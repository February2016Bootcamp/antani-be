package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;

import java.util.List;

public class FileCoursesRepository implements com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository
{
  private final List<Course> courses;

  public FileCoursesRepository(List<Course> courses)
  {
    this.courses = courses;
  }

  @Override
  public List<Course> retrieveAll() {return this.courses;}
}
