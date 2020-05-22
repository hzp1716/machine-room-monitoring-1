package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "reportperiod")
public class Reportperiod implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pid")
    private String pid;

    @Column(name = "isCustomPeriod")
    private Boolean iscustomperiod;

    @Column(name = "dHour")
    private Integer dhour;

    @Column(name = "wWeek")
    private Integer wweek;

    @Column(name = "mDay")
    private Integer mday;

    @Column(name = "yCalendar")
    private String ycalendar;

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
     * @return isCustomPeriod
     */
    public Boolean getIscustomperiod() {
        return iscustomperiod;
    }

    /**
     * @param iscustomperiod
     */
    public void setIscustomperiod(Boolean iscustomperiod) {
        this.iscustomperiod = iscustomperiod;
    }

    /**
     * @return dHour
     */
    public Integer getDhour() {
        return dhour;
    }

    /**
     * @param dhour
     */
    public void setDhour(Integer dhour) {
        this.dhour = dhour;
    }

    /**
     * @return wWeek
     */
    public Integer getWweek() {
        return wweek;
    }

    /**
     * @param wweek
     */
    public void setWweek(Integer wweek) {
        this.wweek = wweek;
    }

    /**
     * @return mDay
     */
    public Integer getMday() {
        return mday;
    }

    /**
     * @param mday
     */
    public void setMday(Integer mday) {
        this.mday = mday;
    }

    /**
     * @return yCalendar
     */
    public String getYcalendar() {
        return ycalendar;
    }

    /**
     * @param ycalendar
     */
    public void setYcalendar(String ycalendar) {
        this.ycalendar = ycalendar;
    }
}