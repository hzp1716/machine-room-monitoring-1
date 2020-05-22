package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "programlog")
public class Programlog implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @Column(name = "prjid")
    private String prjid;

    @Column(name = "occurtime")
    private Date occurtime;

    @Column(name = "logtype")
    private Integer logtype;

    @Column(name = "loginfo")
    private String loginfo;

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
     * @return prjid
     */
    public String getPrjid() {
        return prjid;
    }

    /**
     * @param prjid
     */
    public void setPrjid(String prjid) {
        this.prjid = prjid;
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

    /**
     * @return logtype
     */
    public Integer getLogtype() {
        return logtype;
    }

    /**
     * @param logtype
     */
    public void setLogtype(Integer logtype) {
        this.logtype = logtype;
    }

    /**
     * @return loginfo
     */
    public String getLoginfo() {
        return loginfo;
    }

    /**
     * @param loginfo
     */
    public void setLoginfo(String loginfo) {
        this.loginfo = loginfo;
    }
}