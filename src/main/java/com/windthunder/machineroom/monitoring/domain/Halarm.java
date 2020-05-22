package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "halarm")
public class Halarm implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "prjid")
    private String prjid;

    /**
     * 例如  halarm_prjno 工程no
     */
    @Column(name = "halarmname")
    private String halarmname;

    @Column(name = "createdate")
    private Date createdate;

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
     * 获取例如  halarm_prjno 工程no
     *
     * @return halarmname - 例如  halarm_prjno 工程no
     */
    public String getHalarmname() {
        return halarmname;
    }

    /**
     * 设置例如  halarm_prjno 工程no
     *
     * @param halarmname 例如  halarm_prjno 工程no
     */
    public void setHalarmname(String halarmname) {
        this.halarmname = halarmname;
    }

    /**
     * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}