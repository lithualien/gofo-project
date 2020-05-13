package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDaoImpl implements UserDao {

    private EntityManager entityManager;

    @Override
    public User findByUserName(String userName) {
        Session session = entityManager.unwrap(Session.class);
        Query<User> query =
                session.createQuery("from User where userName=:username", User.class)
                .setParameter("username", userName);
        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void save(User user) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(user);
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
