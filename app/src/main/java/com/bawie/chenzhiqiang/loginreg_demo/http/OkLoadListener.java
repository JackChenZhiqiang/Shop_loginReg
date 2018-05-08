package com.bawie.chenzhiqiang.loginreg_demo.http;

/**
 * Created by a on 2018/5/8.
 */

public interface OkLoadListener {
    void okLoadSuccess(String json);

    void okLoadError(String error);
}
