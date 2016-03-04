package com.lastminute.bootcamp16.antani.controller;

import com.lastminute.bootcamp16.antani.adapters.FileCoursesRepository;
import com.lastminute.bootcamp16.antani.adapters.InMemoryParticipantsRepository;
import com.lastminute.bootcamp16.antani.domain.Course;
import com.lastminute.bootcamp16.antani.domain.RegisterParticipant;
import com.lastminute.bootcamp16.antani.domain.RetrieveCourses;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@CrossOrigin
public class CoursesController
{
  private RetrieveCourses retrieveCourses;
  private final RegisterParticipant registerParticipant;

  public CoursesController(RetrieveCourses retrieveCourses, RegisterParticipant registerParticipant)
  {
    this.retrieveCourses = retrieveCourses;
    this.registerParticipant = registerParticipant;
  }
  public CoursesController()
   {
     this(new RetrieveCourses(new FileCoursesRepository("db.csv")),
          new RegisterParticipant(new InMemoryParticipantsRepository()));
   }

  @RequestMapping(value = "/courses", method = GET)
  public List<Course> retrieveAllCourses()
  {
    List<Course> all = retrieveCourses.all();
    return all;
  }

  @RequestMapping(value = "/courses/{code}/partecipants", method = POST)
  public void register(@PathVariable String code)
  {
    registerParticipant.register(code);
  }
}
