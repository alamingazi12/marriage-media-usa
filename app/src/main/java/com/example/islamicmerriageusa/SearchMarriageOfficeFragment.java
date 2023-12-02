package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.islamicmerriageusa.adapter.HotelAdapter;
import com.example.islamicmerriageusa.adapter.MarriageOfficeAdapter;
import com.example.islamicmerriageusa.adapter.PatroAdapter;
import com.example.islamicmerriageusa.model.MarriageOffice;

import java.util.ArrayList;

public class SearchMarriageOfficeFragment extends Fragment {
    RecyclerView  marriage_office_container;
    ArrayList<MarriageOffice> office_list;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.activity_search_marriage_office, container, false);
        marriage_office_container=view.findViewById(R.id.marriage_office_container);
        marriage_office_container.setHasFixedSize(true);
        marriage_office_container.setLayoutManager(new GridLayoutManager(getContext(),2));
        MarriageOfficeAdapter hotelAdapter=new MarriageOfficeAdapter(office_list,getContext());
        marriage_office_container.setAdapter(hotelAdapter);
        return view;

    }
    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_marriage_office);
        inItAll();
    }
  /*
    private void inItAll() {
        marriage_office_container=findViewById(R.id.marriage_office_container);
        marriage_office_container.setHasFixedSize(true);
        marriage_office_container.setLayoutManager(new GridLayoutManager(SearchMarriageOfficeActivity.this,2));
        MarriageOfficeAdapter hotelAdapter=new MarriageOfficeAdapter(office_list,SearchMarriageOfficeActivity.this);
        marriage_office_container.setAdapter(hotelAdapter);
    }

   */
}