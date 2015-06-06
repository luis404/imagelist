package com.lx.imagelist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.zip.Inflater;

/**
 * Created by xzc on 15/6/6.
 */
public class CustomAdapter extends Adapter<CustomAdapter.ViewHolder> {
    private DataItem[] mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View mView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }

        public void initViewFromData(DataItem item){
            ImageView imageView = (ImageView)mView.findViewById(R.id.product_image);
            imageView.setImageResource(R.drawable.images);
        }
    }

    public CustomAdapter(DataItem[] data){
        mDataSet = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.data_item, viewGroup, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.initViewFromData(mDataSet[i]);
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }
}
