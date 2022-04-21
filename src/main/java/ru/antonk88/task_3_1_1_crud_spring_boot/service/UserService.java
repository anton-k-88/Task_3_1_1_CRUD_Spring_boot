package ru.antonk88.task_3_1_1_crud_spring_boot.service;


import ru.antonk88.task_3_1_1_crud_spring_boot.model.User;

import java.util.List;


public interface UserService {

    void addUser(User user);

    User getUser(Long id);

    void updateUser(User user);

    void deleteUser(User user);

    List<User> getUsersList();
}
