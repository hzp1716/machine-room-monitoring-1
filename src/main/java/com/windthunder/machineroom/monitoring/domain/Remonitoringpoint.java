package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "remonitoringpoint")
public class Remonitoringpoint implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`no`")
    private Integer no;

    @Column(name = "`name`")
    private String name;

    @Column(name = "pid")
    private String pid;

    @Column(name = "enablealarm")
    private Boolean enablealarm;

    /**
     * description            
            min                    
            max                    
            rwmode                 
            valuetype              
            oid                    
            stateenum              
            upperlimit             
            lowerlimit             
            nearupperlimit         
            nearlowerlimit          
            ul_alarm_level         
            nul_alarm_level        
            normalstate            
            hysteresis             
            alarmdelayway          
            value_hys              
            ultra_hilimit          
            ultra_lowlimit         
            ultra_level            
            limitway               
            unit     
            alarmpriority
            uigroup
     */
    @Column(name = "model")
    private byte[] model;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * @param no
     */
    public void setNo(Integer no) {
        this.no = no;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * @param pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return enablealarm
     */
    public Boolean getEnablealarm() {
        return enablealarm;
    }

    /**
     * @param enablealarm
     */
    public void setEnablealarm(Boolean enablealarm) {
        this.enablealarm = enablealarm;
    }

    /**
     * 获取description            
            min                    
            max                    
            rwmode                 
            valuetype              
            oid                    
            stateenum              
            upperlimit             
            lowerlimit             
            nearupperlimit         
            nearlowerlimit          
            ul_alarm_level         
            nul_alarm_level        
            normalstate            
            hysteresis             
            alarmdelayway          
            value_hys              
            ultra_hilimit          
            ultra_lowlimit         
            ultra_level            
            limitway               
            unit     
            alarmpriority
            uigroup
     *
     * @return model - description            
            min                    
            max                    
            rwmode                 
            valuetype              
            oid                    
            stateenum              
            upperlimit             
            lowerlimit             
            nearupperlimit         
            nearlowerlimit          
            ul_alarm_level         
            nul_alarm_level        
            normalstate            
            hysteresis             
            alarmdelayway          
            value_hys              
            ultra_hilimit          
            ultra_lowlimit         
            ultra_level            
            limitway               
            unit     
            alarmpriority
            uigroup
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置description            
            min                    
            max                    
            rwmode                 
            valuetype              
            oid                    
            stateenum              
            upperlimit             
            lowerlimit             
            nearupperlimit         
            nearlowerlimit          
            ul_alarm_level         
            nul_alarm_level        
            normalstate            
            hysteresis             
            alarmdelayway          
            value_hys              
            ultra_hilimit          
            ultra_lowlimit         
            ultra_level            
            limitway               
            unit     
            alarmpriority
            uigroup
     *
     * @param model description            
            min                    
            max                    
            rwmode                 
            valuetype              
            oid                    
            stateenum              
            upperlimit             
            lowerlimit             
            nearupperlimit         
            nearlowerlimit          
            ul_alarm_level         
            nul_alarm_level        
            normalstate            
            hysteresis             
            alarmdelayway          
            value_hys              
            ultra_hilimit          
            ultra_lowlimit         
            ultra_level            
            limitway               
            unit     
            alarmpriority
            uigroup
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}