package com.bruce.rbac.controller;

import com.bruce.rbac.entity.Permission;
import com.bruce.rbac.service.PermissionService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("permission")
public class PermissionController {

    @Resource
    PermissionService permissionService;

    @GetMapping("save")
    public String save(){
        Permission permission = permissionService.getById(1);
        System.out.println(permission);
        return "role/list";
    }
}
