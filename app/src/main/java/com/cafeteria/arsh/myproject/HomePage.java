package com.cafeteria.arsh.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.transition.Explode;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.cafeteria.arsh.myproject.adapters.HomePagerAdapter;

/**
 * Created by fake on 8/20/2015.
 */
public class HomePage extends MyAppCompatActivity {


    TabLayout homeTabLayout;
    ViewPager homeViewPager;
    HomePagerAdapter mAdapter;
    LinearLayout mImageView,ll2;
    ImageView frontImage,backImage;
    Button searchButton;
//    RecyclerView recyclerView;
//    SampleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setLayout(this, R.layout.home_page);
        initViews();
        mImageView = (LinearLayout)findViewById(R.id.homelinearlayout);
        ll2 = (LinearLayout)findViewById(R.id.homelinearlayout2);
        frontImage = (ImageView)findViewById(R.id.frontImage);
        backImage = (ImageView)findViewById(R.id.backImage);

//        setUpToolbar();
//        adapter = new SampleAdapter(this);
//        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
//        recyclerView.setAdapter(adapter);

        homeViewPager.setAdapter(mAdapter);
        homeTabLayout.setupWithViewPager(homeViewPager);
        for(int i=0;i<mAdapter.getCount();i++){

            homeTabLayout.getTabAt(i).setText("TAB "+(i+1));

        }

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i;
                switch (homeViewPager.getCurrentItem()){

                    case 0:
                        i = new Intent(HomePage.this,ActivityItemList.class);
                        startActivity(i);
                        break;
                    case 1:
                        i = new Intent(HomePage.this,ActivityItemList.class);
                        startActivity(i);
                        break;
                    case 2:
                        i = new Intent(HomePage.this,ActivityItemList.class);
                        startActivity(i);
                        break;


                }



            }
        });



        homeViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


                switch (position){

                    case 0:
                        frontImage.setImageResource(R.drawable.breakfastfinal);
                        backImage.setImageResource(R.drawable.lunch);
                        break;
                    case 1:
                        frontImage.setImageResource(R.drawable.lunch);
                        backImage.setImageResource(R.drawable.image1);
                        break;
                    case 2:
                        frontImage.setImageResource(R.drawable.image1);
                        backImage.setImageResource(R.drawable.breakfast_3);
                        break;

                }

                Log.e("offset",""+positionOffsetPixels);
                Log.e("pivotx of viewpager","" + homeViewPager.getPivotX());
                Log.e("pivoty of viewpager", "" + homeViewPager.getPivotY());
//                mImageView.setScaleX(1.0f - positionOffset);
                ViewGroup.LayoutParams params = mImageView.getLayoutParams();
                Log.e("width",params.width+"");
                params.width =  getWindowManager().getDefaultDisplay().getWidth() - positionOffsetPixels;

                mImageView.setLayoutParams(params);

                params = ll2.getLayoutParams();
                params.width =  getWindowManager().getDefaultDisplay().getWidth();

                ll2.setLayoutParams(params);

            }

            @Override
            public void onPageSelected(int position) {
//
//                switch (position){
//
//                    case 0:
//                        frontImage.setImageResource(R.drawable.headerimage);
//                        backImage.setImageResource(R.drawable.breakfast);
//                        break;
//                    case 1:
//                        frontImage.setImageResource(R.drawable.breakfast);
//                        backImage.setImageResource(R.drawable.breakfast1);
//                        break;
//                    case 2:
//                        frontImage.setImageResource(R.drawable.breakfast1);
//                        backImage.setImageResource(R.drawable.breakfast_3);
//                        break;
//
//                }

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    private void setupWindowAnimations() {
        Explode explode = new Explode();
        explode.setDuration(2000);
        getWindow().setExitTransition(explode);
    }

    public void initViews(){

        homeTabLayout = (TabLayout)findViewById(R.id.homeTabLayout);
        homeViewPager = (ViewPager)findViewById(R.id.homeViewPager);
        mAdapter = new HomePagerAdapter(this);
        searchButton = (Button)findViewById(R.id.btnSearch);


    }
    public void addTabs(){




    }
}
