package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "chartsource")
public class Chartsource implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "pid")
    private String pid;

    @Column(name = "srcid")
    private String srcid;

    @Column(name = "srctype")
    private Short srctype;

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
     * @return srcid
     */
    public String getSrcid() {
        return srcid;
    }

    /**
     * @param srcid
     */
    public void setSrcid(String srcid) {
        this.srcid = srcid;
    }

    /**
     * @return srctype
     */
    public Short getSrctype() {
        return srctype;
    }

    /**
     * @param srctype
     */
    public void setSrctype(Short srctype) {
        this.srctype = srctype;
    }
}