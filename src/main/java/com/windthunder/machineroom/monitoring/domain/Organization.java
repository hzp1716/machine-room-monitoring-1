package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "organization")
public class Organization implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "selfid")
    private String selfid;

    @Column(name = "prjid")
    private String prjid;

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
     * @return selfid
     */
    public String getSelfid() {
        return selfid;
    }

    /**
     * @param selfid
     */
    public void setSelfid(String selfid) {
        this.selfid = selfid;
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
}