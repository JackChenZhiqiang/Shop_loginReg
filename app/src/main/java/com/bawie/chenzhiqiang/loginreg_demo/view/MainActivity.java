package com.bawie.chenzhiqiang.loginreg_demo.view;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.bawie.chenzhiqiang.loginreg_demo.R;
import com.bawie.chenzhiqiang.loginreg_demo.model.ModelImpel;
import com.bawie.chenzhiqiang.loginreg_demo.presenter.PresenterImpel;

public class MainActivity extends AppCompatActivity implements ILoginView{

    private EditText name;
    private EditText pwd;
    private ProgressBar bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        initDatas();

    }

    private void initDatas() {
        name = findViewById (R.id.name);

        pwd = findViewById (R.id.pwd);

        bar = findViewById (R.id.bar);

        Button login = findViewById (R.id.login);

        login.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                PresenterImpel presenterImpel = new PresenterImpel ();

                presenterImpel.ShowLoginToView (new ModelImpel (),MainActivity.this);
            }
        });

        Button reg = findViewById (R.id.reg);

        reg.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                startActivity (new Intent (MainActivity.this,RegActivity.class));
            }
        });
    }

    @Override
    public String getMobile() {
        return name.getText ().toString ();
    }

    @Override
    public String getPwd() {
        return pwd.getText ().toString ();
    }

    @Override
    public void showSuccess() {
        bar.setVisibility (ProgressBar.VISIBLE);

        Toast.makeText (MainActivity.this,"登录成功··跳转页面",Toast.LENGTH_SHORT).show ();
    }

    @Override
    public void showError() {
        bar.setVisibility (ProgressBar.GONE);

        Toast.makeText (MainActivity.this,"登录失败··",Toast.LENGTH_SHORT).show ();

        startActivity (new Intent (MainActivity.this,RegActivity.class));
    }
}
