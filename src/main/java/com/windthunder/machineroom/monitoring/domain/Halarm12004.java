package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "halarm_1_2004")
public class Halarm12004 implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "devicename")
    private String devicename;

    @Column(name = "mpname")
    private String mpname;

    @Column(name = "alarmsrctype")
    private Integer alarmsrctype;

    /**
     * 0 int, enum. 
                                    1 double float
                                    2 bool
                                    3 string
     */
    @Column(name = "alarmtype")
    private Integer alarmtype;

    @Column(name = "alarmlevel")
    private Integer alarmlevel;

    @Column(name = "alarmcontent")
    private String alarmcontent;

    @Column(name = "alarmtime")
    private Date alarmtime;

    @Column(name = "alarmconfirm")
    private String alarmconfirm;

    @Column(name = "curtvalue")
    private String curtvalue;

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
     * @return alarmsrctype
     */
    public Integer getAlarmsrctype() {
        return alarmsrctype;
    }

    /**
     * @param alarmsrctype
     */
    public void setAlarmsrctype(Integer alarmsrctype) {
        this.alarmsrctype = alarmsrctype;
    }

    /**
     * 获取0 int, enum. 
                                    1 double float
                                    2 bool
                                    3 string
     *
     * @return alarmtype - 0 int, enum. 
                                    1 double float
                                    2 bool
                                    3 string
     */
    public Integer getAlarmtype() {
        return alarmtype;
    }

    /**
     * 设置0 int, enum. 
                                    1 double float
                                    2 bool
                                    3 string
     *
     * @param alarmtype 0 int, enum. 
                                    1 double float
                                    2 bool
                                    3 string
     */
    public void setAlarmtype(Integer alarmtype) {
        this.alarmtype = alarmtype;
    }

    /**
     * @return alarmlevel
     */
    public Integer getAlarmlevel() {
        return alarmlevel;
    }

    /**
     * @param alarmlevel
     */
    public void setAlarmlevel(Integer alarmlevel) {
        this.alarmlevel = alarmlevel;
    }

    /**
     * @return alarmcontent
     */
    public String getAlarmcontent() {
        return alarmcontent;
    }

    /**
     * @param alarmcontent
     */
    public void setAlarmcontent(String alarmcontent) {
        this.alarmcontent = alarmcontent;
    }

    /**
     * @return alarmtime
     */
    public Date getAlarmtime() {
        return alarmtime;
    }

    /**
     * @param alarmtime
     */
    public void setAlarmtime(Date alarmtime) {
        this.alarmtime = alarmtime;
    }

    /**
     * @return alarmconfirm
     */
    public String getAlarmconfirm() {
        return alarmconfirm;
    }

    /**
     * @param alarmconfirm
     */
    public void setAlarmconfirm(String alarmconfirm) {
        this.alarmconfirm = alarmconfirm;
    }

    /**
     * @return curtvalue
     */
    public String getCurtvalue() {
        return curtvalue;
    }

    /**
     * @param curtvalue
     */
    public void setCurtvalue(String curtvalue) {
        this.curtvalue = curtvalue;
    }
}