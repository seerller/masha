package com.masha.out;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Region implements Serializable {

    private String  value;
    private String  label;
    private Integer  parentId;
    private Integer  id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private List<Region> children = new ArrayList<>();

    public Region() {
    }

    public Region(String value, String label , Integer parentId , Integer id) {
        this.value = value;
        this.label = label;
        this.parentId = parentId;
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Region> getChildren() {
        return children;
    }

    public void setChildren(List<Region> children) {
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
