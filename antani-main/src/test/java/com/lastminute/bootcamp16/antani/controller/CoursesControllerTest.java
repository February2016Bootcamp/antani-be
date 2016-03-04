package com.lastminute.bootcamp16.antani.controller;

import com.lastminute.bootcamp16.antani.domain.Course;
import com.lastminute.bootcamp16.antani.domain.RegisterParticipant;
import com.lastminute.bootcamp16.antani.domain.RetrieveCourses;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.jmock.lib.legacy.ClassImposteriser;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CoursesControllerTest
{

  @Rule
  public JUnitRuleMockery context = new JUnitRuleMockery();

  private RetrieveCourses retrieveCourses;


  @Before
  public void setUp()
  {
    context.setImposteriser(ClassImposteriser.INSTANCE);
    retrieveCourses = context.mock(RetrieveCourses.class);
  }

  @Test
  public void retrieveAllCourses() throws Exception
  {
    context.checking(new Expectations()
    {{

        allowing(retrieveCourses).all();
        will(returnValue(Arrays.asList(new Course(null, null, 1, null), new Course(null, null, 1, null))));
      }});

    CoursesController controller = new CoursesController(retrieveCourses,null);
    assertThat(controller.retrieveAllCourses().size(), is(2));
  }


  @Test
  public void registerParticipant()
  {
    RegisterParticipant registerParticipant = context.mock(RegisterParticipant.class);
    context.checking(new Expectations()
    {{

        oneOf(registerParticipant).register("01");
      }});

    CoursesController controller = new CoursesController(null, registerParticipant);
    controller.register("01");
  }
}
