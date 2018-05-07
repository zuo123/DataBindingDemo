package com.example.zuo.databindingdemo.base;

import android.view.View;

/**
 * 统一处理View的点击事件
 * @author zuo
 * @date 2018/5/7 7:57
 */
public interface ViewPresenter extends View.OnClickListener{
    @Override
    void onClick(View v);
}