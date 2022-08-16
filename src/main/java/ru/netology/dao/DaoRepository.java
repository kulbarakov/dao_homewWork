package ru.netology.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;


@Repository
public class DaoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public String getProductName(String name) {
        Query query = entityManager.createQuery("select o.productName from Order o where o.customer.name = :name");
        query.setParameter("name", name);
        return query.getResultList().toString();
    }
}
