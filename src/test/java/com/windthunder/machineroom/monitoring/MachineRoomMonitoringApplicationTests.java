package com.windthunder.machineroom.monitoring;

import com.windthunder.machineroom.monitoring.domain.Accounts;
import com.windthunder.machineroom.monitoring.domain.Usr;
import com.windthunder.machineroom.monitoring.mapper.AccountsMapper;
import com.windthunder.machineroom.monitoring.mapper.UsrMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MachineRoomMonitoringApplicationTests {
    @Autowired
    private UsrMapper usrMapper;
    @Autowired
    private AccountsMapper accountsMapper;

    @Test
    void contextLoads() {
        Usr usr=usrMapper.getByUsername("杨");
        System.out.println(usr);
    }

    @Test
    void accounts() {
        List<Accounts> accountsList=accountsMapper.selectAll();
        System.out.println(accountsList);
    }

}
