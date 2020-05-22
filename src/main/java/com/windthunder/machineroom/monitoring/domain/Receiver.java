package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "receiver")
public class Receiver implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "srcid")
    private String srcid;

    @Column(name = "srctype")
    private Short srctype;

    @Column(name = "dstid")
    private String dstid;

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

    /**
     * @return dstid
     */
    public String getDstid() {
        return dstid;
    }

    /**
     * @param dstid
     */
    public void setDstid(String dstid) {
        this.dstid = dstid;
    }
}