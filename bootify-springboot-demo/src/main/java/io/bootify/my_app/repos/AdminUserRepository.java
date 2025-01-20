package io.bootify.my_app.repos;

import io.bootify.my_app.domain.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AdminUserRepository extends JpaRepository<AdminUser, String> {
}
