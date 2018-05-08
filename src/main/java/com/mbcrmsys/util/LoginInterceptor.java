package com.mbcrmsys.util;

import com.mbcrmsys.common.Const;
import com.mbcrmsys.common.ServerResponse;
import com.mbcrmsys.pojo.Consumer;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by @Author tachai
 * date 2018/4/23 22:01
 *
 * @Email 1206966083@qq.com
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Consumer user=(Consumer)request.getSession().getAttribute(Const.CURRENT_USER);
        if(user!=null){
            return true;
        }else {
            response.sendRedirect("login.html");
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
