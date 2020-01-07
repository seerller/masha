package com.masha.out;

import java.io.Serializable;
import java.util.List;


/**
 * 医生管理有个组别关系，我是提供部门数据返回给你的
 */
public class DepartmentVo implements Serializable {

    private List<Department> mainList; //主属部门
    private List<Department> subList;//附属部门

    public List<Department> getMainList() {
        return mainList;
    }

    public void setMainList(List<Department> mainList) {
        this.mainList = mainList;
    }

    public List<Department> getSubList() {
        return subList;
    }

    public void setSubList(List<Department> subList) {
        this.subList = subList;
    }
}
