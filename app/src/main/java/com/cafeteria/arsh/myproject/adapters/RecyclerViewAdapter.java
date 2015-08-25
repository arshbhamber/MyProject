package com.cafeteria.arsh.myproject.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cafeteria.arsh.myproject.HomePage;
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

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mContext,HomePage.class);
                mContext.startActivity(i);

            }
        });
        CustomViewHolder viewHolder = new CustomViewHolder(view);


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
