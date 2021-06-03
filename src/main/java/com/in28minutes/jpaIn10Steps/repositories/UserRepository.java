package com.in28minutes.jpaIn10Steps.repositories;

import com.in28minutes.jpaIn10Steps.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
