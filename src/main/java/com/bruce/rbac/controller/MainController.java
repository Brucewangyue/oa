package com.bruce.rbac.controller;

import com.bruce.rbac.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
public class MainController {

    @Resource
    AccountService accountService;

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");

        return mv;
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @PostMapping("login")
    public String login(@RequestParam() String username,@RequestParam() String password){



        return "redirect:/";
    }
}
