package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "fixlog")
public class Fixlog implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "fixlog")
    private String fixlog;

    @Column(name = "fixdate")
    private Date fixdate;

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
     * @return fixlog
     */
    public String getFixlog() {
        return fixlog;
    }

    /**
     * @param fixlog
     */
    public void setFixlog(String fixlog) {
        this.fixlog = fixlog;
    }

    /**
     * @return fixdate
     */
    public Date getFixdate() {
        return fixdate;
    }

    /**
     * @param fixdate
     */
    public void setFixdate(Date fixdate) {
        this.fixdate = fixdate;
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