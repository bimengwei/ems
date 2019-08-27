package com.baizhi.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class myInterceptor implements HandlerInterceptor {
    @Override
    //登录验证
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        System.out.println("prehandle");
        String username = (String) httpServletRequest.getSession(true).getAttribute("username");
        if (username == null) {
            System.out.println("if");
            httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/login.jsp");
            return false;
        } else {
            return true;//放行继续执行控制器方法
        }

    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
