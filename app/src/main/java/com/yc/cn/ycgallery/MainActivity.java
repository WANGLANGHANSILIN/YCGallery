package com.yc.cn.ycgallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 学习案例：
     * https://github.com/boycy815/PinchImageView
     * https://github.com/bm-x/PhotoView
     * https://github.com/ongakuer/PhotoDraweeView
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tv_1).setOnClickListener(this);
        findViewById(R.id.tv_2).setOnClickListener(this);
        findViewById(R.id.tv_3).setOnClickListener(this);
        findViewById(R.id.tv_4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_1:
                startActivity(new Intent(this, FirstActivity.class));
                break;
            case R.id.tv_2:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.tv_3:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
            case R.id.tv_4:
                startActivity(new Intent(this, FourActivity.class));
                break;
        }
    }
}
