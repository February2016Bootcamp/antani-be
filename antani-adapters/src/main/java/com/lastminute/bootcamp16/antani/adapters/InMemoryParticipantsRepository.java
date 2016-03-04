package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;
import net.sf.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryParticipantsRepository implements ParticipantsRepository {
  private Map<String, List<String>> participants;

  public InMemoryParticipantsRepository() {
    participants = new HashMap<>();
  }

  @Override
  public void register(String courseId) {
    registerMail(courseId, "-");
  }

  @Override
  public int countParticipants(String courseId) {
    List<String> participantsForCourse = participants.get(courseId);
    if (participantsForCourse == null) {
      return 0;
    }
    return participantsForCourse.size();
  }

  @Override
  public void registerMail(String courseCode, String email) {
    List<String> participantsForCourse = participants.get(courseCode);
    if (participantsForCourse == null) {
      participantsForCourse = new ArrayList<String>();
      participants.put(courseCode, participantsForCourse);
    }
    participantsForCourse.add(email);
  }
}
