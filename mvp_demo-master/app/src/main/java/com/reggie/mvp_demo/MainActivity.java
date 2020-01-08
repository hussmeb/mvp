package com.reggie.mvp_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private TextView mTextView;
    private Button mButton;
    private MainPrestener mPrestener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.tv_display);
        mButton = findViewById(R.id.btn_loaddata);
        mPrestener = new MainPrestener(this);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPrestener.loadData();
                mPrestener.functionA();
            }
        });

    }

    @Override
    public void onDataLoaded(String s) {
        mTextView.setText(s);
    }

    @Override
    public void onFunctionAFinished() {
        //我被调用了   要更新界面了
        //界面更新的操作  巴拉巴拉
        mTextView.setText("更新了");
    }

}
