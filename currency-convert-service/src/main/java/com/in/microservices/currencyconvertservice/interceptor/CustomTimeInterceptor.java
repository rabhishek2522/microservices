package com.in.microservices.currencyconvertservice.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class CustomTimeInterceptor extends HandlerInterceptorAdapter {

    public static final Logger logger= LoggerFactory.getLogger(CustomTimeInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime= System.currentTimeMillis();
        logger.info("Request URL : "+request.getRequestURL().toString()
            + " Start Time of Request : " +System.currentTimeMillis());
     request.setAttribute("startTime",startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
        logger.info("Request URL : "+request.getRequestURL().toString()
                + " Send to Adapter : Time of Request : "+System.currentTimeMillis());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        logger.info("Request URL : "+request.getRequestURL().toString()
                + "After completion Request :"+System.currentTimeMillis());
    }

}
