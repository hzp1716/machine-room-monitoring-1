package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "devicemgr")
public class Devicemgr implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "vendor")
    private String vendor;

    @Column(name = "mandate")
    private Date mandate;

    @Column(name = "site")
    private String site;

    @Column(name = "serviceprvdr")
    private String serviceprvdr;

    @Column(name = "servicetel")
    private String servicetel;

    @Column(name = "installdate")
    private Date installdate;

    @Column(name = "did")
    private String did;

    @Column(name = "`state`")
    private Short state;

    @Column(name = "price")
    private Double price;

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
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * @param vendor
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * @return mandate
     */
    public Date getMandate() {
        return mandate;
    }

    /**
     * @param mandate
     */
    public void setMandate(Date mandate) {
        this.mandate = mandate;
    }

    /**
     * @return site
     */
    public String getSite() {
        return site;
    }

    /**
     * @param site
     */
    public void setSite(String site) {
        this.site = site;
    }

    /**
     * @return serviceprvdr
     */
    public String getServiceprvdr() {
        return serviceprvdr;
    }

    /**
     * @param serviceprvdr
     */
    public void setServiceprvdr(String serviceprvdr) {
        this.serviceprvdr = serviceprvdr;
    }

    /**
     * @return servicetel
     */
    public String getServicetel() {
        return servicetel;
    }

    /**
     * @param servicetel
     */
    public void setServicetel(String servicetel) {
        this.servicetel = servicetel;
    }

    /**
     * @return installdate
     */
    public Date getInstalldate() {
        return installdate;
    }

    /**
     * @param installdate
     */
    public void setInstalldate(Date installdate) {
        this.installdate = installdate;
    }

    /**
     * @return did
     */
    public String getDid() {
        return did;
    }

    /**
     * @param did
     */
    public void setDid(String did) {
        this.did = did;
    }

    /**
     * @return state
     */
    public Short getState() {
        return state;
    }

    /**
     * @param state
     */
    public void setState(Short state) {
        this.state = state;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
    }
}