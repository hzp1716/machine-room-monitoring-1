package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "bindingitem")
public class Bindingitem implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "pid")
    private String pid;

    @Column(name = "bindsrc")
    private String bindsrc;

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
     * @return bindsrc
     */
    public String getBindsrc() {
        return bindsrc;
    }

    /**
     * @param bindsrc
     */
    public void setBindsrc(String bindsrc) {
        this.bindsrc = bindsrc;
    }
}