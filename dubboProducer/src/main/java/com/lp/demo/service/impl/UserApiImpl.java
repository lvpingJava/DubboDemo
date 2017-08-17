package com.lp.demo.service.impl;

import com.lp.demo.api.UserApi;
import com.lp.demo.bean.UserBean;
import org.springframework.stereotype.Service;

/**
 * Created by lvping on 2017/7/25.
 */
@Service("userApi")
public class UserApiImpl implements UserApi {
    @Override
    public UserBean getUserBean(UserBean userBean) {
        UserBean userBean1=new UserBean();
        userBean1.setUserName("路飞");
        return userBean1;
    }

    @Override
    public UserBean getUserInfo(UserBean userBean) {
        UserBean userBean1=new UserBean();
        userBean1.setUserName("乔巴");
        userBean1.setAge(20);
        userBean1.setSex("男");
        return userBean1;
    }
}
