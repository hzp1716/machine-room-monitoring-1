package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "ontimetask")
public class Ontimetask implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "tasktype")
    private Integer tasktype;

    @Column(name = "model")
    private byte[] model;

    @Column(name = "projectid")
    private String projectid;

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
     * @return tasktype
     */
    public Integer getTasktype() {
        return tasktype;
    }

    /**
     * @param tasktype
     */
    public void setTasktype(Integer tasktype) {
        this.tasktype = tasktype;
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
}