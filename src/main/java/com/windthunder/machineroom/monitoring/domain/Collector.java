package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "collector")
public class Collector implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "pid")
    private String pid;

    /**
     * description
            no
            site
            type
     */
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
     * 获取description
            no
            site
            type
     *
     * @return model - description
            no
            site
            type
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置description
            no
            site
            type
     *
     * @param model description
            no
            site
            type
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}