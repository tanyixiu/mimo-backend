package com.tanyixiu.user.mimo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Value("${mimo.user.key}")
  private String key;

  @GetMapping("/users")
  public String getUsers() {
    return key;
  }
}
