package com.cafeteria.arsh.myproject;

import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by arshdeep.singh on 26-08-2015.
 */
public class DetailsPage extends MyAppCompatActivity {
    ImageView mImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_details_page);

        mImageView = (ImageView)findViewById(R.id.mImageView);
        mImageView.setImageResource(R.drawable.headerimage);


    }



}
