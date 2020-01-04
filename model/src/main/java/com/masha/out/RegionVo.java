package com.gangan.out;

import com.gangan.model.Area;

import java.io.Serializable;
import java.util.List;

public class RegionVo implements Serializable {

    private List<Region> regionList ;

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }
}
