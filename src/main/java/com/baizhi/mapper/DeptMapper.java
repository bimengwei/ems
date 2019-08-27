package com.baizhi.mapper;

import com.baizhi.entity.Department;

import java.util.List;

public interface DeptMapper {
    //查所有部门
    public List<Department> queryAllDept();
}
