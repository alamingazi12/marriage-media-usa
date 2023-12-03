package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.islamicmerriageusa.adapter.PatroAdapter;
import com.example.islamicmerriageusa.model.Patro;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class DashboardActivity extends AppCompatActivity {
    TabLayout dashboard_tab;
    ViewPager dashboard_viewpager;
    String temp_text;
    TextView heading_text, first_text, second_text, thired_text;

    ArrayList<Patro> patros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        dashboard_tab = findViewById(R.id.dashboard_tab);
        dashboard_viewpager = findViewById(R.id.frame_layout_viewpager);
        dashboard_viewpager.setAdapter(new SectionsPagerAdapter(getSupportFragmentManager()));
        dashboard_tab.setupWithViewPager(dashboard_viewpager);


    }
/*
    private void initText() {
        heading_text=findViewById(R.id.heading_text);


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

    */



    public class SectionsPagerAdapter extends FragmentPagerAdapter {
        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = new DashboardFragment();
                    break;
                case 1:
                    fragment = new SearchMarriageOfficeFragment();
                    break;
                case 2:
                    fragment = new SearchCommunityFragment();
                    break;
            }
            return fragment;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "User";

                case 1:
                    return "Marriage Office";
                case 2:
                    return "Community Center";
            }
            return null;
        }
    }

}