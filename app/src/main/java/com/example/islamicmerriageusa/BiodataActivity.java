package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class BiodataActivity extends AppCompatActivity {
     ImageView add_one;
     boolean visible=false;
     LinearLayout address_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        address_content=findViewById(R.id.addres_layout);
        add_one=findViewById(R.id.image_btn1);
        add_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visible==false){
                    visible=true;
                    address_content.setVisibility(View.VISIBLE);
                    add_one.setImageResource(R.drawable.ic_minimise);
                }else if(visible==true){
                    visible=false;
                    add_one.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    address_content.setVisibility(View.GONE);
                }
            }
        });
    }
}