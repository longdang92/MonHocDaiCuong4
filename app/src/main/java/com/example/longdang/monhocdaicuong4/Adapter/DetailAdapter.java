package com.example.longdang.monhocdaicuong4.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.example.longdang.monhocdaicuong4.R;
import com.squareup.picasso.Picasso;

/**
 * Created by LONGDANG on 12/29/2016.
 */

public class DetailAdapter extends ArrayAdapter<String> {
    public DetailAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh = null;
        if (convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.image_item_layout, null);
            ImageView imageView = (ImageView) convertView.findViewById(R.id.imgv_LoiGiai);

            vh = new ViewHolder();
            vh.imageView = imageView;

            convertView.setTag(vh);
        } else {
            vh = (ViewHolder)convertView.getTag();
        }

        //Load image from internet via Picasso
        Picasso.with(getContext())
                .load(getItem(position))
                .placeholder(R.drawable.loading)
                .error(R.drawable.warning)
                .into(vh.imageView);

        return convertView;
    }

    private static class ViewHolder{
        ImageView imageView;
    }
}
