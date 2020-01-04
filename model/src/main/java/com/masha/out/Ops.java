package com.gangan.out;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Ops implements Serializable {
    private Integer id;
    private String lable;

    private List<Ops> opsList = new ArrayList<>();

    public List<Ops> getOpsList() {
        return opsList;
    }

    public void setOpsList(List<Ops> opsList) {
        this.opsList = opsList;
    }

    public Ops(Integer id, String lable) {
        this.id = id;
        this.lable = lable;
    }

    public Ops() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }


}
