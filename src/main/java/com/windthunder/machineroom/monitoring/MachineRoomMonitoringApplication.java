package com.windthunder.machineroom.monitoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import tk.mybatis.spring.annotation.MapperScan;

@EnableAsync
@SpringBootApplication
@MapperScan(basePackages = "com.windthunder.machineroom.monitoring.mapper")
public class MachineRoomMonitoringApplication {

    public static void main(String[] args) {
        SpringApplication.run(MachineRoomMonitoringApplication.class, args);
    }

}

