package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;

public class RegisterParticipant
{
  private ParticipantsRepository participantsRepository;

  public RegisterParticipant(ParticipantsRepository participantsRepository)
  {
    this.participantsRepository = participantsRepository;
  }

  public void register(String courseId)
  {
      participantsRepository.register(courseId);
  }
}
