package com.walton.one.direction.waltonOneDirection.repository;

import com.walton.one.direction.waltonOneDirection.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<OurUsers, Integer> {
    Optional<OurUsers> findByEmail(String email);
}
