package com.cafeteria.arsh.myproject;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.transition.Explode;
import android.transition.TransitionInflater;

/**
 * Created by fake on 8/20/2015.
 */
public class HomePage extends MyAppCompatActivity {


    TabLayout homeTabLayout;
    ViewPager homeViewPager;
//    RecyclerView recyclerView;
//    SampleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(this, R.layout.breakfast);
//        initViews();
//        setUpToolbar();
//        adapter = new SampleAdapter(this);
//        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
//        recyclerView.setAdapter(adapter);
        setupWindowAnimations();

    }


    private void setupWindowAnimations() {
        Explode explode = new Explode();
        explode.setDuration(2000);
        getWindow().setExitTransition(explode);
    }

    public void initViews(){

        homeTabLayout = (TabLayout)findViewById(R.id.homeTabLayout);
        homeViewPager = (ViewPager)findViewById(R.id.homeViewPager);


    }
}
