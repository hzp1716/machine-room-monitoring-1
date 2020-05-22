package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hdata_1_2004")
public class Hdata12004 implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "collectorname")
    private String collectorname;

    @Column(name = "devicename")
    private String devicename;

    @Column(name = "mpname")
    private String mpname;

    @Column(name = "mpid")
    private String mpid;

    @Column(name = "rtvalue")
    private String rtvalue;

    @Column(name = "occurtime")
    private Date occurtime;

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
     * @return collectorname
     */
    public String getCollectorname() {
        return collectorname;
    }

    /**
     * @param collectorname
     */
    public void setCollectorname(String collectorname) {
        this.collectorname = collectorname;
    }

    /**
     * @return devicename
     */
    public String getDevicename() {
        return devicename;
    }

    /**
     * @param devicename
     */
    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    /**
     * @return mpname
     */
    public String getMpname() {
        return mpname;
    }

    /**
     * @param mpname
     */
    public void setMpname(String mpname) {
        this.mpname = mpname;
    }

    /**
     * @return mpid
     */
    public String getMpid() {
        return mpid;
    }

    /**
     * @param mpid
     */
    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    /**
     * @return rtvalue
     */
    public String getRtvalue() {
        return rtvalue;
    }

    /**
     * @param rtvalue
     */
    public void setRtvalue(String rtvalue) {
        this.rtvalue = rtvalue;
    }

    /**
     * @return occurtime
     */
    public Date getOccurtime() {
        return occurtime;
    }

    /**
     * @param occurtime
     */
    public void setOccurtime(Date occurtime) {
        this.occurtime = occurtime;
    }
}