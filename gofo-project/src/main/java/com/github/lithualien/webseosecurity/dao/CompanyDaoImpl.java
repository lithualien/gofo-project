package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.*;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CompanyDaoImpl implements CompanyDAO {

    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Company> all() {
        Session session = entityManager.unwrap(Session.class);
        Query<Company> query =
                session.createQuery("from Company", Company.class);
        return query.getResultList();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
