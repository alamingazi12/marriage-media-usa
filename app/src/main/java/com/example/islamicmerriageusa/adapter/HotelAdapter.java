package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.ProductAdapter;
import com.example.islamicmerriageusa.R;
import com.example.islamicmerriageusa.model.Hotel;

import java.util.ArrayList;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {
    public HotelAdapter(Context context, ArrayList<Hotel> hotel_list) {
        this.context = context;
        this.hotel_list = hotel_list;
    }

    Context context;
    ArrayList<Hotel>  hotel_list;



    @Override
    public HotelAdapter.HotelViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.community_center_item_layout,parent,false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder( HotelAdapter.HotelViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class HotelViewHolder extends RecyclerView.ViewHolder {
        public HotelViewHolder(View itemView) {
            super(itemView);
        }
    }
}
