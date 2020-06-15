package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Rank;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class RankDaoImpl implements RankDAO {

    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Rank> show(int companyId) {
        Session session = entityManager.unwrap(Session.class);
        Query<Rank> query =
                session.createQuery("from Rank where company_id = :id", Rank.class)
                        .setParameter("id", companyId);
        return query.getResultList();
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
