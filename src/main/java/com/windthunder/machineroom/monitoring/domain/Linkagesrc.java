package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "linkagesrc")
public class Linkagesrc implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 测点id，联动源
     */
    @Column(name = "mpid")
    private String mpid;

    /**
     * 测点名称，联动源
     */
    @Column(name = "mpname")
    private String mpname;

    /**
     * 参数的顺序号
     */
    @Column(name = "seqnum")
    private Integer seqnum;

    @Column(name = "linkageid")
    private String linkageid;

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
     * 获取测点id，联动源
     *
     * @return mpid - 测点id，联动源
     */
    public String getMpid() {
        return mpid;
    }

    /**
     * 设置测点id，联动源
     *
     * @param mpid 测点id，联动源
     */
    public void setMpid(String mpid) {
        this.mpid = mpid;
    }

    /**
     * 获取测点名称，联动源
     *
     * @return mpname - 测点名称，联动源
     */
    public String getMpname() {
        return mpname;
    }

    /**
     * 设置测点名称，联动源
     *
     * @param mpname 测点名称，联动源
     */
    public void setMpname(String mpname) {
        this.mpname = mpname;
    }

    /**
     * 获取参数的顺序号
     *
     * @return seqnum - 参数的顺序号
     */
    public Integer getSeqnum() {
        return seqnum;
    }

    /**
     * 设置参数的顺序号
     *
     * @param seqnum 参数的顺序号
     */
    public void setSeqnum(Integer seqnum) {
        this.seqnum = seqnum;
    }

    /**
     * @return linkageid
     */
    public String getLinkageid() {
        return linkageid;
    }

    /**
     * @param linkageid
     */
    public void setLinkageid(String linkageid) {
        this.linkageid = linkageid;
    }
}