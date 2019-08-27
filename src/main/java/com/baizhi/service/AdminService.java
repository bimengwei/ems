package com.baizhi.service;

import com.baizhi.entity.Admin;

public interface AdminService {
    //通过用户名查询
    public void queryOne(String username, String password);

    //添加
    public void insertAdmin(Admin admin);

}
