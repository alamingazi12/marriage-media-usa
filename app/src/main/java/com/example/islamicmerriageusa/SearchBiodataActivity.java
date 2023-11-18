package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.islamicmerriageusa.adapter.BiodataAdapter;
import com.example.islamicmerriageusa.model.Biodata;

import java.util.ArrayList;

import static com.example.islamicmerriageusa.R.array.my_arr;

public class SearchBiodataActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] gender = {"পুুরুষ","মহিলা"};
    String[] status = {"বিবাহিত","অবিবাহিত"};
     Spinner type_data_spinner,marit_status_spinner;
     RecyclerView biodata_item_container;
     ArrayList<Biodata> biodata_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_biodata);
        type_data_spinner=findViewById(R.id.type_data_spinner);
        type_data_spinner.setOnItemSelectedListener(this);
        marit_status_spinner=findViewById(R.id.marit_status_spinner);
        marit_status_spinner.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
         ArrayAdapter gender_adaper = new ArrayAdapter(this,android.R.layout.simple_spinner_item,gender);
         gender_adaper.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(
               // this,
                //my_arr,
               // R.layout.my_spinner);
        type_data_spinner.setAdapter(gender_adaper);

        ArrayAdapter status_adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,status);
        status_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(
        // this,
        //my_arr,
        // R.layout.my_spinner);
        marit_status_spinner.setAdapter(status_adapter);

        biodata_item_container=findViewById(R.id.biodata_container);
        biodata_item_container.setHasFixedSize(true);
        biodata_item_container.setLayoutManager(new LinearLayoutManager(SearchBiodataActivity.this));
        BiodataAdapter biodataAdapter=new BiodataAdapter(this,biodata_list);
        biodata_item_container.setAdapter(biodataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}