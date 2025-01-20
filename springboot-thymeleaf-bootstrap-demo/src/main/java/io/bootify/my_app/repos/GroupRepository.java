package io.bootify.my_app.repos;

import io.bootify.my_app.domain.Group;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GroupRepository extends JpaRepository<Group, String> {
}
