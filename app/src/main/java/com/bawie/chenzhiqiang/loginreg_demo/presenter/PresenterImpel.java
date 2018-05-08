package com.bawie.chenzhiqiang.loginreg_demo.presenter;

import com.bawie.chenzhiqiang.loginreg_demo.http.HttpConfig;
import com.bawie.chenzhiqiang.loginreg_demo.model.IModel;
import com.bawie.chenzhiqiang.loginreg_demo.model.LoginListener;
import com.bawie.chenzhiqiang.loginreg_demo.model.RegListener;
import com.bawie.chenzhiqiang.loginreg_demo.view.ILoginView;
import com.bawie.chenzhiqiang.loginreg_demo.view.IRegView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by a on 2018/5/8.
 */

public class PresenterImpel implements IPresenter {
    @Override
    public void ShowLoginToView(IModel iModel, final ILoginView iLoginView) {
        Map<String,String> map = new HashMap<> ();

        map.put ("mobile",iLoginView.getMobile ());

        map.put ("password",iLoginView.getPwd ());

        iModel.getLoginDatas (HttpConfig.url, map, new LoginListener () {
            @Override
            public void loginSuccess(String json) {
                iLoginView.showSuccess ();
            }

            @Override
            public void loginError(String error) {
                iLoginView.showError ();
            }
        });
    }

    @Override
    public void ShowRegToView(IModel iModel, final IRegView iRegView) {
        Map<String,String> map = new HashMap<> ();

        map.put ("mobile",iRegView.getMobile ());

        map.put ("password",iRegView.getPwd ());

        iModel.getRegDatas (HttpConfig.reg_url, map, new RegListener () {
            @Override
            public void regSuccess(String json) {
                iRegView.showSuccess ();
            }

            @Override
            public void regError(String error) {
                iRegView.showError ();
            }
        });
    }
}
