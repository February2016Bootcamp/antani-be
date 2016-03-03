package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FileCoursesRepositoryTest
{

  @Test
  public void noCourses(){

    String file = "emplty.csv";

    FileCoursesRepository repository = new FileCoursesRepository(new ArrayList<Course>());
    assertThat(repository.retrieveAll().size(), is(0));
  }
}
