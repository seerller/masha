package com.gangan.out;

import java.io.Serializable;
import java.util.Date;


public class Section implements Serializable {

    private Integer id;
    private Ops section;
    private String createName;
    private boolean isOpen;
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Ops getSection() {
        return section;
    }

    public void setSection(Ops section) {
        this.section = section;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
