package com.cafeteria.arsh.myproject.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.cafeteria.arsh.myproject.R;

import java.util.ArrayList;

/**
 * Created by fake on 8/21/2015.
 */
public class HomePagerAdapter extends PagerAdapter {

    Context mContext;
    ArrayList<Integer> imageList;

    public HomePagerAdapter(Context context){

        mContext = context;
        imageList = new ArrayList<Integer>();
        imageList.add(R.drawable.breakfast);
        imageList.add(R.drawable.breakfast1);
        imageList.add(R.drawable.breakfast_3);

    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(View container, int position) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.home_pager_element, null);
        ImageView image = (ImageView)view.findViewById(R.id.homeImageView);
//        image.setImageResource(imageList.get(position));

        ((ViewPager)container).addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View) object);
    }
}
