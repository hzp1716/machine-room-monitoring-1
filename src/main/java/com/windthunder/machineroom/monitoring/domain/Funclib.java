package com.windthunder.machineroom.monitoring.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "funclib")
public class Funclib implements Serializable {
    @Id
    @Column(name = "id")
    private String id;

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