package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "periodsitem")
public class Periodsitem implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "begintime")
    private Date begintime;

    @Column(name = "endtime")
    private Date endtime;

    @Column(name = "week")
    private Short week;

    @Column(name = "pid")
    private String pid;

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
     * @return begintime
     */
    public Date getBegintime() {
        return begintime;
    }

    /**
     * @param begintime
     */
    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    /**
     * @return endtime
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * @return week
     */
    public Short getWeek() {
        return week;
    }

    /**
     * @param week
     */
    public void setWeek(Short week) {
        this.week = week;
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