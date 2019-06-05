package com.myk.learning.jwt.mapper;

import com.myk.learning.jwt.model.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}