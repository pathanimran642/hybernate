package com.edusol.hyb.service;

import java.util.List;

import com.edusol.hyb.bean.User;

public interface UserService {
    public void createUser(User user);
    public List<User> getUser();
    public User findById(int id);
    public User update(User user, int id);
    public void deleteUserById(int id);
    public User updatePartially(User user, int id);
}