package com.baizhi.service;

import com.baizhi.entity.Employee;
import com.baizhi.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public void insertEmp(Employee employee) {
        empMapper.insertEmp(employee);
    }
}
