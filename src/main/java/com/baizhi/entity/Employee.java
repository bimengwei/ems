package com.baizhi.entity;

import java.io.Serializable;

public class Employee implements Serializable {
    private Integer id;
    private String picture;
    private String name;
    private double salary;
    private int age;
    private Department department;

    public Employee() {
    }

    public Employee(Integer id, String picture, String name, double salary, int age, Department department) {
        this.id = id;
        this.picture = picture;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "com.baizhi.entity.employee{" +
                "id='" + id + '\'' +
                ", picture='" + picture + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", department=" + department +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
