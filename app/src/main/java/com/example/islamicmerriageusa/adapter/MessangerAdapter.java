package com.example.islamicmerriageusa.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.R;
import com.example.islamicmerriageusa.model.Messages;

import java.util.ArrayList;

public class MessangerAdapter extends RecyclerView.Adapter<MessangerAdapter.MessangerViewHolder> {
   Context context;

    public MessangerAdapter(Context context, ArrayList<Messages> messagelist) {
        this.context = context;
        this.messagelist = messagelist;
    }

    ArrayList<Messages>  messagelist;

    @Override
    public MessangerViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.messanger_item_layout,parent,false);
        return new MessangerViewHolder(view);
    }

    @Override
    public void onBindViewHolder( MessangerAdapter.MessangerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class MessangerViewHolder extends RecyclerView.ViewHolder {
        public MessangerViewHolder( View itemView) {
            super(itemView);
        }
    }
}
