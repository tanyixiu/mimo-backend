package com.tanyixiu.mimo.demo.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DoorTest {

  @Test
  public void should_init_a_closed_door_success() {
    Door door = new Door();
    assertThat(door.isClosed()).isTrue();
  }

  @Test
  public void should_change_door_status_success_when_toggle_it() {
    Door door = new Door();
    boolean previousStatus = door.isClosed();

    door.toggle();
    boolean afterStatus = door.isClosed();

    assertThat(previousStatus).isNotEqualTo(afterStatus);
  }

  @Test
  public void should_door_be_open_when_toggle_it_from_closed_status() {
    Door door = new Door();
    door.toggle();
    assertThat(door.isOpen()).isTrue();

  }
}
