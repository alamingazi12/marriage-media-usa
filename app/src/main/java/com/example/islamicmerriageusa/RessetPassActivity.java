package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RessetPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resset_pass);

        Button resetbtn=findViewById(R.id.btn_rstpass);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RessetPassActivity.this,ProfileActivity.class);
                startActivity(intent);
            }
        });

        TextView signup_btn=findViewById(R.id.btn_signup);
        signup_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RessetPassActivity.this,PaymentActivity.class);
                startActivity(intent);
            }
        });
          TextView btn_text_login=findViewById(R.id.btn_loginn);
        btn_text_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(RessetPassActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }
}