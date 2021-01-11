package com.spring.springbootstrap.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.springbootstrap.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByRole(String role);
}
