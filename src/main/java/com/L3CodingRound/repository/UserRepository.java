package com.L3CodingRound.repository;

import com.L3CodingRound.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
