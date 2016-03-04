package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;

public class RegisterParticipant {
  private ParticipantsRepository participantsRepository;

  public RegisterParticipant(ParticipantsRepository participantsRepository) {
    this.participantsRepository = participantsRepository;
  }

  public void register(String courseId) {
    participantsRepository.register(courseId);
  }

  public int count(String courseId) {
    return participantsRepository.countParticipants(courseId);
  }

  public void registerMail(String courseCode, String email) {
    participantsRepository.registerMail(courseCode, email);

  }
}
