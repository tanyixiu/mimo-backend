package com.tanyixiu.mimo.demo.controller;

import com.tanyixiu.mimo.demo.exception.ChildException;
import com.tanyixiu.mimo.demo.exception.SuperException;

public class TestController {

  public static void name() {

    try {
      int a = summ(1, 1);
      System.out.println(a);
    } catch (SuperException e) {
      System.out.println("error");
    }
  }

  private static int summ(int a, int b) {
    if (a == 1) {
      throw new ChildException("cannot be 1");
    }
    return a + b;
  }
}
