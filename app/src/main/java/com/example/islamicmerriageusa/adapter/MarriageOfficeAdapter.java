package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.R;
import com.example.islamicmerriageusa.model.MarriageOffice;

import java.util.ArrayList;

public class MarriageOfficeAdapter extends RecyclerView.Adapter<MarriageOfficeAdapter.MarriageOfficeViewHolder> {
    public MarriageOfficeAdapter(@NonNull ArrayList<MarriageOffice> offices, Context context) {
        this.offices = offices;
        this.context = context;
    }

    @NonNull
    ArrayList<MarriageOffice> offices;
    Context context;
    @Override
    public MarriageOfficeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.office_item_layout,parent,false);
        return new MarriageOfficeViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MarriageOfficeAdapter.MarriageOfficeViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MarriageOfficeViewHolder extends RecyclerView.ViewHolder {
        public MarriageOfficeViewHolder(View itemView) {
            super(itemView);
        }
    }
}
