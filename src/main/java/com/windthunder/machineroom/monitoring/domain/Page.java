package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "page")
public class Page implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "pid")
    private String pid;

    @Column(name = "h")
    private Double h;

    @Column(name = "w")
    private Double w;

    /**
     * 0：图片
                                    1：材质
                                    2：填充
     */
    @Column(name = "bktype")
    private Integer bktype;

    @Column(name = "background")
    private byte[] background;

    @Column(name = "thumbnail")
    private byte[] thumbnail;

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
     * @return h
     */
    public Double getH() {
        return h;
    }

    /**
     * @param h
     */
    public void setH(Double h) {
        this.h = h;
    }

    /**
     * @return w
     */
    public Double getW() {
        return w;
    }

    /**
     * @param w
     */
    public void setW(Double w) {
        this.w = w;
    }

    /**
     * 获取0：图片
                                    1：材质
                                    2：填充
     *
     * @return bktype - 0：图片
                                    1：材质
                                    2：填充
     */
    public Integer getBktype() {
        return bktype;
    }

    /**
     * 设置0：图片
                                    1：材质
                                    2：填充
     *
     * @param bktype 0：图片
                                    1：材质
                                    2：填充
     */
    public void setBktype(Integer bktype) {
        this.bktype = bktype;
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
     * @return thumbnail
     */
    public byte[] getThumbnail() {
        return thumbnail;
    }

    /**
     * @param thumbnail
     */
    public void setThumbnail(byte[] thumbnail) {
        this.thumbnail = thumbnail;
    }
}