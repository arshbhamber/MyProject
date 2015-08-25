package com.cafeteria.arsh.myproject;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by fake on 8/17/2015.
 */
public class MyAppCompatActivity extends AppCompatActivity {

    DrawerLayout mDrawer;
    Context mContext;
    NavigationView leftDrawer;
    NavigationView rightDrawer;
    FrameLayout mFrameLayout;
    Toolbar mToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_main_layout);
        initViews();

    }

    private void initViews() {

        mDrawer = (DrawerLayout)findViewById(R.id.mDrawer);
        leftDrawer = (NavigationView)findViewById(R.id.leftDrawer);
        rightDrawer = (NavigationView)findViewById(R.id.rightDrawer);
        mFrameLayout = (FrameLayout)findViewById(R.id.mainFrameLayout);
        mToolBar = (Toolbar)findViewById(R.id.mToolbar);

    }

    public void setUpToolbar(){

        setSupportActionBar(mToolBar);

    }

    protected void setLayout(Context context,int resId){

        mContext = context;
        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View contentView = inflater.inflate(resId, null, false);
        mFrameLayout.addView(contentView, 0);


    }

}
