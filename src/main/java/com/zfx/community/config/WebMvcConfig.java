package com.zfx.community.config;

import com.zfx.community.controller.interceptor.DemoInterceptor;
import com.zfx.community.controller.interceptor.LoginRequiredInterceptor;
import com.zfx.community.controller.interceptor.LoginTicketInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author zfx
 * @date 2022/4/9 18:51
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private LoginTicketInterceptor loginTicketInterceptor;

    @Autowired
    private DemoInterceptor demoInterceptor;

    @Autowired
    private LoginRequiredInterceptor loginRequiredInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginTicketInterceptor).
                excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");

        registry.addInterceptor(demoInterceptor).
                excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");

        registry.addInterceptor(loginRequiredInterceptor).
                excludePathPatterns("/**/*.css","/**/*.js","/**/*.png","/**/*.jpg","/**/*.jpeg");

    }
}
