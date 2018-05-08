package com.bawie.chenzhiqiang.loginreg_demo.model;

/**
 * Created by a on 2018/5/8.
 */

public interface RegListener {
    void regSuccess(String json);

    void regError(String error);
}
