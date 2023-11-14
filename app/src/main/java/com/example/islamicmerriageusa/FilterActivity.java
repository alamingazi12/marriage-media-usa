package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FilterActivity extends AppCompatActivity {
     LinearLayout mother_layout_animation;
     ConstraintLayout visibility_layout;
     ImageView btn_show_contents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);

        mother_layout_animation=findViewById(R.id.monther_layout);
        mother_layout_animation.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        visibility_layout=findViewById(R.id.visibility_layout);
        btn_show_contents=findViewById(R.id.btn_show_hide);
        btn_show_contents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout.getVisibility()==View.GONE){
                    visibility_layout.setVisibility(View.VISIBLE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

      initAll();

    }

    private void initAll() {
      LinearLayout    mother_layout_animation2=findViewById(R.id.m_layout2);
      ConstraintLayout     visibility_layout2=findViewById(R.id.visibility_layout2);
      mother_layout_animation2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
      ImageView  btn_show_contents2=findViewById(R.id.btn_show_hide2);
      btn_show_contents2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(visibility_layout2.getVisibility()==View.GONE){
                  visibility_layout2.setVisibility(View.VISIBLE);
                  btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
              }else {
                  visibility_layout2.setVisibility(View.GONE);
                  btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
              }
          }
      });


        LinearLayout    mother_layout_animation3=findViewById(R.id.m_layout3);
        ConstraintLayout     visibility_layout3=findViewById(R.id.visibility_layout3);
        mother_layout_animation3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        ImageView  btn_show_contents3=findViewById(R.id.btn_show_hide3);
        btn_show_contents3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout3.getVisibility()==View.GONE){
                    visibility_layout3.setVisibility(View.VISIBLE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

        LinearLayout    mother_layout_animation4=findViewById(R.id.m_layout4);
        ConstraintLayout     visibility_layout4=findViewById(R.id.visibility_layout4);
        mother_layout_animation4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        ImageView  btn_show_contents4=findViewById(R.id.btn_show_hide4);
        btn_show_contents4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout4.getVisibility()==View.GONE){
                    visibility_layout4.setVisibility(View.VISIBLE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


        LinearLayout    mother_layout_animation5=findViewById(R.id.m_layout5);
        ConstraintLayout     visibility_layout5=findViewById(R.id.visibility_layout5);
        mother_layout_animation5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        ImageView  btn_show_contents5=findViewById(R.id.btn_show_hide5);
        btn_show_contents5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout5.getVisibility()==View.GONE){
                    visibility_layout5.setVisibility(View.VISIBLE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


        LinearLayout    mother_layout_animation6=findViewById(R.id.m_layout6);
        ConstraintLayout     visibility_layout6=findViewById(R.id.visibility_layout6);
        mother_layout_animation6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        ImageView  btn_show_contents6=findViewById(R.id.btn_show_hide6);
        btn_show_contents6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout6.getVisibility()==View.GONE){
                    visibility_layout6.setVisibility(View.VISIBLE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout6.setVisibility(View.GONE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });





    }
}