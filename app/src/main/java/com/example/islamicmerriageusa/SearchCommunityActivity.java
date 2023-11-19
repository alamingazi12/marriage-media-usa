package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.islamicmerriageusa.adapter.HotelAdapter;
import com.example.islamicmerriageusa.model.Hotel;

import java.util.ArrayList;

import static com.example.islamicmerriageusa.R.array.*;

public class SearchCommunityActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String[] country = {"Sponsored", "Most Reviews"};
    RecyclerView community_center_container;
    ArrayList<Hotel> hotel_List;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_community);
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);

        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this,
                my_arr,
                R.layout.my_spinner);
        spin.setAdapter(adapter);
        inItAll();
    }

    private void inItAll() {
        community_center_container=findViewById(R.id.community_centers_container);
        community_center_container.setHasFixedSize(true);
        community_center_container.setLayoutManager(new GridLayoutManager(SearchCommunityActivity.this,2));
        HotelAdapter hotelAdapter=new HotelAdapter(SearchCommunityActivity.this,hotel_List);
        community_center_container.setAdapter(hotelAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(), country[position] , Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}