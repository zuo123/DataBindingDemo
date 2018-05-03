package com.example.zuo.databindingdemo.viewModel;

import android.app.Activity;
import android.view.View;
import android.widget.Toast;

import com.example.zuo.databindingdemo.base.BaseViewModel;
import com.example.zuo.databindingdemo.bean.UserBean;
import com.example.zuo.databindingdemo.databinding.ActivityMainBinding;

/**
 * 复杂逻辑处理
 * @author zuo
 * @date 2018/5/3 16:43
 */
public class MainActivityViewModel extends BaseViewModel {
    private Activity mActivity;
    private ActivityMainBinding mBinding;

    public MainActivityViewModel(Activity mActivity, ActivityMainBinding binding) {
        this.mActivity = mActivity;
        mBinding = binding;
    }

    public void viewClick(View view) {
        Toast.makeText(view.getContext(), "改变展示信息", Toast.LENGTH_SHORT).show();
        mBinding.setUser(new UserBean("王小二", 27,true));
    }

}
