package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantRepository;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;

public class RegisterParticipantTest
{
  @Rule
  public final JUnitRuleMockery context = new JUnitRuleMockery();



  @Test
  public void sadas() throws Exception
  {
    String courseId = "";
    ParticipantRepository participantsRepository = context.mock(ParticipantRepository.class);
    context.checking(new Expectations()
    {{
        oneOf(participantsRepository).register(courseId);
    }});

    RegisterParticipant registerParticipant = new RegisterParticipant(participantsRepository);
    registerParticipant.register(courseId);
  }
}
