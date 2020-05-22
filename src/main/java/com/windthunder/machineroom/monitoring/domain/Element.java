package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`element`")
public class Element implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    /**
     * 父页面id
     */
    @Column(name = "pid")
    private String pid;

    /**
     * 元素类型
                                    动环
                                    消防
                                    安防
                                    热点（地图、机房）
     */
    @Column(name = "elementtype")
    private Integer elementtype;

    @Column(name = "bkpictured")
    private String bkpictured;

    @Column(name = "ele_id")
    private String eleId;

    /**
     * 序列化的json内容
     */
    @Column(name = "jsonvalue")
    private String jsonvalue;

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
     * 获取父页面id
     *
     * @return pid - 父页面id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置父页面id
     *
     * @param pid 父页面id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * 获取元素类型
                                    动环
                                    消防
                                    安防
                                    热点（地图、机房）
     *
     * @return elementtype - 元素类型
                                    动环
                                    消防
                                    安防
                                    热点（地图、机房）
     */
    public Integer getElementtype() {
        return elementtype;
    }

    /**
     * 设置元素类型
                                    动环
                                    消防
                                    安防
                                    热点（地图、机房）
     *
     * @param elementtype 元素类型
                                    动环
                                    消防
                                    安防
                                    热点（地图、机房）
     */
    public void setElementtype(Integer elementtype) {
        this.elementtype = elementtype;
    }

    /**
     * @return bkpictured
     */
    public String getBkpictured() {
        return bkpictured;
    }

    /**
     * @param bkpictured
     */
    public void setBkpictured(String bkpictured) {
        this.bkpictured = bkpictured;
    }

    /**
     * @return ele_id
     */
    public String getEleId() {
        return eleId;
    }

    /**
     * @param eleId
     */
    public void setEleId(String eleId) {
        this.eleId = eleId;
    }

    /**
     * 获取序列化的json内容
     *
     * @return jsonvalue - 序列化的json内容
     */
    public String getJsonvalue() {
        return jsonvalue;
    }

    /**
     * 设置序列化的json内容
     *
     * @param jsonvalue 序列化的json内容
     */
    public void setJsonvalue(String jsonvalue) {
        this.jsonvalue = jsonvalue;
    }
}