package com.example.zuo.databindingdemo.base;

import java.util.List;

/**
 * @author zuo
 * @date 2018/5/3 17:26
 */
public interface PermissionListener {
    //授权，同意
    void onGranted();
    //拒绝
    void onDenied(List<String> deniedPermission);
}
