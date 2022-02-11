package com.projects.youresume.dao_int;

import com.projects.youresume.model.User;

import java.util.List;

public interface UserDAOInter {
    public List<User> getAllUsers();
    public User getUserById();
    public void addUser();
    public void updateUser();
    public void deleteUser();
}
