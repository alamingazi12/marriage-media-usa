package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BiodataActivity extends AppCompatActivity {
     TextView hide_text;
     ImageView add_one;
     boolean visible=false;
     LinearLayout address_content;
     ConstraintLayout constraintLayout_animations;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        hide_text=findViewById(R.id.hide_text);
        constraintLayout_animations=findViewById(R.id.layout_animations);
        constraintLayout_animations.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        add_one=findViewById(R.id.image_btn1);
        add_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             // int i=(hide_text.getVisibility()==View.GONE)?View.VISIBLE:View.GONE;
               // TransitionManager.beginDelayedTransition(constraintLayout_animations,new AutoTransition());
               //  hide_text.setVisibility(i);

                if(hide_text.getVisibility()==View.GONE){
                   // TransitionManager.beginDelayedTransition(constraintLayout_animations,new AutoTransition());
                    hide_text.setVisibility(View.VISIBLE);
                    add_one.setImageResource(R.drawable.ic_minimise);
                }else if(hide_text.getVisibility()==View.VISIBLE){
                   // TransitionManager.beginDelayedTransition(constraintLayout_animations,new AutoTransition());
                    add_one.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    hide_text.setVisibility(View.GONE);
                }


            }
        });
    }
}