package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "notifierlist")
public class Notifierlist implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "sname")
    private String sname;

    /**
     * 1.sms 短信
                                    2.phone 电话
                                    3.email 邮件
                                    4.wechat 微信
     */
    @Column(name = "`type`")
    private Short type;

    @Column(name = "pid")
    private String pid;

    @Column(name = "isenable")
    private Boolean isenable;

    @Column(name = "configInfo")
    private String configinfo;

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
     * @return sname
     */
    public String getSname() {
        return sname;
    }

    /**
     * @param sname
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取1.sms 短信
                                    2.phone 电话
                                    3.email 邮件
                                    4.wechat 微信
     *
     * @return type - 1.sms 短信
                                    2.phone 电话
                                    3.email 邮件
                                    4.wechat 微信
     */
    public Short getType() {
        return type;
    }

    /**
     * 设置1.sms 短信
                                    2.phone 电话
                                    3.email 邮件
                                    4.wechat 微信
     *
     * @param type 1.sms 短信
                                    2.phone 电话
                                    3.email 邮件
                                    4.wechat 微信
     */
    public void setType(Short type) {
        this.type = type;
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
     * @return isenable
     */
    public Boolean getIsenable() {
        return isenable;
    }

    /**
     * @param isenable
     */
    public void setIsenable(Boolean isenable) {
        this.isenable = isenable;
    }

    /**
     * @return configInfo
     */
    public String getConfiginfo() {
        return configinfo;
    }

    /**
     * @param configinfo
     */
    public void setConfiginfo(String configinfo) {
        this.configinfo = configinfo;
    }
}