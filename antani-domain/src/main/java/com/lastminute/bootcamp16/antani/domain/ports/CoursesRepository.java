package com.lastminute.bootcamp16.antani.domain.ports;

import com.lastminute.bootcamp16.antani.domain.Course;

import java.util.List;

public interface CoursesRepository
{
  List<Course> retrieveAll();
}
