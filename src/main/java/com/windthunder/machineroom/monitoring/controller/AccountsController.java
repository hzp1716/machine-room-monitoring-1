package com.windthunder.machineroom.monitoring.controller;

import com.windthunder.machineroom.monitoring.domain.Accounts;
import com.windthunder.machineroom.monitoring.mapper.AccountsMapper;
import com.windthunder.machineroom.monitoring.service.AccountsService;
import com.windthunder.machineroom.monitoring.service.impl.AccountsServiceImpl;
import com.windthunder.machineroom.monitoring.service.impl.DeviceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import tk.mybatis.mapper.util.StringUtil;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class AccountsController {
    @Autowired
    private AccountsService accountsService;

    @ResponseBody
    @RequestMapping("/accounts/list")
    public List<Accounts> accountsList(){
        List<Accounts> accountsList=accountsService.selectAll();
        return accountsList;
    }


    @ResponseBody
    @RequestMapping("/login")
    public String login(Accounts accounts, Map<String,Object> map, HttpSession httpSession) {

        if (accountsService.findByAll(accounts).equals("qw")) {
            httpSession.setAttribute("user", accountsService.findByAll(accounts));
            return "success";
        }
        else {
            map.put("msg","没有权限请登录");
            return "fail";
        }
    }
}
