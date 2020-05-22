package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "usr_recvgroup")
public class UsrRecvgroup implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "personid")
    private String personid;

    @Column(name = "groupid")
    private String groupid;

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
     * @return personid
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * @param personid
     */
    public void setPersonid(String personid) {
        this.personid = personid;
    }

    /**
     * @return groupid
     */
    public String getGroupid() {
        return groupid;
    }

    /**
     * @param groupid
     */
    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }
}