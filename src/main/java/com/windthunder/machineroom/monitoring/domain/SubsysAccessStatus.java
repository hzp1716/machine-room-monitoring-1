package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "subsys_access_status")
public class SubsysAccessStatus implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 工程ＩＤ
     */
    @Column(name = "prjid")
    private String prjid;

    /**
     * 设备ＩＤ
     */
    @Column(name = "deviceid")
    private String deviceid;

    /**
     * 时间,门状态，报警状态
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
     * 获取工程ＩＤ
     *
     * @return prjid - 工程ＩＤ
     */
    public String getPrjid() {
        return prjid;
    }

    /**
     * 设置工程ＩＤ
     *
     * @param prjid 工程ＩＤ
     */
    public void setPrjid(String prjid) {
        this.prjid = prjid;
    }

    /**
     * 获取设备ＩＤ
     *
     * @return deviceid - 设备ＩＤ
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置设备ＩＤ
     *
     * @param deviceid 设备ＩＤ
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取时间,门状态，报警状态
     *
     * @return model - 时间,门状态，报警状态
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置时间,门状态，报警状态
     *
     * @param model 时间,门状态，报警状态
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}