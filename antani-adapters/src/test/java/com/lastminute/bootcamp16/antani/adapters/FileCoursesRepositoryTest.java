package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FileCoursesRepositoryTest
{

  @Test
  public void noCourses()
  {

    String file = "db/empty.csv";

    FileCoursesRepository repository = new FileCoursesRepository(file);
    assertThat(repository.retrieveAll().size(), is(0));
  }

  @Test
  public void oneCourses()
  {

    String file = "db/one.csv";

    FileCoursesRepository repository = new FileCoursesRepository(file);

    final List<Course> courses = repository.retrieveAll();
    assertThat(courses.size(), is(1));
    final Course actual = courses.get(0);
    final Course course = new Course("01", "Lingua Kinglon per principianti", 90, "2016-03-02T18:36:14+00:00");
    assertThat(actual, is(course));

  }

  @Test
  public void twoCourses()
  {

    String file = "db/two.csv";

    FileCoursesRepository repository = new FileCoursesRepository(file);

    final List<Course> courses = repository.retrieveAll();

    assertThat(courses.size(), is(2));
    assertThat(courses.get(0), is(new Course("01", "Lingua Kinglon per principianti", 90, "2016-03-02T18:36:14")));
    assertThat(courses.get(1), is(new Course("02", "Clean Code", 200, "2016-04-02T18:36:14")));

  }
}
