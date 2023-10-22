package ru.posluhpc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.posluhpc.crud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
