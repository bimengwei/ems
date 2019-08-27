package com.baizhi.controller;

import com.baizhi.entity.Department;
import com.baizhi.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping("/queryAllDept")
    public String queryAllDept(HttpServletRequest request) {
        List<Department> deptList = deptService.queryAllDept();
        request.setAttribute("deptList", deptList);
        return "departments";

    }

    @RequestMapping("/queryDept")
    @ResponseBody
    //回显部门信息
    public List<Department> queryDept() {
        List<Department> list = deptService.queryAllDept();
        return list;
    }

}
