package com.bawie.chenzhiqiang.loginreg_demo.presenter;

import com.bawie.chenzhiqiang.loginreg_demo.model.IModel;
import com.bawie.chenzhiqiang.loginreg_demo.view.ILoginView;
import com.bawie.chenzhiqiang.loginreg_demo.view.IRegView;

/**
 * Created by a on 2018/5/8.
 */

public interface IPresenter {
    void ShowLoginToView(IModel iModel, ILoginView iLoginView);

    void ShowRegToView(IModel iModel, IRegView iRegView);
}
