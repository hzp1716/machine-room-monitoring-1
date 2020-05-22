package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "periods")
public class Periods implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "bexclude")
    private Boolean bexclude;

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
     * @return bexclude
     */
    public Boolean getBexclude() {
        return bexclude;
    }

    /**
     * @param bexclude
     */
    public void setBexclude(Boolean bexclude) {
        this.bexclude = bexclude;
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