package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "commport")
public class Commport implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "pid")
    private String pid;

    @Column(name = "pluginid")
    private String pluginid;

    /**
     * no
            description	 
            comparam	 
            port 
            commprotocal 
            collectmode	 
            multiplexing
            porttype
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
     * @return pluginid
     */
    public String getPluginid() {
        return pluginid;
    }

    /**
     * @param pluginid
     */
    public void setPluginid(String pluginid) {
        this.pluginid = pluginid;
    }

    /**
     * 获取no
            description	 
            comparam	 
            port 
            commprotocal 
            collectmode	 
            multiplexing
            porttype
     *
     * @return model - no
            description	 
            comparam	 
            port 
            commprotocal 
            collectmode	 
            multiplexing
            porttype
     */
    public byte[] getModel() {
        return model;
    }

    /**
     * 设置no
            description	 
            comparam	 
            port 
            commprotocal 
            collectmode	 
            multiplexing
            porttype
     *
     * @param model no
            description	 
            comparam	 
            port 
            commprotocal 
            collectmode	 
            multiplexing
            porttype
     */
    public void setModel(byte[] model) {
        this.model = model;
    }
}