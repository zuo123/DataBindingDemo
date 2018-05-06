package com.example.zuo.databindingdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.zuo.databindingdemo.base.BaseActivity;
import com.example.zuo.databindingdemo.bean.UserBean;
import com.example.zuo.databindingdemo.databinding.ActivityMainBinding;
import com.example.zuo.databindingdemo.viewModel.MainActivityViewModel;

/**
*@author zuo
*@date 2018/5/3 17:17
*/
public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;
    private UserBean user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        user = new UserBean("王小二", 27,false);
        binding.setUser(user);
        binding.setViewModel(new MainActivityViewModel(MainActivity.this,binding));
        binding.setLarge(true);
    }

}

