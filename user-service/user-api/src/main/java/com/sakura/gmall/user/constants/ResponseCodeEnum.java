package com.sakura.gmall.user.constants;

/**
 * Created by lies on 2018/8/3.
 */
public enum ResponseCodeEnum {

    SYSTEM_ERROR("0001","系统未知错误"),
    SYS_PARAM_NOT_RIGHT("0002","参数不正确"),
    SYSTEM_BUSY("0003","系统繁忙"),
    USERORPASSWORD_ERRROR("0004","用户名或者密码错误"),
    SUCCESS("0005","登录成功");

    private String code;
    private String msg;

    ResponseCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
