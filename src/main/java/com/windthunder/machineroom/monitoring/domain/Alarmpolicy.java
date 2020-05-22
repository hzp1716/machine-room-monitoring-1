package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "alarmpolicy")
public class Alarmpolicy implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pid")
    private String pid;

    /**
     * 报警时间段
     */
    @Column(name = "alarmteamid")
    private String alarmteamid;

    /**
     * 二进制掩码方式
     */
    @Column(name = "`notify`")
    private Byte notify;

    /**
     * 报警源，设备id
     */
    @Column(name = "alarmsrcid")
    private String alarmsrcid;

    @Column(name = "recvgroupid")
    private String recvgroupid;

    @Column(name = "AlarmCorrelation_id")
    private String alarmcorrelationId;

    @Column(name = "AlarmCorrelation_Name")
    private String alarmcorrelationName;

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
     * 获取报警时间段
     *
     * @return alarmteamid - 报警时间段
     */
    public String getAlarmteamid() {
        return alarmteamid;
    }

    /**
     * 设置报警时间段
     *
     * @param alarmteamid 报警时间段
     */
    public void setAlarmteamid(String alarmteamid) {
        this.alarmteamid = alarmteamid;
    }

    /**
     * 获取二进制掩码方式
     *
     * @return notify - 二进制掩码方式
     */
    public Byte getNotify() {
        return notify;
    }

    /**
     * 设置二进制掩码方式
     *
     * @param notify 二进制掩码方式
     */
    public void setNotify(Byte notify) {
        this.notify = notify;
    }

    /**
     * 获取报警源，设备id
     *
     * @return alarmsrcid - 报警源，设备id
     */
    public String getAlarmsrcid() {
        return alarmsrcid;
    }

    /**
     * 设置报警源，设备id
     *
     * @param alarmsrcid 报警源，设备id
     */
    public void setAlarmsrcid(String alarmsrcid) {
        this.alarmsrcid = alarmsrcid;
    }

    /**
     * @return recvgroupid
     */
    public String getRecvgroupid() {
        return recvgroupid;
    }

    /**
     * @param recvgroupid
     */
    public void setRecvgroupid(String recvgroupid) {
        this.recvgroupid = recvgroupid;
    }

    /**
     * @return AlarmCorrelation_id
     */
    public String getAlarmcorrelationId() {
        return alarmcorrelationId;
    }

    /**
     * @param alarmcorrelationId
     */
    public void setAlarmcorrelationId(String alarmcorrelationId) {
        this.alarmcorrelationId = alarmcorrelationId;
    }

    /**
     * @return AlarmCorrelation_Name
     */
    public String getAlarmcorrelationName() {
        return alarmcorrelationName;
    }

    /**
     * @param alarmcorrelationName
     */
    public void setAlarmcorrelationName(String alarmcorrelationName) {
        this.alarmcorrelationName = alarmcorrelationName;
    }
}