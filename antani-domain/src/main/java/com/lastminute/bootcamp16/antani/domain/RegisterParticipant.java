package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantRepository;

public class RegisterParticipant
{
  private ParticipantRepository participantsRepository;

  public RegisterParticipant(ParticipantRepository participantsRepository)
  {

    this.participantsRepository = participantsRepository;
  }

  public void register(String courseId)
  {
      participantsRepository.register(courseId);
  }
}
