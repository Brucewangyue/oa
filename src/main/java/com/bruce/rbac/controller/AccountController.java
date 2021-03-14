package com.bruce.rbac.controller;

import com.bruce.rbac.entity.Account;
import com.bruce.rbac.service.AccountService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("account")
public class AccountController {

    @Resource
    AccountService accountService;

    @GetMapping("list")
    public ModelAndView list(@RequestParam( required = false, defaultValue = "1") int pageIndex,
                             @RequestParam(required = false,defaultValue = "10") int pageSize,
                             String opp){
        ModelAndView mv = new ModelAndView("account/list");
        PageInfo<Account> page = accountService.page(pageIndex, pageSize);
        mv.addObject("data",page);
        return mv;
    }

    @GetMapping("create")
    public ModelAndView create(){
        return new ModelAndView("account/create");
    }

    @PostMapping("create")
    public ModelAndView create(Account account) throws Exception{
        ModelAndView mv = new ModelAndView("redirect:/account/list");
        boolean saveResult = accountService.save(account);
        if(!saveResult)
            throw new Exception("创建用户失败");

        mv.addObject("action","created");
        return mv;
    };
}
