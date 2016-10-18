package com.aryaan.ankitha.mynavigationdrawerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ankitha on 10/18/2016.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    String[] socialSites;
    int[] images = {R.drawable.ic_facebook,R.drawable.ic_google,R.drawable.ic_twitter,R.drawable.ic_youtube};

    public MyAdapter(Context context){
        socialSites = context.getResources().getStringArray(R.array.social);
        this.context = context;
    }
    @Override
    public int getCount() {
        return socialSites.length;
    }

    @Override
    public Object getItem(int position) {
        return socialSites[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View row = null;
        if (view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.custom_view,viewGroup,false);
        }else{
            row = view;
        }
        TextView titleTextView = (TextView) row.findViewById(R.id.textView);
        ImageView titleImageView = (ImageView)row.findViewById(R.id.imageView);
        titleTextView.setText(socialSites[position]);
        titleImageView.setImageResource(images[position]);
        return row;
    }
}
