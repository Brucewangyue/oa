package com.bruce.rbac.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bruce.rbac.entity.Permission;
import com.bruce.rbac.mapper.PermissionMapper;
import org.springframework.stereotype.Service;

@Service
public class PermissionService extends ServiceImpl<PermissionMapper, Permission> {
}
