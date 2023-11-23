package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.islamicmerriageusa.adapter.HotelAdapter;
import com.example.islamicmerriageusa.adapter.MarriageOfficeAdapter;
import com.example.islamicmerriageusa.model.MarriageOffice;

import java.util.ArrayList;

public class SearchMarriageOfficeActivity extends AppCompatActivity {
    RecyclerView  marriage_office_container;
    ArrayList<MarriageOffice> office_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_marriage_office);
        inItAll();
    }

    private void inItAll() {
        marriage_office_container=findViewById(R.id.marriage_office_container);
        marriage_office_container.setHasFixedSize(true);
        marriage_office_container.setLayoutManager(new GridLayoutManager(SearchMarriageOfficeActivity.this,2));
        MarriageOfficeAdapter hotelAdapter=new MarriageOfficeAdapter(office_list,SearchMarriageOfficeActivity.this);
        marriage_office_container.setAdapter(hotelAdapter);
    }
}