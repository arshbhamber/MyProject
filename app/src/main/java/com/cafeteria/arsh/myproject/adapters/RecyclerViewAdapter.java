package com.cafeteria.arsh.myproject.adapters;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cafeteria.arsh.myproject.DetailsPage;
import com.cafeteria.arsh.myproject.R;

/**
 * Created by fake on 8/22/2015.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.CustomViewHolder> {

    Context mContext;

    public RecyclerViewAdapter(Context context){
        mContext = context;

    }

    @Override
    public RecyclerViewAdapter.CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);


        final CustomViewHolder viewHolder = new CustomViewHolder(view);

        View v = view.findViewById(R.id.mImageView);
       final View v2 = view.findViewById(R.id.mTextView);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext,DetailsPage.class);
                Pair<View,String> pair = new Pair<View, String>(v,"myfirsttransition");
                Pair<View,String> pair1 = new Pair<View, String>(v2,"mysecondtransition");
//                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity)mContext, v, "myfirsttransition");
                ActivityOptions transitionActivityOptions = ActivityOptions.makeSceneTransitionAnimation((Activity)mContext, pair,pair1);
                mContext.startActivity(i, transitionActivityOptions.toBundle());

            }
        });
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.CustomViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }


    public class CustomViewHolder extends RecyclerView.ViewHolder {
        ImageView mImageView;
        TextView mTextView;

        public CustomViewHolder(View itemView) {
            super(itemView);
            this.mImageView = (ImageView)itemView.findViewById(R.id.mImageView);
            this.mTextView = (TextView)itemView.findViewById(R.id.mTextView);

        }
    }
}
