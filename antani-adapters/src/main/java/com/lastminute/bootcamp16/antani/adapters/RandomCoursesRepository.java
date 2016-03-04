package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.Course;

import java.io.*;
import java.net.URISyntaxException;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;

public class RandomCoursesRepository implements com.lastminute.bootcamp16.antani.domain.ports.CoursesRepository {
  private String file;

  public RandomCoursesRepository(String file) {

    this.file = file;
  }

  @Override
  public List<Course> retrieveAll() {
    List<Course> courses = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      Course c = new Course(randomString(5), randomString(60), randomDouble(10000, 20000), randomDate());

    }

    return courses;
  }

  static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  static SecureRandom rnd = new SecureRandom();

  String randomString(int len) {
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; i++)
      sb.append(AB.charAt(rnd.nextInt(AB.length())));
    return sb.toString();
  }

  private static int randomDouble(double rangeMin, double rangeMax) {
    Random r = new Random();
    double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
    return (int) randomValue;
  }

  private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ");

  private String randomDate() {
    TimeZone tz = TimeZone.getTimeZone("UTC");
    dateFormat.setTimeZone(tz);
    String nowAsISO = dateFormat.format(new Date());
    return nowAsISO;
  }
}
