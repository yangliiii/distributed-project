package com.sakura.gmall.user;

import com.sakura.gmall.user.dto.UserLoginRequest;
import com.sakura.gmall.user.dto.UserLoginResponse;

/**
 * Created by lies on 2018/8/3.
 */
public interface IUserCoreService {

    UserLoginResponse login(UserLoginRequest request);
}
