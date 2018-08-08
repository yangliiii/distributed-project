package com.sakura.gmall.user.dto;

import com.sakura.gmall.user.abs.AbstractResponse;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/3.
 */
public class UserLoginResponse extends AbstractResponse{


    private static final long serialVersionUID = -5574716951996054496L;

    private Integer uid;
    private String avatar;
    private String mobile;

    private String token;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
