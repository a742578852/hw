package com.information.five.util;

import com.information.five.model.SystemAdmin;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtils {

    public static final String SUBJECT = "tzt";

    public static final long EXPIRE = 1000*60*60*24*7;//过期时间，毫秒，一周

    public static final String APPSECRET = "zt2020";//秘钥

    /**
     * 生成jwt
     * @param useUser
     * @return
     */
    public static String geneJsonToken(SystemAdmin systemAdmin,String db){
        if (systemAdmin == null){
            return null;
        }
        String token = Jwts.builder().setSubject(SUBJECT)
                .claim("id",systemAdmin.getId())//加入用户数据
                .claim("db",db)//db
                .setIssuedAt(new Date())//设置发放时间
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRE))//设置过期时间
                .signWith(SignatureAlgorithm.HS256,APPSECRET).compact();//设置签名(签名是自己设置 防止别人通过相同算法篡改)

        return token;
    }

    /**
     * 校验jwt
     * @param token
     * @return
     */
    public static Claims checkJWT(String token){

        try {
            final Claims claims = Jwts.parser().setSigningKey(APPSECRET).
                    parseClaimsJws(token).getBody();
            return claims;
        }catch (Exception e){
            return null;
        }
    }
}
