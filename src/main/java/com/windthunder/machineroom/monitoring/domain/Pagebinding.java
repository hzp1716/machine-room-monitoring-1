package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pagebinding")
public class Pagebinding implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "pageid")
    private String pageid;

    /**
     * 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    @Column(name = "BindScript")
    private byte[] bindscript;

    @Column(name = "BindDst")
    private byte[] binddst;

    @Column(name = "BindSrc")
    private byte[] bindsrc;

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
     * @return pageid
     */
    public String getPageid() {
        return pageid;
    }

    /**
     * @param pageid
     */
    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    /**
     * 获取0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @return BindScript - 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public byte[] getBindscript() {
        return bindscript;
    }

    /**
     * 设置0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @param bindscript 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public void setBindscript(byte[] bindscript) {
        this.bindscript = bindscript;
    }

    /**
     * @return BindDst
     */
    public byte[] getBinddst() {
        return binddst;
    }

    /**
     * @param binddst
     */
    public void setBinddst(byte[] binddst) {
        this.binddst = binddst;
    }

    /**
     * @return BindSrc
     */
    public byte[] getBindsrc() {
        return bindsrc;
    }

    /**
     * @param bindsrc
     */
    public void setBindsrc(byte[] bindsrc) {
        this.bindsrc = bindsrc;
    }
}