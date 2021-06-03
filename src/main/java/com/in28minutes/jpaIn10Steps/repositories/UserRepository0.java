package com.in28minutes.jpaIn10Steps.repositories;

import com.in28minutes.jpaIn10Steps.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepository0 {
    @PersistenceContext
    private EntityManager entityManager;

    public Long saveUser(User user) {
        entityManager.persist(user);

        return user.getId();
    }
}
