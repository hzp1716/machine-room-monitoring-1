package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "subsys_access_rtlog")
public class SubsysAccessRtlog implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 设备ID
     */
    @Column(name = "diviceid")
    private String diviceid;

    /**
     * 工程ID
     */
    @Column(name = "prjid")
    private String prjid;

    /**
     * 卡号
     */
    @Column(name = "cardno")
    private String cardno;

    /**
     * 人员编号,卡号，门ID，事件类型，出入状态，验证模式
     */
    @Column(name = "model")
    private byte[] model;

    /**
     * 实际类型
     */
    @Column(name = "eventtype")
    private Integer eventtype;

    /**
     * 报警确认
     */
    @Column(name = "alarmconfirm")
    private String alarmconfirm;

    /**
     * 发生时间
     */
    @Column(name = "Occurtime")
    private Date occurtime;

    /**
     * 门编号
     */
    @Column(name = "doorid")
    private Integer doorid;

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
     * 获取设备ID
     *
     * @return diviceid - 设备ID
     */
    public String getDiviceid() {
        return diviceid;
    }

    /**
     * 设置设备ID
     *
     * @param diviceid 设备ID
     */
    public void setDiviceid(String diviceid) {
        this.diviceid = diviceid;
    }

    /**
     * 获取工程ID
     *
     * @return prjid - 工程ID
     */
    public String getPrjid() {
        return prjid;
    }

    /**
     * 设置工程ID
     *
     * @param prjid 工程ID
     */
    public void setPrjid(String prjid) {
        this.prjid = prjid;
    }

    /**
     * 获取卡号
     *
     * @return cardno - 卡号
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * 设置卡号
     *
     * @param cardno 卡号
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * 获取人员编号,卡号，门ID，事件类型，出入状态，验证模式
     *
     * @return model - 人员编号,卡号，门ID，事件类型，出入状态，验证模式
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置人员编号,卡号，门ID，事件类型，出入状态，验证模式
     *
     * @param model 人员编号,卡号，门ID，事件类型，出入状态，验证模式
     */
    public void setModel(byte[] model) {
        this.model = model;
    }

    /**
     * 获取实际类型
     *
     * @return eventtype - 实际类型
     */
    public Integer getEventtype() {
        return eventtype;
    }

    /**
     * 设置实际类型
     *
     * @param eventtype 实际类型
     */
    public void setEventtype(Integer eventtype) {
        this.eventtype = eventtype;
    }

    /**
     * 获取报警确认
     *
     * @return alarmconfirm - 报警确认
     */
    public String getAlarmconfirm() {
        return alarmconfirm;
    }

    /**
     * 设置报警确认
     *
     * @param alarmconfirm 报警确认
     */
    public void setAlarmconfirm(String alarmconfirm) {
        this.alarmconfirm = alarmconfirm;
    }

    /**
     * 获取发生时间
     *
     * @return Occurtime - 发生时间
     */
    public Date getOccurtime() {
        return occurtime;
    }

    /**
     * 设置发生时间
     *
     * @param occurtime 发生时间
     */
    public void setOccurtime(Date occurtime) {
        this.occurtime = occurtime;
    }

    /**
     * 获取门编号
     *
     * @return doorid - 门编号
     */
    public Integer getDoorid() {
        return doorid;
    }

    /**
     * 设置门编号
     *
     * @param doorid 门编号
     */
    public void setDoorid(Integer doorid) {
        this.doorid = doorid;
    }
}