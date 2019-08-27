package com.baizhi.service;

import com.baizhi.entity.Department;
import com.baizhi.mapper.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Department> queryAllDept() {
        List<Department> list = deptMapper.queryAllDept();
        return list;
    }
}
