package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.islamicmerriageusa.model.Product;

import java.util.ArrayList;

public class CardActivity extends AppCompatActivity {
    RecyclerView card_container;
    ArrayList<Product> product_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        card_container=findViewById(R.id.card_item_container);
        card_container.setHasFixedSize(true);
        card_container.setLayoutManager(new LinearLayoutManager(CardActivity.this));
        initProductList();

    }

    private void initProductList() {
        product_list=new ArrayList<>();
        product_list.add(new Product(R.drawable.camera,"Camera"));
        product_list.add(new Product(R.drawable.camera,"Camera"));

        CardAdapter cardAdapter=new CardAdapter(CardActivity.this,product_list);
        card_container.setAdapter(cardAdapter);
    }
}