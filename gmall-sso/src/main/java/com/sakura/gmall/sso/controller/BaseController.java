package com.sakura.gmall.sso.controller;

/**
 * Created by lies on 2018/8/8.
 */
public class BaseController {

    static  ThreadLocal<String> uidThreadLocal=new ThreadLocal<>();

    public void setUid(String uid){
        uidThreadLocal.set(uid);
    }
    public String getUid(){
        return  uidThreadLocal.get();
    }

}
