package com.bruce.rbac.entity;

import lombok.Data;
//import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
public class Account {
    private int id;
    private String userName;
    private String password;
    private String nickName;
    private Date birthday;
    private List<Role> roles;
    private List<Permission> permissions;
}
