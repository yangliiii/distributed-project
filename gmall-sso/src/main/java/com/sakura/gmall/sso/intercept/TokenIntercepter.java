package com.sakura.gmall.sso.intercept;

import com.sakura.gmall.user.IUserCoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by lies on 2018/8/7.
 */
public class TokenIntercepter {
    private final String ACCESS_TOKEN="access_token";
//
//    @Autowired
//    IUserCoreService iUserCoreService;
//
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws Exception {
//
//        if(!(handler instanceof HandlerMethod)){
//            return true;
//        }
//
//        HandlerMethod handlerMethod=(HandlerMethod)handler;
//        Object bean=handlerMethod.getBean();
//
//        if(isAnoymous(handlerMethod)){
//            return true;
//        }
//        if(!(bean instanceof BaseController)){
//            throw new RuntimeException("must extend basecontroller");
//        }
//        String token=CookieUtil.getCookieValue(request,ACCESS_TOKEN);
//        boolean isAjax=CookieUtil.isAjax(request);
//        if(StringUtils.isEmpty(token)){
//            if(isAjax){
//                response.setContentType("text/html;charset=UTF-8");
//                response.getWriter().write("{\"code\":\"-1\",\"msg\":\"error\"}");
//                return false;
//            }
//            response.sendRedirect(GpmallWebConstant.GPMALL_SSO_ACCESS_URL);
//            return false;
//        }
//        CheckAuthRequest checkAuthRequest=new CheckAuthRequest();
//        checkAuthRequest.setToken(token);
//        CheckAuthResponse checkAuthResponse=iUserCoreService.validToken(checkAuthRequest);
//        if("000000".equals(checkAuthResponse.getCode())){
//            BaseController baseController=(BaseController)bean;
//            baseController.setUid(checkAuthResponse.getUid());
//            return super.preHandle(request, response, handler);
//        }
//        if(isAjax){
//            response.setContentType("text/html;charset=UTF-8");
//            response.getWriter().write("{\"code\":\""+checkAuthResponse.getCode()+"\"" +
//                    ",\"msg\":\""+checkAuthResponse.getMsg()+"\"}");
//            return false;
//        }
//        response.sendRedirect(GpmallWebConstant.GPMALL_SSO_ACCESS_URL);
//        return false;
//    }
//
//    private boolean isAnoymous(HandlerMethod handlerMethod){
//        Object bean=handlerMethod.getBean();
//        Class clazz=bean.getClass();
//        if(clazz.getAnnotation(Anoymous.class)!=null){
//            return true;
//        }
//        Method method=handlerMethod.getMethod();
//        return method.getAnnotation(Anoymous.class)!=null;
//    }

}
