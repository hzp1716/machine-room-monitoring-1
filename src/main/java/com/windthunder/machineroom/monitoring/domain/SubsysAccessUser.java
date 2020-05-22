package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "subsys_access_user")
public class SubsysAccessUser implements Serializable {
    /**
     * id
     */
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 所属设备ID
     */
    @Column(name = "deviceid")
    private String deviceid;

    /**
     * 密码，门权限，用户组，是否超级用户
     */
    @Column(name = "`password`")
    private String password;

    /**
     * 卡号
     */
    @Column(name = "userid")
    private String userid;

    @Column(name = "model")
    private byte[] model;

    private static final long serialVersionUID = 1L;

    /**
     * 获取id
     *
     * @return id - id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取所属设备ID
     *
     * @return deviceid - 所属设备ID
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * 设置所属设备ID
     *
     * @param deviceid 所属设备ID
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * 获取密码，门权限，用户组，是否超级用户
     *
     * @return password - 密码，门权限，用户组，是否超级用户
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码，门权限，用户组，是否超级用户
     *
     * @param password 密码，门权限，用户组，是否超级用户
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取卡号
     *
     * @return userid - 卡号
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置卡号
     *
     * @param userid 卡号
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return model
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}