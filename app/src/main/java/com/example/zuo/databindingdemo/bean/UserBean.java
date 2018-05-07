package com.example.zuo.databindingdemo.bean;

import android.databinding.BaseObservable;

/**
 * Created by zuo on 2018/5/2.
 */

public class UserBean extends BaseObservable {
    private String name;
    private int age;
    private boolean isValidAge;

    public UserBean(String name, int age, boolean isValidAge) {
        this.name = name;
        this.age = age;
        this.isValidAge = isValidAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isValidAge() {
        return isValidAge;
    }

    public void setValidAge(boolean validAge) {
        isValidAge = validAge;
    }
}
