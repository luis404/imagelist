package com.lx.imagelist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * Created by xzc on 15/6/6.
 */
public class CustomAdapter extends Adapter<CustomAdapter.ViewHolder> {
    private ArrayList<DataItem> mDataSet;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public View mView;
        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
        }

        public void initViewFromData(DataItem item){
            SimpleDraweeView imageView = (SimpleDraweeView)mView.findViewById(R.id.product_image);
            imageView.setImageURI(item.getUri());
        }
    }

    public CustomAdapter(ArrayList<DataItem> data){
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
        viewHolder.initViewFromData(mDataSet.get(i));
    }

    @Override
    public int getItemCount() {
        return mDataSet.size();
    }
}
