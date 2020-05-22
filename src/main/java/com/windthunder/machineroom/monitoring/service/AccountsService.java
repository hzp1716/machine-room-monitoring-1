package com.windthunder.machineroom.monitoring.service;

import com.windthunder.machineroom.monitoring.domain.Accounts;

import java.util.List;

public interface AccountsService{
    List<Accounts> selectAll();
    List<Accounts> findByAll(Accounts accounts);

}
