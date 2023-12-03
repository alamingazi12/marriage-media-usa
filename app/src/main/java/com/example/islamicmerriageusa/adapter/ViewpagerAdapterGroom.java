package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.islamicmerriageusa.R;


public class ViewpagerAdapterGroom extends PagerAdapter {
    public ViewpagerAdapterGroom(Context context) {
        this.context = context;
    }

    Context context;

    int images[]={R.drawable.groom,R.drawable.groom,R.drawable.groom};
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull  View view, @NonNull  Object o) {
        return view==(ConstraintLayout) o;
    }

    @NonNull

    @Override
    public Object instantiateItem(@NonNull  ViewGroup container, int position) {
        LayoutInflater layoutInflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
       View view= layoutInflater.inflate(R.layout.slider_layout_groom,container,false);
          ImageView imageView=view.findViewById(R.id.imageView3);
          imageView.setImageResource(images[position]);
          container.addView(view);
       return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull  Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
