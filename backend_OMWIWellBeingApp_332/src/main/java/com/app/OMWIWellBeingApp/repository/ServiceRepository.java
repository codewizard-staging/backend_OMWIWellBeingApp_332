package com.app.OMWIWellBeingApp.repository;

import com.app.OMWIWellBeingApp.model.Service;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class ServiceRepository extends SimpleJpaRepository<Service, String> {
    private final EntityManager em;
    public ServiceRepository(EntityManager em) {
        super(Service.class, em);
        this.em = em;
    }
    @Override
    public List<Service> findAll() {
        return em.createNativeQuery("Select * from \"omwiwellbeingapp_733\".\"Service\"", Service.class).getResultList();
    }
}