package com.baizhi.entity;

import java.io.Serializable;

public class Department implements Serializable {
    private Integer id;
    private String departmentNum;
    private String departmentName;

    public Department() {
    }

    public Department(Integer id, String departmentNum, String departmentName) {
        this.id = id;
        this.departmentNum = departmentNum;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentNum='" + departmentNum + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(String departmentNum) {
        this.departmentNum = departmentNum;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
