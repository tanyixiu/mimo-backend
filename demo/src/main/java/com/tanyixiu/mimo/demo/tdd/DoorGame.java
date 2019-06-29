package com.tanyixiu.mimo.demo.tdd;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DoorGame {

  private List<Door> doors;

  public DoorGame(int doorNumbers) {
    doors = Stream.generate(Door::new).limit(doorNumbers).collect(Collectors.toList());
  }

  public List<Door> getDoors() {
    return doors;
  }

  public Door getDoors(int index) {
    if (index > doors.size() || index <= 0) {
      return null;
    }
    return doors.get(index - 1);
  }
}
