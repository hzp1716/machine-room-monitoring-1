package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "persistpolicy")
public class Persistpolicy implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 持久化时间段
     */
    @Column(name = "period")
    private String period;

    /**
     * 变化率，按数据变化百分比
     */
    @Column(name = "varratio")
    private Integer varratio;

    /**
     * 按周期存储，每个几秒存储数据
     */
    @Column(name = "saveterm")
    private Integer saveterm;

    /**
     * 数据持久化方式
                                    0.按周期存储 saveterm；
                                    1.按数据变化率，varratio
                                    2.其他
     */
    @Column(name = "persisttype")
    private Integer persisttype;

    /**
     * 工程id
     */
    @Column(name = "pid")
    private String pid;

    /**
     * 持久化对象的id，测点id
     */
    @Column(name = "mpointid")
    private String mpointid;

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
     * 获取持久化时间段
     *
     * @return period - 持久化时间段
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 设置持久化时间段
     *
     * @param period 持久化时间段
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * 获取变化率，按数据变化百分比
     *
     * @return varratio - 变化率，按数据变化百分比
     */
    public Integer getVarratio() {
        return varratio;
    }

    /**
     * 设置变化率，按数据变化百分比
     *
     * @param varratio 变化率，按数据变化百分比
     */
    public void setVarratio(Integer varratio) {
        this.varratio = varratio;
    }

    /**
     * 获取按周期存储，每个几秒存储数据
     *
     * @return saveterm - 按周期存储，每个几秒存储数据
     */
    public Integer getSaveterm() {
        return saveterm;
    }

    /**
     * 设置按周期存储，每个几秒存储数据
     *
     * @param saveterm 按周期存储，每个几秒存储数据
     */
    public void setSaveterm(Integer saveterm) {
        this.saveterm = saveterm;
    }

    /**
     * 获取数据持久化方式
                                    0.按周期存储 saveterm；
                                    1.按数据变化率，varratio
                                    2.其他
     *
     * @return persisttype - 数据持久化方式
                                    0.按周期存储 saveterm；
                                    1.按数据变化率，varratio
                                    2.其他
     */
    public Integer getPersisttype() {
        return persisttype;
    }

    /**
     * 设置数据持久化方式
                                    0.按周期存储 saveterm；
                                    1.按数据变化率，varratio
                                    2.其他
     *
     * @param persisttype 数据持久化方式
                                    0.按周期存储 saveterm；
                                    1.按数据变化率，varratio
                                    2.其他
     */
    public void setPersisttype(Integer persisttype) {
        this.persisttype = persisttype;
    }

    /**
     * 获取工程id
     *
     * @return pid - 工程id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置工程id
     *
     * @param pid 工程id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取持久化对象的id，测点id
     *
     * @return mpointid - 持久化对象的id，测点id
     */
    public String getMpointid() {
        return mpointid;
    }

    /**
     * 设置持久化对象的id，测点id
     *
     * @param mpointid 持久化对象的id，测点id
     */
    public void setMpointid(String mpointid) {
        this.mpointid = mpointid;
    }
}