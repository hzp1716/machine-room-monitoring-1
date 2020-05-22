package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "project")
public class Project implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "creator")
    private String creator;

    @Column(name = "createdate")
    private Date createdate;

    @Column(name = "modifydate")
    private Date modifydate;

    /**
     * 0：None，默认
                                    1：Run，运行
     */
    @Column(name = "`state`")
    private Integer state;

    @Column(name = "homepage")
    private String homepage;

    @Column(name = "`no`")
    private Integer no;

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
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return createdate
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * @param createdate
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * @return modifydate
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * @param modifydate
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * 获取0：None，默认
                                    1：Run，运行
     *
     * @return state - 0：None，默认
                                    1：Run，运行
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置0：None，默认
                                    1：Run，运行
     *
     * @param state 0：None，默认
                                    1：Run，运行
     */
    public void setState(Integer state) {
        this.state = state;
    }

    /**
     * @return homepage
     */
    public String getHomepage() {
        return homepage;
    }

    /**
     * @param homepage
     */
    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    /**
     * @return no
     */
    public Integer getNo() {
        return no;
    }

    /**
     * @param no
     */
    public void setNo(Integer no) {
        this.no = no;
    }
}