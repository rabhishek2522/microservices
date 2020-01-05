package com.in.microservices.currencyconvertservice.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomTimeInterceptor extends HandlerInterceptorAdapter {

    public static final Logger logger= LoggerFactory.getLogger(CustomTimeInterceptor.class);
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
logger.info("Request URL : "+request.getRequestURL().toString()
+ "Start Time of Request"+System.currentTimeMillis() );
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
    }
}
