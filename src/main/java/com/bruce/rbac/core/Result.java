package com.bruce.rbac.core;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class Result {
    private String message;
    private Object data;
    private boolean success;

    public Result() {
    }

    public Result(Object data) {
        this.data = data;
        this.success = true;
        this.message = "success";
    }

    public Result(String message, Object data, boolean success) {
        this.message = message;
        this.data = data;
        this.success = success;
    }
}
