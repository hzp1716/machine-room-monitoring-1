package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "linkalarm")
public class Linkalarm implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "linksrc")
    private String linksrc;

    /**
     * 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    @Column(name = "linksrctype")
    private Byte linksrctype;

    @Column(name = "linkvalue")
    private Boolean linkvalue;

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
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return linksrc
     */
    public String getLinksrc() {
        return linksrc;
    }

    /**
     * @param linksrc
     */
    public void setLinksrc(String linksrc) {
        this.linksrc = linksrc;
    }

    /**
     * 获取0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @return linksrctype - 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public Byte getLinksrctype() {
        return linksrctype;
    }

    /**
     * 设置0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @param linksrctype 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public void setLinksrctype(Byte linksrctype) {
        this.linksrctype = linksrctype;
    }

    /**
     * @return linkvalue
     */
    public Boolean getLinkvalue() {
        return linkvalue;
    }

    /**
     * @param linkvalue
     */
    public void setLinkvalue(Boolean linkvalue) {
        this.linkvalue = linkvalue;
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