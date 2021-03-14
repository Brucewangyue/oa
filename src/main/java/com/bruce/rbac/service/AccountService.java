package com.bruce.rbac.service;

import com.bruce.rbac.entity.Account;
import com.bruce.rbac.mapper.AccountMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AccountService {

    @Resource
    AccountMapper accountMapper;

    public PageInfo<Account> page(int pageIndex, int pageSize) {
        PageHelper.startPage(pageIndex, pageSize);
        List<Account> accounts = accountMapper.page();
        return new PageInfo(accounts);
    }

    public boolean save(Account account) {
        int inserted = accountMapper.save(account);
        return inserted > 0;
    }
}
