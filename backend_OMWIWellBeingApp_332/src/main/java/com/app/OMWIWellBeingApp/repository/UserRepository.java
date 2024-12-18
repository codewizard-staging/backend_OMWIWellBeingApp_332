package com.app.OMWIWellBeingApp.repository;

import com.app.OMWIWellBeingApp.model.User;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class UserRepository extends SimpleJpaRepository<User, String> {
    private final EntityManager em;
    public UserRepository(EntityManager em) {
        super(User.class, em);
        this.em = em;
    }
    @Override
    public List<User> findAll() {
        return em.createNativeQuery("Select * from \"omwiwellbeingapp_733\".\"User\"", User.class).getResultList();
    }
}