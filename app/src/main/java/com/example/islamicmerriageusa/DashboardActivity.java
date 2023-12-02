package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.islamicmerriageusa.adapter.PatroAdapter;
import com.example.islamicmerriageusa.model.Patro;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    String temp_text;
    TextView heading_text,first_text,second_text,thired_text;

    ArrayList<Patro> patros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initText();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                new DashboardFragment()).commit();


    }

    private void initText() {
        heading_text=findViewById(R.id.heading_text);
        first_text=findViewById(R.id.first_text);
        second_text=findViewById(R.id.second_text);
        thired_text=findViewById(R.id.thiredtext);

        first_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             temp_text=first_text.getText().toString();
             first_text.setText(heading_text.getText().toString());
             heading_text.setText(temp_text);
             if (temp_text.toLowerCase().equals("user")) {
                 getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                         new BiodataActivity()).commit();
             }
             else if(temp_text.toLowerCase().equals("dashboard")){
                 getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                         new DashboardFragment()).commit();
             }
             else if(temp_text.toLowerCase().equals("kazi office")){
                 getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                         new SearchMarriageOfficeFragment()).commit();
             }
             else if(temp_text.toLowerCase().equals("community center")){
                 getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                         new SearchCommunityFragment()).commit();
             }
            }



        });

        second_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_text=second_text.getText().toString();
                second_text.setText(heading_text.getText().toString());
                heading_text.setText(temp_text);
                if (temp_text.toLowerCase().equals("user")) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new BiodataActivity()).commit();
                }
                else if(temp_text.toLowerCase().equals("dashboard")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new DashboardFragment()).commit();
                }
                else if(temp_text.toLowerCase().equals("kazi office")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new SearchMarriageOfficeFragment()).commit();
                }
                else if(temp_text.toLowerCase().equals("community center")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new SearchCommunityFragment()).commit();
                }

            }
        });
        thired_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp_text=thired_text.getText().toString();
                thired_text.setText(heading_text.getText().toString());
                heading_text.setText(temp_text);

                if (temp_text.toLowerCase().equals("user")) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new BiodataActivity()).commit();
                }
                else if(temp_text.toLowerCase().equals("dashboard")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new DashboardFragment()).commit();
                }
                else if(temp_text.toLowerCase().equals("kazi office")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new SearchMarriageOfficeFragment()).commit();
                }
                else if(temp_text.toLowerCase().equals("community center")){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_container,
                            new SearchCommunityFragment()).commit();
                }
            }
        });

    }
}