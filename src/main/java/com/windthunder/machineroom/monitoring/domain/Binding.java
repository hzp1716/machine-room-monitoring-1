package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "binding")
public class Binding implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    /**
     * 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    @Column(name = "srctype")
    private Integer srctype;

    @Column(name = "binddest")
    private String binddest;

    @Column(name = "dstproperty")
    private String dstproperty;

    @Column(name = "expression")
    private String expression;

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
     * 获取0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @return srctype - 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public Integer getSrctype() {
        return srctype;
    }

    /**
     * 设置0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     *
     * @param srctype 0：Collector，采集器
                                    1：Device，设备
                                    2：mpoint，监测点，
     */
    public void setSrctype(Integer srctype) {
        this.srctype = srctype;
    }

    /**
     * @return binddest
     */
    public String getBinddest() {
        return binddest;
    }

    /**
     * @param binddest
     */
    public void setBinddest(String binddest) {
        this.binddest = binddest;
    }

    /**
     * @return dstproperty
     */
    public String getDstproperty() {
        return dstproperty;
    }

    /**
     * @param dstproperty
     */
    public void setDstproperty(String dstproperty) {
        this.dstproperty = dstproperty;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    /**
     * @param expression
     */
    public void setExpression(String expression) {
        this.expression = expression;
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