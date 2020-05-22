package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "syssetting")
public class Syssetting implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "setkey")
    private String setkey;

    @Column(name = "setvalue")
    private String setvalue;

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
     * @return setkey
     */
    public String getSetkey() {
        return setkey;
    }

    /**
     * @param setkey
     */
    public void setSetkey(String setkey) {
        this.setkey = setkey;
    }

    /**
     * @return setvalue
     */
    public String getSetvalue() {
        return setvalue;
    }

    /**
     * @param setvalue
     */
    public void setSetvalue(String setvalue) {
        this.setvalue = setvalue;
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