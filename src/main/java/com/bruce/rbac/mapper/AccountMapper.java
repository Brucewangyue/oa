package com.bruce.rbac.mapper;

import com.bruce.rbac.entity.Account;
import java.util.List;

public interface AccountMapper {
    List<Account> page();

    int save(Account account);

    Account findWithPermission(String username,String password);
}
