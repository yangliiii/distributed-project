package com.sakura.gmall.sso.controller;

import com.sakura.gmall.common.annotation.Anoymous;
import com.sakura.gmall.user.IUserCoreService;
import com.sakura.gmall.user.dto.UserLoginRequest;
import com.sakura.gmall.user.dto.UserLoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lies on 2018/8/7.
 */
@RestController
public class UserController extends BaseController {

    @Autowired
    IUserCoreService userCoreService;

    @Anoymous
    @PostMapping("/login")
    public ResponseEntity login(String username, String password){
        UserLoginRequest request = new UserLoginRequest();
        request.setUsername(username);
        request.setPassword(password);
        UserLoginResponse response = userCoreService.login(request);
        return ResponseEntity.ok(response);
    }
}
