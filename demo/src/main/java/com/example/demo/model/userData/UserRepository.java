package com.example.demo.model.userData;

import com.example.demo.model.jpa.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserId(Long userId);

    Optional<User> joinUser(Long userId);
}
