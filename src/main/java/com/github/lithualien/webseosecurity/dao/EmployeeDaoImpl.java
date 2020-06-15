package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {

    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Employee> all() {
        Session session = entityManager.unwrap(Session.class);
        Query<Employee> query =
                session.createQuery("from Employee ", Employee.class);
        return query.getResultList();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
