package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "rtdatato3d")
public class Rtdatato3d implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    /**
     * 实时数据源，测点id，测点名称，设备名称，json格式
     */
    @Column(name = "rtdsrc")
    private byte[] rtdsrc;

    /**
     * 实时目标对象，3D界面元素或设备，包括名称场景等等，json
     */
    @Column(name = "rtddst")
    private byte[] rtddst;

    /**
     * 工程id
     */
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
     * 获取实时数据源，测点id，测点名称，设备名称，json格式
     *
     * @return rtdsrc - 实时数据源，测点id，测点名称，设备名称，json格式
     */
    public byte[] getRtdsrc() {
        return rtdsrc;
    }

    /**
     * 设置实时数据源，测点id，测点名称，设备名称，json格式
     *
     * @param rtdsrc 实时数据源，测点id，测点名称，设备名称，json格式
     */
    public void setRtdsrc(byte[] rtdsrc) {
        this.rtdsrc = rtdsrc;
    }

    /**
     * 获取实时目标对象，3D界面元素或设备，包括名称场景等等，json
     *
     * @return rtddst - 实时目标对象，3D界面元素或设备，包括名称场景等等，json
     */
    public byte[] getRtddst() {
        return rtddst;
    }

    /**
     * 设置实时目标对象，3D界面元素或设备，包括名称场景等等，json
     *
     * @param rtddst 实时目标对象，3D界面元素或设备，包括名称场景等等，json
     */
    public void setRtddst(byte[] rtddst) {
        this.rtddst = rtddst;
    }

    /**
     * 获取工程id
     *
     * @return pid - 工程id
     */
    public String getPid() {
        return pid;
    }

    /**
     * 设置工程id
     *
     * @param pid 工程id
     */
    public void setPid(String pid) {
        this.pid = pid;
    }
}