package com.myk.learning.jwt.mapper;

import com.myk.learning.jwt.model.UserRole;

public interface UserRoleMapper {
    boolean insert(UserRole record);

    boolean insertSelective(UserRole record);
}