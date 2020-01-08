package com.reggie.mvp_demo;

/**
 * Created by 24073 on 2018/5/20.
 */

public interface MainContract {

    interface Presenter{
        void loadData();
        void functionA();
    }

    interface View {
        void onDataLoaded(String s);
        void onFunctionAFinished();
    }

}
