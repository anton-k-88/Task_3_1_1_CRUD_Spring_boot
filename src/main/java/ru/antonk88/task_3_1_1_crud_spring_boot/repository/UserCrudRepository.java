package ru.antonk88.task_3_1_1_crud_spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.antonk88.task_3_1_1_crud_spring_boot.model.User;

@Repository
public interface UserCrudRepository extends JpaRepository<User, Long> {

}
