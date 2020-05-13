package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    void save(User user);
}
