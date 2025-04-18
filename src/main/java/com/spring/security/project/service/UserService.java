package com.spring.security.project.service;

import com.spring.security.project.model.Role;
import com.spring.security.project.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String name);

    User getUser(String username);

    List<User> getUsers();
}
