package com.smu.healthcareapp.repository;

import com.smu.healthcareapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
