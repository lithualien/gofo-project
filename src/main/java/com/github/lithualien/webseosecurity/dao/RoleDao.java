package com.github.lithualien.webseosecurity.dao;

import com.github.lithualien.webseosecurity.entity.Role;

public interface RoleDao {

    Role findRoleByName(String theRoleName);
}
