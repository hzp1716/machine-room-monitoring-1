package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "redevproto")
public class Redevproto implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "content")
    private byte[] content;

    @Column(name = "version")
    private String version;

    @Column(name = "modidate")
    private Date modidate;

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
     * @return content
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return modidate
     */
    public Date getModidate() {
        return modidate;
    }

    /**
     * @param modidate
     */
    public void setModidate(Date modidate) {
        this.modidate = modidate;
    }
}