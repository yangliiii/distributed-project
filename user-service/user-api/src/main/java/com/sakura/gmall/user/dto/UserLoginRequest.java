package com.sakura.gmall.user.dto;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/3.
 */
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -346698324162550934L;

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
