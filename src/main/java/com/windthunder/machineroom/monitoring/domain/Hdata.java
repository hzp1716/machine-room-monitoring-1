package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "hdata")
public class Hdata implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "prjid")
    private String prjid;

    /**
     * 例如：hdata_prjno_1509 （15年9月）
     */
    @Column(name = "hdataname")
    private String hdataname;

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
     * 获取例如：hdata_prjno_1509 （15年9月）
     *
     * @return hdataname - 例如：hdata_prjno_1509 （15年9月）
     */
    public String getHdataname() {
        return hdataname;
    }

    /**
     * 设置例如：hdata_prjno_1509 （15年9月）
     *
     * @param hdataname 例如：hdata_prjno_1509 （15年9月）
     */
    public void setHdataname(String hdataname) {
        this.hdataname = hdataname;
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