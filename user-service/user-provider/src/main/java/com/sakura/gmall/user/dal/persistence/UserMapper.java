package com.sakura.gmall.user.dal.persistence;

import com.sakura.gmall.user.dal.entity.User;

/**
 * Created by lies on 2018/8/3.
 */
public interface UserMapper {

    User getByUserName(String userName);
}
