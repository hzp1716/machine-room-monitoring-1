package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "linkage")
public class Linkage implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pid")
    private String pid;

    @Column(name = "`name`")
    private String name;

    @Column(name = "conditionscript")
    private byte[] conditionscript;

    @Column(name = "actvalue")
    private String actvalue;

    @Column(name = "actvaluetype")
    private Short actvaluetype;

    @Column(name = "operatetype")
    private Short operatetype;

    @Column(name = "periodsid")
    private String periodsid;

    @Column(name = "dst")
    private String dst;

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
     * @return conditionscript
     */
    public byte[] getConditionscript() {
        return conditionscript;
    }

    /**
     * @param conditionscript
     */
    public void setConditionscript(byte[] conditionscript) {
        this.conditionscript = conditionscript;
    }

    /**
     * @return actvalue
     */
    public String getActvalue() {
        return actvalue;
    }

    /**
     * @param actvalue
     */
    public void setActvalue(String actvalue) {
        this.actvalue = actvalue;
    }

    /**
     * @return actvaluetype
     */
    public Short getActvaluetype() {
        return actvaluetype;
    }

    /**
     * @param actvaluetype
     */
    public void setActvaluetype(Short actvaluetype) {
        this.actvaluetype = actvaluetype;
    }

    /**
     * @return operatetype
     */
    public Short getOperatetype() {
        return operatetype;
    }

    /**
     * @param operatetype
     */
    public void setOperatetype(Short operatetype) {
        this.operatetype = operatetype;
    }

    /**
     * @return periodsid
     */
    public String getPeriodsid() {
        return periodsid;
    }

    /**
     * @param periodsid
     */
    public void setPeriodsid(String periodsid) {
        this.periodsid = periodsid;
    }

    /**
     * @return dst
     */
    public String getDst() {
        return dst;
    }

    /**
     * @param dst
     */
    public void setDst(String dst) {
        this.dst = dst;
    }
}