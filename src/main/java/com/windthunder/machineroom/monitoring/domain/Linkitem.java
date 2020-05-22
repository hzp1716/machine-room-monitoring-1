package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "linkitem")
public class Linkitem implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "linkdst")
    private String linkdst;

    @Column(name = "pid")
    private String pid;

    /**
     * 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    @Column(name = "linkdsttype")
    private Byte linkdsttype;

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
     * @return linkdst
     */
    public String getLinkdst() {
        return linkdst;
    }

    /**
     * @param linkdst
     */
    public void setLinkdst(String linkdst) {
        this.linkdst = linkdst;
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
     * 获取0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @return linkdsttype - 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public Byte getLinkdsttype() {
        return linkdsttype;
    }

    /**
     * 设置0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @param linkdsttype 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public void setLinkdsttype(Byte linkdsttype) {
        this.linkdsttype = linkdsttype;
    }
}