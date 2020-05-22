package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "accounts")
public class Accounts implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "account")
    private String account;

    @Column(name = "paswd")
    private String paswd;

    @Column(name = "roleid")
    private String roleid;

    /**
     * 0：删除
                                    1：使用中
     */
    @Column(name = "`status`")
    private Integer status;

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
     * @return account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return paswd
     */
    public String getPaswd() {
        return paswd;
    }

    /**
     * @param paswd
     */
    public void setPaswd(String paswd) {
        this.paswd = paswd;
    }

    /**
     * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    /**
     * 获取0：删除
                                    1：使用中
     *
     * @return status - 0：删除
                                    1：使用中
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0：删除
                                    1：使用中
     *
     * @param status 0：删除
                                    1：使用中
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "id='" + id + '\'' +
                ", account='" + account + '\'' +
                ", paswd='" + paswd + '\'' +
                ", roleid='" + roleid + '\'' +
                ", status=" + status +
                '}';
    }
}