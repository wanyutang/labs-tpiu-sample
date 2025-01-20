package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Integer> {
}
