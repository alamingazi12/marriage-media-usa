package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.R;
import com.example.islamicmerriageusa.model.Biodata;

import java.util.ArrayList;

public class BiodataAdapter extends RecyclerView.Adapter<BiodataAdapter.BiodataViewHolder> {
    public BiodataAdapter(Context context, ArrayList<Biodata> biodata_list) {
        this.context = context;
        this.biodata_list = biodata_list;
    }

    Context context;
    ArrayList<Biodata> biodata_list;
    @Override
    public BiodataAdapter.BiodataViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.biodata_item_layout,parent,false);
        return new BiodataAdapter.BiodataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BiodataAdapter.BiodataViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class BiodataViewHolder extends RecyclerView.ViewHolder {
        public BiodataViewHolder( View itemView) {
            super(itemView);
        }
    }
}
