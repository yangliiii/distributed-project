package com.sakura.gmall.user.dto;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/3.
 */
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -346698324162550934L;

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
