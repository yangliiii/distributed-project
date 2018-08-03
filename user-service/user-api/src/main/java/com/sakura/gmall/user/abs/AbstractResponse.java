package com.sakura.gmall.user.abs;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/3.
 */
public abstract class AbstractResponse implements Serializable {
    private static final long serialVersionUID = -416062285931365951L;

    private String code;
    private Object message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
