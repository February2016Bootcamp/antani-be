package com.lastminute.bootcamp16.antani.adapters;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FileCoursesRepositoryTest
{

  @Test
  public void noCourses(){

    String file = "db/empty.csv";

    FileCoursesRepository repository = new FileCoursesRepository(file);
    assertThat(repository.retrieveAll().size(), is(0));
  }

  @Test
    public void oneCourses(){

      String file = "db/one.csv";

      FileCoursesRepository repository = new FileCoursesRepository(file);

      assertThat(repository.retrieveAll().size(), is(1));
    }
}
