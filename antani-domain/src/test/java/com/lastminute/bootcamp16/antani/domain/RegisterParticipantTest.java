package com.lastminute.bootcamp16.antani.domain;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;
import org.jmock.Expectations;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class RegisterParticipantTest
{
  @Rule
  public final JUnitRuleMockery context = new JUnitRuleMockery();
  private ParticipantsRepository participantsRepository;

  @Before
  public void setUp() throws Exception
  {
    participantsRepository = context.mock(ParticipantsRepository.class);
  }

  @Test
  public void registerAParticipant() throws Exception
  {
    context.checking(new Expectations()
    {{
        oneOf(participantsRepository).register("01");
    }});

    new RegisterParticipant(participantsRepository).register("01");
  }
}
