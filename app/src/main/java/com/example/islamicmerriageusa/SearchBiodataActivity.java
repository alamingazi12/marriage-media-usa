package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.islamicmerriageusa.adapter.BiodataAdapter;
import com.example.islamicmerriageusa.model.Biodata;

import java.util.ArrayList;

public class SearchBiodataActivity extends AppCompatActivity {
     RecyclerView biodata_item_container;
     ArrayList<Biodata> biodata_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_biodata);
        biodata_item_container=findViewById(R.id.biodata_container);
        biodata_item_container.setHasFixedSize(true);
        biodata_item_container.setLayoutManager(new LinearLayoutManager(SearchBiodataActivity.this));
        BiodataAdapter biodataAdapter=new BiodataAdapter(this,biodata_list);
        biodata_item_container.setAdapter(biodataAdapter);
    }
}