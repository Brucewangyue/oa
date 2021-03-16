package com.bruce.rbac.controller;

import com.bruce.rbac.core.Result;
import com.bruce.rbac.entity.Account;
import com.bruce.rbac.service.AccountService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    @ResponseBody
//    public Object create(@RequestBody() Account account) throws Exception{ ###@RequestBody 需要客户端传送一串json字符串
    public Object create(Account account) throws Exception{
        boolean saveResult = accountService.save(account);
        if(!saveResult)
            return new Result("创建用户失败");

        return new Result(account);
    };
}
