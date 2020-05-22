package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "subsys_access_device")
public class SubsysAccessDevice implements Serializable {
    /**
     * 设备ID
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 工程ID
     */
    @Column(name = "prjid")
    private String prjid;

    /**
     * 设备名称,设备类型,IP地址,端口号,波特率,超时时间,密码,门数量
     */
    @Column(name = "model")
    private byte[] model;

    private static final long serialVersionUID = 1L;

    /**
     * 获取设备ID
     *
     * @return id - 设备ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置设备ID
     *
     * @param id 设备ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取工程ID
     *
     * @return prjid - 工程ID
     */
    public String getPrjid() {
        return prjid;
    }

    /**
     * 设置工程ID
     *
     * @param prjid 工程ID
     */
    public void setPrjid(String prjid) {
        this.prjid = prjid;
    }

    /**
     * 获取设备名称,设备类型,IP地址,端口号,波特率,超时时间,密码,门数量
     *
     * @return model - 设备名称,设备类型,IP地址,端口号,波特率,超时时间,密码,门数量
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置设备名称,设备类型,IP地址,端口号,波特率,超时时间,密码,门数量
     *
     * @param model 设备名称,设备类型,IP地址,端口号,波特率,超时时间,密码,门数量
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}