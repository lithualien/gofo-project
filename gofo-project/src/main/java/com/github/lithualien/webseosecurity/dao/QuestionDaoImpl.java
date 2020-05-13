package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Question;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
public class QuestionDaoImpl implements QuestionDao {

    private EntityManager entityManager;

    @Override
    @Transactional
    public void addQuestion(Question question) {
        Session session = entityManager.unwrap(Session.class);
        session.save(question);
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


}
