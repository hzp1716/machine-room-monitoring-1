package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "usr")
public class Usr implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "sex")
    private Integer sex;

    @Column(name = "`position`")
    private String position;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "mobilephone")
    private String mobilephone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "company")
    private String company;

    @Column(name = "cardno")
    private String cardno;

    @Column(name = "empno")
    private String empno;

    @Column(name = "addition1")
    private String addition1;

    @Column(name = "addition2")
    private String addition2;

    @Column(name = "addition3")
    private String addition3;

    @Column(name = "addition4")
    private String addition4;

    @Column(name = "addition5")
    private String addition5;

    @Column(name = "periodsid")
    private String periodsid;

    @Column(name = "pid")
    private String pid;

    @Column(name = "accountid")
    private String accountid;

    @Column(name = "depart_id")
    private String departId;

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
     * @return sex
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * @return position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * @return mobilephone
     */
    public String getMobilephone() {
        return mobilephone;
    }

    /**
     * @param mobilephone
     */
    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return cardno
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    /**
     * @return empno
     */
    public String getEmpno() {
        return empno;
    }

    /**
     * @param empno
     */
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    /**
     * @return addition1
     */
    public String getAddition1() {
        return addition1;
    }

    /**
     * @param addition1
     */
    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    /**
     * @return addition2
     */
    public String getAddition2() {
        return addition2;
    }

    /**
     * @param addition2
     */
    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    /**
     * @return addition3
     */
    public String getAddition3() {
        return addition3;
    }

    /**
     * @param addition3
     */
    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    /**
     * @return addition4
     */
    public String getAddition4() {
        return addition4;
    }

    /**
     * @param addition4
     */
    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    /**
     * @return addition5
     */
    public String getAddition5() {
        return addition5;
    }

    /**
     * @param addition5
     */
    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    /**
     * @return periodsid
     */
    public String getPeriodsid() {
        return periodsid;
    }

    /**
     * @param periodsid
     */
    public void setPeriodsid(String periodsid) {
        this.periodsid = periodsid;
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
     * @return accountid
     */
    public String getAccountid() {
        return accountid;
    }

    /**
     * @param accountid
     */
    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    /**
     * @return depart_id
     */
    public String getDepartId() {
        return departId;
    }

    /**
     * @param departId
     */
    public void setDepartId(String departId) {
        this.departId = departId;
    }

    @Override
    public String toString() {
        return "Usr{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", position='" + position + '\'' +
                ", telephone='" + telephone + '\'' +
                ", mobilephone='" + mobilephone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", cardno='" + cardno + '\'' +
                ", empno='" + empno + '\'' +
                ", addition1='" + addition1 + '\'' +
                ", addition2='" + addition2 + '\'' +
                ", addition3='" + addition3 + '\'' +
                ", addition4='" + addition4 + '\'' +
                ", addition5='" + addition5 + '\'' +
                ", periodsid='" + periodsid + '\'' +
                ", pid='" + pid + '\'' +
                ", accountid='" + accountid + '\'' +
                ", departId='" + departId + '\'' +
                '}';
    }
}