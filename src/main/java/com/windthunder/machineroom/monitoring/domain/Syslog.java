package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "syslog")
public class Syslog implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "operatetime")
    private Date operatetime;

    @Column(name = "accuntid")
    private String accuntid;

    /**
     * 1添加add/create
                        2修改update/modify
                        3删除delete
                        4其他0登入1登出
     */
    @Column(name = "`type`")
    private Integer type;

    /**
     * 操作对象的名称或表的名称
     */
    @Column(name = "operateobj")
    private String operateobj;

    @Column(name = "content")
    private String content;

    @Column(name = "usrname")
    private String usrname;

    @Column(name = "pid")
    private String pid;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return operatetime
     */
    public Date getOperatetime() {
        return operatetime;
    }

    /**
     * @param operatetime
     */
    public void setOperatetime(Date operatetime) {
        this.operatetime = operatetime;
    }

    /**
     * @return accuntid
     */
    public String getAccuntid() {
        return accuntid;
    }

    /**
     * @param accuntid
     */
    public void setAccuntid(String accuntid) {
        this.accuntid = accuntid;
    }

    /**
     * 获取1添加add/create
                        2修改update/modify
                        3删除delete
                        4其他0登入1登出
     *
     * @return type - 1添加add/create
                        2修改update/modify
                        3删除delete
                        4其他0登入1登出
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1添加add/create
                        2修改update/modify
                        3删除delete
                        4其他0登入1登出
     *
     * @param type 1添加add/create
                        2修改update/modify
                        3删除delete
                        4其他0登入1登出
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取操作对象的名称或表的名称
     *
     * @return operateobj - 操作对象的名称或表的名称
     */
    public String getOperateobj() {
        return operateobj;
    }

    /**
     * 设置操作对象的名称或表的名称
     *
     * @param operateobj 操作对象的名称或表的名称
     */
    public void setOperateobj(String operateobj) {
        this.operateobj = operateobj;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return usrname
     */
    public String getUsrname() {
        return usrname;
    }

    /**
     * @param usrname
     */
    public void setUsrname(String usrname) {
        this.usrname = usrname;
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
}