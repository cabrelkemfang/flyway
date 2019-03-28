package com.example.flyway.controller;

import com.example.flyway.domain.User;
import com.example.flyway.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserRepo userRepo;

  @RequestMapping(value = "/user", method = RequestMethod.GET)
  public List<User> getAllUSer() {
    List<User> userList = this.userRepo.findAll();
    return userList;
  }
}
