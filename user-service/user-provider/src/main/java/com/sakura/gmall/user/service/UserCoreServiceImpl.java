package com.sakura.gmall.user.service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.sakura.gmall.user.IUserCoreService;
import com.sakura.gmall.user.constants.ResponseCodeEnum;
import com.sakura.gmall.user.dal.entity.User;
import com.sakura.gmall.user.dal.persistence.UserMapper;
import com.sakura.gmall.user.dto.UserLoginRequest;
import com.sakura.gmall.user.dto.UserLoginResponse;
import com.sakura.gmall.user.exception.ExceptionUtil;
import com.sakura.gmall.user.exception.ServiceException;
import com.sakura.gmall.user.exception.ValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lies on 2018/8/3.
 */
@Service("userCoreService")
public class UserCoreServiceImpl implements IUserCoreService {

    Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserMapper userMapper;

    @Override
    public UserLoginResponse login(UserLoginRequest request) {

        LOG.info("login request" + request);
        UserLoginResponse response = new UserLoginResponse();

        try {
            beforeValidate(request);
            User user = userMapper.getByUserName(request.getUsername());
            if (user == null || !user.getUsername().equals(request.getUsername())) {
                response.setCode(ResponseCodeEnum.USERORPASSWORD_ERRROR.getCode());
                response.setMessage(ResponseCodeEnum.USERORPASSWORD_ERRROR.getMsg());
                return response;
            }

            response.setUid(user.getId());
            response.setMobile(user.getMobile());
            response.setCode(ResponseCodeEnum.SUCCESS.getCode());
            response.setMessage(ResponseCodeEnum.SUCCESS.getMsg());


        } catch (Exception e) {
            LOG.info("login occur exception" + e);
            ServiceException serviceException = (ServiceException) ExceptionUtil.handlerException4biz(e);
            response.setCode(serviceException.getErrorCode());
            response.setMessage(serviceException.getErrorMessage());
        } finally {
            LOG.info("login response : " + response);
        }

        return response;
    }

    private void beforeValidate(UserLoginRequest request) {
        if (request == null) {
            throw new ValidateException("请求对象为空！");
        }
        if (StringUtils.isEmpty(request.getUsername())) {
            throw new ValidateException("用户名为空！");
        }
        if (StringUtils.isEmpty(request.getPassword())) {
            throw new ValidateException("密码为空!");
        }
    }
}
