package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "pagelinkage")
public class Pagelinkage implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "description")
    private String description;

    @Column(name = "mpointname")
    private String mpointname;

    @Column(name = "pageid")
    private String pageid;

    @Column(name = "pagename")
    private String pagename;

    @Column(name = "pid")
    private String pid;

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
     * @return mpointname
     */
    public String getMpointname() {
        return mpointname;
    }

    /**
     * @param mpointname
     */
    public void setMpointname(String mpointname) {
        this.mpointname = mpointname;
    }

    /**
     * @return pageid
     */
    public String getPageid() {
        return pageid;
    }

    /**
     * @param pageid
     */
    public void setPageid(String pageid) {
        this.pageid = pageid;
    }

    /**
     * @return pagename
     */
    public String getPagename() {
        return pagename;
    }

    /**
     * @param pagename
     */
    public void setPagename(String pagename) {
        this.pagename = pagename;
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
     * @return mpointid
     */
    public String getMpointid() {
        return mpointid;
    }

    /**
     * @param mpointid
     */
    public void setMpointid(String mpointid) {
        this.mpointid = mpointid;
    }
}