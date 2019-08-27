package com.baizhi.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Component
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        if (e instanceof LoginException) {//登录异常
            try {
                modelAndView.setViewName("redirect:/login.jsp?message=" + URLEncoder.encode(e.getMessage(), "utf-8"));
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (e instanceof RegistException) {//注册异常
            try {
                modelAndView.setViewName("redirect:/regist.jsp?message=" + URLEncoder.encode(e.getMessage(), "utf-8"));
            } catch (UnsupportedEncodingException e1) {
                e1.printStackTrace();
            }
        }
        return modelAndView;
    }
}
