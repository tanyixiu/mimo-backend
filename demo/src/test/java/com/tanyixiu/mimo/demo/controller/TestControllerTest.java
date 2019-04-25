package com.tanyixiu.mimo.demo.controller;

import org.junit.Test;

public class TestControllerTest {

  @Test
  public void name() {
    try {
      int a[] = {1, 2, 3};
      System.out.println(a[3]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println(ex.getMessage());
    }
  }
}
