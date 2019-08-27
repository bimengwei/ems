package com.baizhi.service;

import com.baizhi.entity.Admin;
import com.baizhi.exception.LoginException;
import com.baizhi.exception.RegistException;
import com.baizhi.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Scope(value = "singleton")//单例
@Transactional(propagation = Propagation.REQUIRED)//方法上用默认的
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)//查询用这个属性
    public void queryOne(String username, String password) {
        Admin admin = adminMapper.queryOne(username);
        if (admin == null) {
            throw new LoginException("用户不存在");
        }
        if (!password.equals(admin.getPassword())) {
            throw new LoginException("密码错误");
        }


    }

    @Override
    public void insertAdmin(Admin admin) {
        if (admin.getUsername() == null || admin.getUsername().isEmpty()) {
            throw new RegistException("姓名不可为空");
        }
        adminMapper.insertAdmin(admin);
    }
}
