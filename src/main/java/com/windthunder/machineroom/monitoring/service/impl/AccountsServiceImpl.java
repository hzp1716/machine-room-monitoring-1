package com.windthunder.machineroom.monitoring.service.impl;

import com.windthunder.machineroom.monitoring.domain.Accounts;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.windthunder.machineroom.monitoring.mapper.AccountsMapper;
import com.windthunder.machineroom.monitoring.service.AccountsService;

import java.util.List;

@Service
public class AccountsServiceImpl implements AccountsService{

    @Resource
    private AccountsMapper accountsMapper;

    @Override
    public List<Accounts> selectAll() {
        return accountsMapper.selectAll();
    }

    @Override
    public List<Accounts> findByAll(Accounts accounts) {
        return accountsMapper.findByAll(accounts);
    }
}
