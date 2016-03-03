package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class RetrieveCoursesTest
{
  @Rule
  public final JUnitRuleMockery context = new JUnitRuleMockery();

  private CoursesRepository coursesRepository = context.mock(CoursesRepository.class);
  private RetrieveCourses retrieveCourse;

  @Before
  public void setUp() throws Exception
  {
    retrieveCourse = new RetrieveCourses(coursesRepository);
  }

  @Test
  public void noCourses() throws Exception
  {
    context.checking(new Expectations()
    {{
      allowing(coursesRepository).retrieveAll();
      will(returnValue(new ArrayList<Course>()));
    }});

    assertThat(retrieveCourse.all().size(), is(0));
  }

  @Test
  public void oneCourse() throws Exception
  {
    final ArrayList<Course> courses = new ArrayList<Course>();
    courses.add(new Course());

    context.checking(new Expectations()
    {{
      allowing(coursesRepository).retrieveAll();
      will(returnValue(courses));
    }});

    assertThat(retrieveCourse.all().size(), is(1));
  }
}
