package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Role;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class RoleDaoImpl implements RoleDao {

    private EntityManager entityManager;

    @Override
    public Role findRoleByName(String theRoleName) {
        Session session = entityManager.unwrap(Session.class);
        Query<Role> query = session.createQuery("from Role where name=:roleName", Role.class)
                .setParameter("roleName", theRoleName);

        try {
            return query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
