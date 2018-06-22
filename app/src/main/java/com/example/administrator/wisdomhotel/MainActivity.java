package com.example.administrator.wisdomhotel;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private String mTitleArray[] = {"首页", "发现", "智控", "我的"};
    private int mImageViewArray[] = {R.drawable.icon_home, R.drawable.icon_find, R.drawable.icon_ctrl, R.drawable.icon_mine};

    private BottomNavigationBar mBottomNavigationBar;

    private List<Fragment> allFragments;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.administrator.wisdomhotel.R.layout.activity_main);

        setBottomNavigationBar();

        setDefaultFragment();


    }

    private void setDefaultFragment() {

        allFragments=new ArrayList<>();
        allFragments.add(new com.example.administrator.wisdomhotel.fragment.FragmentHome());
        allFragments.add(new com.example.administrator.wisdomhotel.fragment.FragmentFind());
        allFragments.add(new com.example.administrator.wisdomhotel.fragment.FragmentCtrl());
        allFragments.add(new com.example.administrator.wisdomhotel.fragment.FragmentMine());

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(com.example.administrator.wisdomhotel.R.id.content_frameLayout,allFragments.get(0));
        transaction.commit();
    }
    private void setBottomNavigationBar() {

        mBottomNavigationBar = findViewById(com.example.administrator.wisdomhotel.R.id.bottom_navigation_bar);

        mBottomNavigationBar//设置模式
                .setMode(BottomNavigationBar.MODE_FIXED)
                //设置背景颜色
                .setBarBackgroundColor(com.example.administrator.wisdomhotel.R.color.white)
                //设置每个item的颜色
                .setInActiveColor(com.example.administrator.wisdomhotel.R.color.black)
                .setActiveColor(com.example.administrator.wisdomhotel.R.color.blue)
                //
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC)
                //
                .addItem(new BottomNavigationItem(mImageViewArray[0], mTitleArray[0]))
                .addItem(new BottomNavigationItem(mImageViewArray[1], mTitleArray[1]))
                .addItem(new BottomNavigationItem(mImageViewArray[2], mTitleArray[2]))
                .addItem(new BottomNavigationItem(mImageViewArray[3], mTitleArray[3]))
                .initialise();

        mBottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                //未选中->选中
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(com.example.administrator.wisdomhotel.R.id.content_frameLayout,allFragments.get(position));
                transaction.commit();

            }
            @Override
            public void onTabUnselected(int position) {
                //选中->未选中
            }
            @Override
            public void onTabReselected(int position) {
                //选中->选中
            }
        });

    }

}
