package com.gangan.out;

import java.io.Serializable;
import java.util.List;


public class SectionVo implements Serializable {

    private List<Section> sectionList;

    public List<Section> getSectionList() {
        return sectionList;
    }

    public void setSectionList(List<Section> sectionList) {
        this.sectionList = sectionList;
    }
}
