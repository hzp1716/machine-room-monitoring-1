package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "device")
public class Device implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "pid")
    private String pid;

    @Column(name = "devaddr")
    private Integer devaddr;

    @Column(name = "periodsid")
    private String periodsid;

    @Column(name = "protoid")
    private String protoid;

    @Column(name = "areaid")
    private String areaid;

    @Column(name = "enablealarm")
    private Boolean enablealarm;

    /**
     * no
            ipaddr
            ipport
            useraccount
            password
            alarm_level
            overrided
            description
            devicetype
            hysteresis
            alarmdelayway
            brand
            model
            vendor
            mandate
            category
            max_input
            min_input
            max_measure
            min_measure
            oid
            
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
     * @return devaddr
     */
    public Integer getDevaddr() {
        return devaddr;
    }

    /**
     * @param devaddr
     */
    public void setDevaddr(Integer devaddr) {
        this.devaddr = devaddr;
    }

    /**
     * @return periodsid
     */
    public String getPeriodsid() {
        return periodsid;
    }

    /**
     * @param periodsid
     */
    public void setPeriodsid(String periodsid) {
        this.periodsid = periodsid;
    }

    /**
     * @return protoid
     */
    public String getProtoid() {
        return protoid;
    }

    /**
     * @param protoid
     */
    public void setProtoid(String protoid) {
        this.protoid = protoid;
    }

    /**
     * @return areaid
     */
    public String getAreaid() {
        return areaid;
    }

    /**
     * @param areaid
     */
    public void setAreaid(String areaid) {
        this.areaid = areaid;
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
     * 获取no
            ipaddr
            ipport
            useraccount
            password
            alarm_level
            overrided
            description
            devicetype
            hysteresis
            alarmdelayway
            brand
            model
            vendor
            mandate
            category
            max_input
            min_input
            max_measure
            min_measure
            oid
            
     *
     * @return model - no
            ipaddr
            ipport
            useraccount
            password
            alarm_level
            overrided
            description
            devicetype
            hysteresis
            alarmdelayway
            brand
            model
            vendor
            mandate
            category
            max_input
            min_input
            max_measure
            min_measure
            oid
            
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置no
            ipaddr
            ipport
            useraccount
            password
            alarm_level
            overrided
            description
            devicetype
            hysteresis
            alarmdelayway
            brand
            model
            vendor
            mandate
            category
            max_input
            min_input
            max_measure
            min_measure
            oid
            
     *
     * @param model no
            ipaddr
            ipport
            useraccount
            password
            alarm_level
            overrided
            description
            devicetype
            hysteresis
            alarmdelayway
            brand
            model
            vendor
            mandate
            category
            max_input
            min_input
            max_measure
            min_measure
            oid
            
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}