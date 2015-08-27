package com.cafeteria.arsh.myproject;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Scene;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import android.widget.ImageView;

import com.cafeteria.arsh.myproject.adapters.RecyclerViewAdapter;

/**
 * Created by fake on 8/22/2015.
 */
public class Breakfast extends MyAppCompatActivity {


    Toolbar mToolBar;
    CollapsingToolbarLayout collapsingToolbarLayout;
    RecyclerView mRecyclerView;
    RecyclerViewAdapter mAdapter;
    ImageView ivHeader;
    Transition mTransition;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(this, R.layout.breakfast);

        initViews();
        mToolBar.setTitle("BREAKFAST");
        mToolBar.setNavigationIcon(getResources().getDrawable(R.drawable.navigation_icon));
        collapsingToolbarLayout.setTitle("BREAKFAST");
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(android.R.color.holo_red_dark));
        mRecyclerView.setAdapter(mAdapter);
        ivHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Scene scene = Scene.getSceneForLayout()
            }
        });


    }

    public void initViews(){

        ivHeader = (ImageView)findViewById(R.id.header);
        mToolBar = (Toolbar)findViewById(R.id.mToolbar);
        collapsingToolbarLayout = (CollapsingToolbarLayout)findViewById(R.id.mCollapsingToolbar);
        mRecyclerView = (RecyclerView)findViewById(R.id.myRecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new RecyclerViewAdapter(this);
    }

    private void setupWindowAnimations() {
        Explode explode = new Explode();
        explode.setDuration(5000);
        getWindow().setExitTransition(explode);
    }
}
