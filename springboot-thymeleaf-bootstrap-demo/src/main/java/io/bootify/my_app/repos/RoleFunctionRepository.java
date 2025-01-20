package io.bootify.my_app.repos;

import io.bootify.my_app.domain.RoleFunction;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleFunctionRepository extends JpaRepository<RoleFunction, Integer> {
}
