package com.hsp.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by dormi.fu on 2016/12/13.
 */
public class Department {
    private String name;
    private String[] empName;//数组，也可以是int类型的数组
    private List<Employee> empList;//list集合
    private Set<Employee> empSet;//set集合
    private Map<String, Employee> empMaps;//map集合
    private Properties pp;//properties的使用

    public Properties getPp() {
        return pp;
    }

    public void setPp(Properties pp) {
        this.pp = pp;
    }

    public Map<String, Employee> getEmpMaps() {
        return empMaps;
    }

    public void setEmpMaps(Map<String, Employee> empMaps) {
        this.empMaps = empMaps;
    }

    public Set<Employee> getEmpSet() {
        return empSet;
    }

    public void setEmpSet(Set<Employee> empSet) {
        this.empSet = empSet;
    }

    public List<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee> empList) {
        this.empList = empList;
    }

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
