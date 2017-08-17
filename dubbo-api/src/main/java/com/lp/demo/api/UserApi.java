package com.lp.demo.api;

import com.lp.demo.bean.UserBean;

/**
 * Created by lvping on 2017/7/21.
 */
public interface UserApi {
    UserBean getUserBean(UserBean userBean);

    UserBean getUserInfo(UserBean userBean);
}
