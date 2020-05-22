package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "privilege")
public class Privilege implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "auth_uuid")
    private String authUuid;

    @Column(name = "`type`")
    private Short type;

    @Column(name = "roleid")
    private String roleid;

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
     * @return auth_uuid
     */
    public String getAuthUuid() {
        return authUuid;
    }

    /**
     * @param authUuid
     */
    public void setAuthUuid(String authUuid) {
        this.authUuid = authUuid;
    }

    /**
     * @return type
     */
    public Short getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * @return roleid
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * @param roleid
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid;
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