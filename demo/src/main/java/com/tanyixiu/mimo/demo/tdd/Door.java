package com.tanyixiu.mimo.demo.tdd;

public class Door {

  private boolean status = false;

  public boolean isClosed() {
    return !isOpen();
  }

  public void toggle() {
    this.status = !status;
  }

  public boolean isOpen() {
    return status;
  }
}
