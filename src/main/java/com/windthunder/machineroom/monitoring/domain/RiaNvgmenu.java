package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "ria_nvgmenu")
public class RiaNvgmenu implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "projectid")
    private String projectid;

    @Column(name = "nvgtype")
    private Integer nvgtype;

    @Column(name = "model")
    private byte[] model;

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
     * @return projectid
     */
    public String getProjectid() {
        return projectid;
    }

    /**
     * @param projectid
     */
    public void setProjectid(String projectid) {
        this.projectid = projectid;
    }

    /**
     * @return nvgtype
     */
    public Integer getNvgtype() {
        return nvgtype;
    }

    /**
     * @param nvgtype
     */
    public void setNvgtype(Integer nvgtype) {
        this.nvgtype = nvgtype;
    }

    /**
     * @return model
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}