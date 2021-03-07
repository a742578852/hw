package com.information.five.intecpter;

import com.google.gson.Gson;

import com.information.five.model.SystemAdmin;
import com.information.five.service.SystemAdminService;
import com.information.five.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Component
public class LoginIntercepter implements HandlerInterceptor {

    private static final Gson gson = new Gson();
    @Autowired
    SystemAdminService systemAdminService;


    //进入方法前
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Map map = new HashMap(4);
        String token = request.getHeader("token");
        if (token == null){
            token  = request.getParameter("token");
        }
        if(token != null){
            Claims claims = JwtUtils.checkJWT(token);
            if (claims != null) {
               // Integer id = (Integer) claims.get("id");
                Long id = Long.parseLong(claims.get("id").toString());
                String db = (String) claims.get("db");


//                if (!(identification.equals(userLogin.getIdentification()))) {
//                    map.put("code", 201);
//                    map.put("message", "您的账号已在其他地方登录,您已被强制下线,请重新登录");
//                    sendMessage(response, map);
//                    return false;
//                }
               // userLogin.setConnectionTime(new Date());
                //usersLoginService.updateUserLogin(userLogin);
                request.setAttribute("id",id);
                request.setAttribute("db",db);
                return true;
            }
        }
        map.put("code",201);
        map.put("message","请登录");
        sendMessage(response,map);
        return false;
    }

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        // 设置允许跨域请求的域名
        config.addAllowedOrigin("*");
        // 是否允许证书 不再默认开启
        // config.setAllowCredentials(true);
        // 设置允许的方法
        config.addAllowedMethod("*");
        // 允许任何头
        config.addAllowedHeader("*");
        config.addExposedHeader("token");
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", config);
        return new CorsFilter(configSource);
    }


    /*
    数据返回
     */
    public static void sendMessage(HttpServletResponse response, Object object)throws Exception{
        response.setContentType("application/json;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print(gson.toJson(object));
        writer.close();
        response.flushBuffer();

    }


    //进入方法后，视图渲染前

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }


    //所有完成之后

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }

}
