package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileCoursesRepository implements com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository
{
  private String file;
  private List<Course> courses;

  public FileCoursesRepository(List<Course> courses)
  {
    this.courses = courses;
  }

  public FileCoursesRepository(String file)
  {

    this.file = file;
  }

  @Override
  public List<Course> retrieveAll()
  {

    if (file != null)
    {
      try (BufferedReader br = new BufferedReader(new FileReader(file)))
      {
        String line = br.readLine();
        while (line != null)
        {
          String fields[] = line.split(",");

          String code = fields[0];
          String title = fields[1];
          int price = Integer.parseInt(fields[2]);
          String dateTime = fields[3];

          Course course = new Course(code, title, price, dateTime);

        }
      }
      catch (IOException e)
      {
        throw new RuntimeException(e);
      }
    }

    return this.courses;
  }
}
