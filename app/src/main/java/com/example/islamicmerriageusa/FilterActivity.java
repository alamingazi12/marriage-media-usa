package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class FilterActivity extends AppCompatActivity {
     LinearLayout mother_layout_animation,mother_layout_animation2,
             mother_layout_animation3,mother_layout_animation4,mother_layout_animation5,mother_layout_animation6;
     ConstraintLayout visibility_layout,visibility_layout2,visibility_layout3,visibility_layout4,visibility_layout5,visibility_layout6;
     ImageView btn_show_contents,btn_show_contents2,btn_show_contents3,btn_show_contents4,btn_show_contents5,btn_show_contents6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
      inItLayouts();
      initAll();

    }

    private void inItLayouts() {
        mother_layout_animation=findViewById(R.id.monther_layout);
        mother_layout_animation.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        visibility_layout=findViewById(R.id.visibility_layout);
        btn_show_contents=findViewById(R.id.image_show_hide);

            mother_layout_animation2=findViewById(R.id.m_layout2);
            visibility_layout2=findViewById(R.id.visibility_layout2);
            mother_layout_animation2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
            btn_show_contents2=findViewById(R.id.btn_show_hide2);
    }

    private void initAll() {


        ConstraintLayout item_layout1=findViewById(R.id.constraintLayout20);


        btn_show_contents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout.getVisibility()==View.GONE){

                    visibility_layout2.setVisibility(View.GONE);
                    btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout6.setVisibility(View.GONE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    item_layout1.setBackground(getDrawable(R.drawable.radious_stroke));
                    visibility_layout.setVisibility(View.VISIBLE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    item_layout1.setBackground(getDrawable(R.drawable.layot_style_top));
                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });



      btn_show_contents2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(visibility_layout2.getVisibility()==View.GONE){

                  visibility_layout.setVisibility(View.GONE);
                  btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                  visibility_layout3.setVisibility(View.GONE);
                  btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                  visibility_layout4.setVisibility(View.GONE);
                  btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                  visibility_layout5.setVisibility(View.GONE);
                  btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                  visibility_layout6.setVisibility(View.GONE);
                  btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

                  visibility_layout2.setVisibility(View.VISIBLE);
                  btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
              }else {
                  visibility_layout2.setVisibility(View.GONE);
                  btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
              }
          }
      });


        mother_layout_animation3=findViewById(R.id.m_layout3);
        visibility_layout3=findViewById(R.id.visibility_layout3);
        mother_layout_animation3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        btn_show_contents3=findViewById(R.id.btn_show_hide3);
        btn_show_contents3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout3.getVisibility()==View.GONE){

                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout2.setVisibility(View.GONE);
                    btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout6.setVisibility(View.GONE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

                    visibility_layout3.setVisibility(View.VISIBLE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });

          mother_layout_animation4=findViewById(R.id.m_layout4);
          visibility_layout4=findViewById(R.id.visibility_layout4);
          mother_layout_animation4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
          btn_show_contents4=findViewById(R.id.btn_show_hide4);
          btn_show_contents4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout4.getVisibility()==View.GONE){

                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout2.setVisibility(View.GONE);
                    btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout6.setVisibility(View.GONE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

                    visibility_layout4.setVisibility(View.VISIBLE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


            mother_layout_animation5=findViewById(R.id.m_layout5);
            visibility_layout5=findViewById(R.id.visibility_layout5);
            mother_layout_animation5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
            btn_show_contents5=findViewById(R.id.btn_show_hide5);
            btn_show_contents5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout5.getVisibility()==View.GONE){

                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout2.setVisibility(View.GONE);
                    btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout6.setVisibility(View.GONE);
                    btn_show_contents6.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

                    visibility_layout5.setVisibility(View.VISIBLE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24);
                }else {
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                }
            }
        });


         mother_layout_animation6=findViewById(R.id.m_layout6);
         visibility_layout6=findViewById(R.id.visibility_layout6);
         mother_layout_animation6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
         btn_show_contents6=findViewById(R.id.btn_show_hide6);
         btn_show_contents6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_layout6.getVisibility()==View.GONE){
                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout.setVisibility(View.GONE);
                    btn_show_contents.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout2.setVisibility(View.GONE);
                    btn_show_contents2.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout3.setVisibility(View.GONE);
                    btn_show_contents3.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout4.setVisibility(View.GONE);
                    btn_show_contents4.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);
                    visibility_layout5.setVisibility(View.GONE);
                    btn_show_contents5.setImageResource(R.drawable.ic_baseline_keyboard_arrow_down_24);

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