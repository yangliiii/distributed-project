package com.sakura.gmall.user;

import com.sakura.gmall.user.dto.CheckAuthRequest;
import com.sakura.gmall.user.dto.CheckAuthResponse;
import com.sakura.gmall.user.dto.UserLoginRequest;
import com.sakura.gmall.user.dto.UserLoginResponse;

/**
 * Created by lies on 2018/8/3.
 */
public interface IUserCoreService {

    /**
     * 登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);

    CheckAuthResponse validToken(CheckAuthRequest request);

}
