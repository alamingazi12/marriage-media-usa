package com.example.islamicmerriageusa;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.islamicmerriageusa.model.Product;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {
    @NonNull
    Context context;

    public CardAdapter(@NonNull Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }

    ArrayList<Product> products;

    @Override
    public CardAdapter.CardViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.cart_item_layout,parent,false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder( CardAdapter.CardViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        public CardViewHolder( View itemView) {
            super(itemView);
        }
    }
}
