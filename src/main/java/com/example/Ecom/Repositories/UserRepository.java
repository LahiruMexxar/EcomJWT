package com.example.Ecom.Repositories;

import com.example.Ecom.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository <User, Integer>{

    Optional<User>findByEmail(String email);

    boolean existsByEmail(String email);
}
