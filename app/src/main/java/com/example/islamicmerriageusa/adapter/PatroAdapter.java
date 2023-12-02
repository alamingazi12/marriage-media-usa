package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.R;
import com.example.islamicmerriageusa.model.Patro;

import java.util.ArrayList;

public class PatroAdapter extends RecyclerView.Adapter<PatroAdapter.PatroViewHolder> {
    public PatroAdapter(@NonNull ArrayList<Patro> patro_list, Context context) {
        this.patro_list = patro_list;
        this.context = context;
    }

    @NonNull
    ArrayList<Patro> patro_list;
    Context context;

    @Override
    public PatroViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_groom_item,parent,false);
        return new PatroViewHolder(view);
    }

    @Override
    public void onBindViewHolder( PatroAdapter.PatroViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class PatroViewHolder extends RecyclerView.ViewHolder {
        public PatroViewHolder( View itemView) {
            super(itemView);
        }
    }
}
