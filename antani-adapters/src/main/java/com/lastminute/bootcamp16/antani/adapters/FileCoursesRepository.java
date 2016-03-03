package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCoursesRepository implements com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository
{
  private String file;

  public FileCoursesRepository(String file)
  {

    this.file = file;
  }

  @Override
  public List<Course> retrieveAll()
  {
    List<Course> courses= new ArrayList<>();
    if (file != null)
    {
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {

        String line;
        while ((line = br.readLine()) != null)
        {
          courses.add(createCourse(line));
        }
      }
      catch (IOException e)
      {
        throw new RuntimeException(e);
      }
    }

    return courses;
  }

  private Course createCourse(String line)
  {
    String fields[] = line.split(",");

    String code = fields[0];
    String title = fields[1];
    int price = Integer.parseInt(fields[2]);
    String dateTime = fields[3];

    return new Course(code, title, price, dateTime);
  }
}
