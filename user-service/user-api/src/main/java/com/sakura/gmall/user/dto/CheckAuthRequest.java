package com.sakura.gmall.user.dto;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/8.
 */
public class CheckAuthRequest implements Serializable {

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "CheckAuthRequest{" +
                "token='" + token + '\'' +
                '}';
    }
}
