package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.islamicmerriageusa.adapter.MessangerAdapter;
import com.example.islamicmerriageusa.model.Messages;

import java.util.ArrayList;

public class MessangerActivity extends AppCompatActivity {

    RecyclerView chat_list_container;
    ArrayList<Messages> message_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messanger);
        chat_list_container=findViewById(R.id.chat_list_container);
        chat_list_container.setHasFixedSize(true);
        chat_list_container.setLayoutManager(new LinearLayoutManager(this));
        MessangerAdapter messangerAdapter=new MessangerAdapter(MessangerActivity.this,message_list);
        chat_list_container.setAdapter(messangerAdapter);
    }
}