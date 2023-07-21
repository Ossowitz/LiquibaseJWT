package ru.iooko.LiquibaseJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iooko.LiquibaseJWT.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String name);
}
