package com.lastminute.bootcamp16.antani.adapters;

import com.lastminute.bootcamp16.antani.domain.ports.ParticipantsRepository;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class InMemoryParticipantsRepositoryTest
{

  @Test
  public void noParticipants()
  {
    ParticipantsRepository repository = new InMemoryParticipantsRepository();
    assertThat(repository.countParticipants("01"), is(0));
  }

}
