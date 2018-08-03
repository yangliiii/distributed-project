package com.sakura.gmall.user.abs;

import java.io.Serializable;

/**
 * Created by lies on 2018/8/3.
 */
public abstract class AbstractResponse implements Serializable {
    private static final long serialVersionUID = -416062285931365951L;

    private int code;
    private Object message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
