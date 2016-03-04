package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;

public class InMemoryParticipantsRepository implements ParticipantsRepository
{
  @Override
  public void register(String courseId)
  {

  }

  @Override
  public int countParticipants(String courseId)
  {
    return 0;
  }
}
