package com.lastminute.bootcamp16.antani.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class Course implements Serializable
{
  private final String code;
  private final String title;
  private final int price;
  private final String dateTime;

  public Course(String code, String title, int price, String dateTime)
  {
    this.code = code;
    this.title = title;
    this.price = price;
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object o)
  {

    return EqualsBuilder.reflectionEquals(this,o);
  }

  @Override
  public int hashCode()
  {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @Override
  public String toString()
  {
    return ToStringBuilder.reflectionToString(this);
  }

  public String getCode()
  {
    return code;
  }

  public String getTitle()
  {
    return title;
  }

  public int getPrice()
  {
    return price;
  }

  public String getDateTime()
  {
    return dateTime;
  }
}
