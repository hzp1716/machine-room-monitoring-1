package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "chart")
public class Chart implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pid")
    private String pid;

    @Column(name = "charttitle")
    private String charttitle;

    @Column(name = "chartstyle")
    private Short chartstyle;

    /**
     * 报表类型
                                    0：日报
                                    1：周报
                                    2：月报
                                    3：年报
     */
    @Column(name = "rtype")
    private Short rtype;

    /**
     * 0：设备报警
                                    1：测点报警
                                    2：历史数据
     */
    @Column(name = "statisticaltype")
    private Short statisticaltype;

    @Column(name = "isautoreport")
    private Boolean isautoreport;

    @Column(name = "customdtime")
    private String customdtime;

    @Column(name = "charttaguuid")
    private String charttaguuid;

    @Column(name = "reportResuuid")
    private String reportresuuid;

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
     * @return charttitle
     */
    public String getCharttitle() {
        return charttitle;
    }

    /**
     * @param charttitle
     */
    public void setCharttitle(String charttitle) {
        this.charttitle = charttitle;
    }

    /**
     * @return chartstyle
     */
    public Short getChartstyle() {
        return chartstyle;
    }

    /**
     * @param chartstyle
     */
    public void setChartstyle(Short chartstyle) {
        this.chartstyle = chartstyle;
    }

    /**
     * 获取报表类型
                                    0：日报
                                    1：周报
                                    2：月报
                                    3：年报
     *
     * @return rtype - 报表类型
                                    0：日报
                                    1：周报
                                    2：月报
                                    3：年报
     */
    public Short getRtype() {
        return rtype;
    }

    /**
     * 设置报表类型
                                    0：日报
                                    1：周报
                                    2：月报
                                    3：年报
     *
     * @param rtype 报表类型
                                    0：日报
                                    1：周报
                                    2：月报
                                    3：年报
     */
    public void setRtype(Short rtype) {
        this.rtype = rtype;
    }

    /**
     * 获取0：设备报警
                                    1：测点报警
                                    2：历史数据
     *
     * @return statisticaltype - 0：设备报警
                                    1：测点报警
                                    2：历史数据
     */
    public Short getStatisticaltype() {
        return statisticaltype;
    }

    /**
     * 设置0：设备报警
                                    1：测点报警
                                    2：历史数据
     *
     * @param statisticaltype 0：设备报警
                                    1：测点报警
                                    2：历史数据
     */
    public void setStatisticaltype(Short statisticaltype) {
        this.statisticaltype = statisticaltype;
    }

    /**
     * @return isautoreport
     */
    public Boolean getIsautoreport() {
        return isautoreport;
    }

    /**
     * @param isautoreport
     */
    public void setIsautoreport(Boolean isautoreport) {
        this.isautoreport = isautoreport;
    }

    /**
     * @return customdtime
     */
    public String getCustomdtime() {
        return customdtime;
    }

    /**
     * @param customdtime
     */
    public void setCustomdtime(String customdtime) {
        this.customdtime = customdtime;
    }

    /**
     * @return charttaguuid
     */
    public String getCharttaguuid() {
        return charttaguuid;
    }

    /**
     * @param charttaguuid
     */
    public void setCharttaguuid(String charttaguuid) {
        this.charttaguuid = charttaguuid;
    }

    /**
     * @return reportResuuid
     */
    public String getReportresuuid() {
        return reportresuuid;
    }

    /**
     * @param reportresuuid
     */
    public void setReportresuuid(String reportresuuid) {
        this.reportresuuid = reportresuuid;
    }
}