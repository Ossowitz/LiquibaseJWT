package ru.iooko.LiquibaseJWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iooko.LiquibaseJWT.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
