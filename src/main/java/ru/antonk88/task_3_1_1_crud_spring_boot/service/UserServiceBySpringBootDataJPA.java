package ru.antonk88.task_3_1_1_crud_spring_boot.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.antonk88.task_3_1_1_crud_spring_boot.model.User;
import ru.antonk88.task_3_1_1_crud_spring_boot.repository.UserCrudRepository;

import java.util.List;

@Service
@Transactional
public class UserServiceBySpringBootDataJPA implements UserService {

    private final UserCrudRepository repository;

    public UserServiceBySpringBootDataJPA(UserCrudRepository repository) {
        this.repository = repository;
    }


    @Override
    public void addUser(User user) {
        repository.save(user);
    }

    @Override
    public User getUser(Long id) {
        return repository.getById(id);
    }

    @Override
    public void updateUser(User user) {
        repository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        repository.delete(user);
    }

    @Override
    public List<User> getUsersList() {
        return repository.findAll();
    }
}
