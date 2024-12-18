package com.app.OMWIWellBeingApp.repository;

import com.app.OMWIWellBeingApp.model.Practitioner;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class PractitionerRepository extends SimpleJpaRepository<Practitioner, String> {
    private final EntityManager em;
    public PractitionerRepository(EntityManager em) {
        super(Practitioner.class, em);
        this.em = em;
    }
    @Override
    public List<Practitioner> findAll() {
        return em.createNativeQuery("Select * from \"omwiwellbeingapp_733\".\"Practitioner\"", Practitioner.class).getResultList();
    }
}