package com.sakura.gmall.user.dto;

import com.sakura.gmall.user.abs.AbstractResponse;

/**
 * Created by lies on 2018/8/8.
 */
public class CheckAuthResponse extends AbstractResponse {
    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "CheckAuthResponse{" +
                "uid='" + uid + '\'' +
                '}';
    }
}
