package com.reggie.mvp_demo;

import static java.lang.Thread.sleep;

/**
 * Created by 24073 on 2018/5/20.
 */

public class MainPrestener implements MainContract.Presenter {

    MainContract.View mView;

    public MainPrestener(MainContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void loadData() {

        String s = "假装我是服务器端获取的数据";
        mView.onDataLoaded(s);

    }

    @Override
    public void functionA() {
        //巴拉巴拉 functionA 干了啥 干了一堆东西
        //。。。。。

        //干完了之后 调用view的方法 更新界面
        mView.onFunctionAFinished();
    }
}
