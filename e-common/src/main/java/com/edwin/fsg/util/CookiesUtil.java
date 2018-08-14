package com.edwin.fsg.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.edwin.fsg.common.Constants;

public class CookiesUtil {
	
	private final static String COOKIE_DOMAIN = ".yulang.com";
	private static final Logger log =LoggerFactory.getLogger(CookiesUtil.class);
	
	
	public static String getCookieValue(HttpServletRequest request){
        Cookie[] cks = request.getCookies();
        if(cks != null){
            for(Cookie ck : cks){
                log.info("read cookieName:{},cookieValue:{}",ck.getName(),ck.getValue());
                if(StringUtils.equals(ck.getName(),Constants.COOKIES_NAME_SESSION)){
                    log.info("return cookieName:{},cookieValue:{}",ck.getName(),ck.getValue());
                    return ck.getValue();
                }
            }
        }
        return null;
    }
	
	 //X:domain=".happymmall.com"
    //a:A.happymmall.com            cookie:domain=A.happymmall.com;path="/"
    //b:B.happymmall.com            cookie:domain=B.happymmall.com;path="/"
    //c:A.happymmall.com/test/cc    cookie:domain=A.happymmall.com;path="/test/cc"
    //d:A.happymmall.com/test/dd    cookie:domain=A.happymmall.com;path="/test/dd"
    //e:A.happymmall.com/test       cookie:domain=A.happymmall.com;path="/test"
	public static void saveCookie(String cookieName,String cookieValue,HttpServletResponse response) {
		Cookie cookie =new Cookie(cookieName, cookieValue);
		cookie.setDomain(COOKIE_DOMAIN);
		cookie.setHttpOnly(true);
		cookie.setPath("/");//代表设置在根目录
		  //单位是秒。
        //如果这个maxage不设置的话，cookie就不会写入硬盘，而是写在内存。只在当前页面有效
		cookie.setMaxAge(60 * 60 * 24 * 360);  ////如果是-1，代表永久
		log.info("write cookieName:{},cookieValue:{}",cookie.getName(),cookie.getValue());
	    response.addCookie(cookie);
	}
	
	public static void delLoginToken(HttpServletRequest request,HttpServletResponse response){
        Cookie[] cks = request.getCookies();
        if(cks != null){
            for(Cookie ck : cks){
                if(StringUtils.equals(ck.getName(),Constants.COOKIES_NAME_SESSION)){
                    ck.setDomain(COOKIE_DOMAIN);
                    ck.setPath("/");
                    ck.setMaxAge(0);//设置成0，代表删除此cookie。
                    log.info("del cookieName:{},cookieValue:{}",ck.getName(),ck.getValue());
                    response.addCookie(ck);
                    return;
                }
            }
        }
    }
}
