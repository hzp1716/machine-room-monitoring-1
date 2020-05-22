package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "default_page")
public class DefaultPage implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`NAME`")
    private String name;

    @Column(name = "`no`")
    private Integer no;

    @Column(name = "description")
    private String description;

    @Column(name = "pid")
    private String pid;

    @Column(name = "background")
    private byte[] background;

    @Column(name = "backgrdtype")
    private Integer backgrdtype;

    @Column(name = "devtype")
    private Integer devtype;

    @Column(name = "width")
    private Integer width;

    @Column(name = "height")
    private Integer height;

    @Column(name = "uies")
    private byte[] uies;

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
     * @return NAME
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
     * @return background
     */
    public byte[] getBackground() {
        return background;
    }

    /**
     * @param background
     */
    public void setBackground(byte[] background) {
        this.background = background;
    }

    /**
     * @return backgrdtype
     */
    public Integer getBackgrdtype() {
        return backgrdtype;
    }

    /**
     * @param backgrdtype
     */
    public void setBackgrdtype(Integer backgrdtype) {
        this.backgrdtype = backgrdtype;
    }

    /**
     * @return devtype
     */
    public Integer getDevtype() {
        return devtype;
    }

    /**
     * @param devtype
     */
    public void setDevtype(Integer devtype) {
        this.devtype = devtype;
    }

    /**
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * @param height
     */
    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * @return uies
     */
    public byte[] getUies() {
        return uies;
    }

    /**
     * @param uies
     */
    public void setUies(byte[] uies) {
        this.uies = uies;
    }
}