package com.lastminute.bootcamp16.antani.domain.ports;

public interface ParticipantsRepository
{
  void register(String courseId);

  int countParticipants(String courseId);

  void registerMail(String courseCode, String email);
}
