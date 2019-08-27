package com.baizhi.controller;

import com.baizhi.entity.Admin;
import com.baizhi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    //登录
    @RequestMapping("/login")
    public String login(Admin admin, HttpServletRequest request) {
        adminService.queryOne(admin.getUsername(), admin.getPassword());
        //存放登录标记
        request.getSession(true).setAttribute("username", admin.getUsername());
        return "redirect:/dept/queryAllDept";
    }

    //注册
    @RequestMapping("/regist")
    public String regist(Admin admin, HttpServletRequest request) {
        adminService.insertAdmin(admin);

        //存放登录标记
        request.getSession(true).setAttribute("username", admin.getUsername());
        return "redirect:/dept/queryAllDept";

    }

}
