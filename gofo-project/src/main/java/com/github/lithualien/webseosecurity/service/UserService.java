package com.github.lithualien.webseosecurity.service;

import com.github.lithualien.webseosecurity.entity.User;
import com.github.lithualien.webseosecurity.user.CrmUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);
    void save(CrmUser crmUser);
}
