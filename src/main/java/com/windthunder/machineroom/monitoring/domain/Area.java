package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "area")
public class Area implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`no`")
    private Integer no;

    @Column(name = "`name`")
    private String name;

    /**
     * 关联页面id
     */
    @Column(name = "pageid")
    private String pageid;

    /**
     * 工程id
     */
    @Column(name = "pid")
    private String pid;

    @Column(name = "selfpid")
    private String selfpid;

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
     * 获取关联页面id
     *
     * @return pageid - 关联页面id
     */
    public String getPageid() {
        return pageid;
    }

    /**
     * 设置关联页面id
     *
     * @param pageid 关联页面id
     */
    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    /**
     * 获取工程id
     *
     * @return pid - 工程id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置工程id
     *
     * @param pid 工程id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * @return selfpid
     */
    public String getSelfpid() {
        return selfpid;
    }

    /**
     * @param selfpid
     */
    public void setSelfpid(String selfpid) {
        this.selfpid = selfpid;
    }
}