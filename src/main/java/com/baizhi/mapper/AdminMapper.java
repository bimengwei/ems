package com.baizhi.mapper;

import com.baizhi.entity.Admin;

public interface AdminMapper {
    //通过用户名查询
    public Admin queryOne(String username);

    //添加
    public void insertAdmin(Admin admin);
}
