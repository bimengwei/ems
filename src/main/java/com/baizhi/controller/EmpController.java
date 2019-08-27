package com.baizhi.controller;

import com.baizhi.entity.Employee;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    //添加员工
    @RequestMapping("/insertEmp")
    public String insertEmp(Employee employee, MultipartFile src, HttpServletRequest request) throws IOException {
        //由相对路径获得绝对路径
        String realPath = request.getSession(true).getServletContext().getRealPath("/img");

        //获得文件名
        String filename = src.getOriginalFilename();

        //拼接目标路径
        String path = realPath + "/" + filename;

        //copy上传文件到path
        src.transferTo(new File(path));

        //设置图片路径
        employee.setPicture(filename);
        System.out.println(employee);
        empService.insertEmp(employee);
        return "redirect:/dept/queryAllDept";
    }
}
