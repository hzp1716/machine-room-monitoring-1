package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "subsys_access_door")
public class SubsysAccessDoor implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 设备ID
     */
    @Column(name = "pid")
    private String pid;

    /**
     * 门名称
     */
    @Column(name = "`name`")
    private String name;

    @Column(name = "sensortype")
    private Integer sensortype;

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
     * 获取设备ID
     *
     * @return pid - 设备ID
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置设备ID
     *
     * @param pid 设备ID
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取门名称
     *
     * @return name - 门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置门名称
     *
     * @param name 门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sensortype
     */
    public Integer getSensortype() {
        return sensortype;
    }

    /**
     * @param sensortype
     */
    public void setSensortype(Integer sensortype) {
        this.sensortype = sensortype;
    }
}