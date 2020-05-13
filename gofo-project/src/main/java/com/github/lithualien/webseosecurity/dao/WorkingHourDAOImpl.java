package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.WorkableDay;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class WorkingHourDAOImpl implements WorkingHourDAO {

    private EntityManager entityManager;

    @Override
    @Transactional
    public List<WorkableDay> show(int employeeId) {
        Session session = entityManager.unwrap(Session.class);
        Query<WorkableDay> query =
                session.createQuery("from WorkableDay where employee_id = :id", WorkableDay.class)
                    .setParameter("id", employeeId);
        return query.getResultList();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
