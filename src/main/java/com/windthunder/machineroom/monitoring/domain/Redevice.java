package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "redevice")
public class Redevice implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "enablealarm")
    private Boolean enablealarm;

    /**
     * description
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
            alarm_level
            hysteresis
            alarmdelayway
            
     */
    @Column(name = "model")
    private byte[] model;

    @Column(name = "proto")
    private String proto;

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
            alarm_level
            hysteresis
            alarmdelayway
            
     *
     * @return model - description
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
            alarm_level
            hysteresis
            alarmdelayway
            
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置description
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
            alarm_level
            hysteresis
            alarmdelayway
            
     *
     * @param model description
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
            alarm_level
            hysteresis
            alarmdelayway
            
     */
    public void setModel(byte[] model) {
        this.model = model;
    }

    /**
     * @return proto
     */
    public String getProto() {
        return proto;
    }

    /**
     * @param proto
     */
    public void setProto(String proto) {
        this.proto = proto;
    }
}