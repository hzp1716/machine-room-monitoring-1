package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "assetlink")
public class Assetlink implements Serializable {
    @Id
    @Column(name = "deviceid")
    private String deviceid;

    @Column(name = "assetid")
    private String assetid;

    @Column(name = "assettype")
    private Integer assettype;

    @Column(name = "projectid")
    private String projectid;

    private static final long serialVersionUID = 1L;

    /**
     * @return deviceid
     */
    public String getDeviceid() {
        return deviceid;
    }

    /**
     * @param deviceid
     */
    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * @return assetid
     */
    public String getAssetid() {
        return assetid;
    }

    /**
     * @param assetid
     */
    public void setAssetid(String assetid) {
        this.assetid = assetid;
    }

    /**
     * @return assettype
     */
    public Integer getAssettype() {
        return assettype;
    }

    /**
     * @param assettype
     */
    public void setAssettype(Integer assettype) {
        this.assettype = assettype;
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