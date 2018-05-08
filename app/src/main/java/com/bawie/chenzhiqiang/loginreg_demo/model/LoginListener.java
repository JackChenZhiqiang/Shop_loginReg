package com.bawie.chenzhiqiang.loginreg_demo.model;

/**
 * Created by a on 2018/5/8.
 */

public interface LoginListener {
    void loginSuccess(String json);

    void loginError(String error);
}
