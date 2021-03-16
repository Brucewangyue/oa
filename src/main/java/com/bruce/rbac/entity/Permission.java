package com.bruce.rbac.entity;

import lombok.Data;

@Data
public class Permission {
    private int id;
    private String name;
    private String url;
    private boolean c;
    private boolean r;
    private boolean u;
    private boolean d;
}
