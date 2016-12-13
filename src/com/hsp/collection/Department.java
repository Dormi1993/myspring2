package com.hsp.collection;

/**
 * Created by dormi.fu on 2016/12/13.
 */
public class Department {
    private String name;
    private String[] empName;//也可以是int类型的数组

    public String[] getEmpName() {
        return empName;
    }

    public void setEmpName(String[] empName) {
        this.empName = empName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
