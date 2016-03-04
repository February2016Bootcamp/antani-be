package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;

import java.util.HashMap;
import java.util.Map;

public class InMemoryParticipantsRepository implements ParticipantsRepository {
  private Map<String, Integer> participants;

  public InMemoryParticipantsRepository() {
    participants = new HashMap<>();
  }

  @Override
  public void register(String courseId) {
    Integer count = participants.get(courseId);
    if (count == null) count = 0;
    participants.put(courseId, ++count);
  }

  @Override
  public int countParticipants(String courseId) {
    Integer count = participants.get(courseId);
    return count == null ? 0 : count;
  }
}
