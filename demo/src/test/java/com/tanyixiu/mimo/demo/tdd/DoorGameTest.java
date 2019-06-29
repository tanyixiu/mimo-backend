package com.tanyixiu.mimo.demo.tdd;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class DoorGameTest {

  @Test
  public void should_init_doors_success() {
    int doorNumbers = 100;
    DoorGame doorGame = new DoorGame(doorNumbers);
    assertThat(doorGame.getDoors()).isNotNull();
    assertThat(doorGame.getDoors().size()).isEqualTo(doorNumbers);
  }

  @Test
  public void should_get_door_success_from_door_game() {
    DoorGame doorGame = new DoorGame(100);
    Door doorNo2 = doorGame.getDoors(2);
    Door doorNo100 = doorGame.getDoors(100);
    Door doorNo0 = doorGame.getDoors(0);
    Door doorNo101 = doorGame.getDoors(101);
    assertThat(doorNo2).isNotNull();
    assertThat(doorNo100).isNotNull();
    assertThat(doorNo0).isNull();
    assertThat(doorNo101).isNull();

    // Question: 在TDD的实践中，可以有多个assert吗
    // 这种情况，是否用junit5 比较好
  }

  @Test
  public void should_() {}
}
