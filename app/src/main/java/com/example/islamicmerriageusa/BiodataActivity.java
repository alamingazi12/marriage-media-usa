package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;

public class BiodataActivity extends AppCompatActivity {
    View notificationBadge1;
    TextView mybadge;
      ImageView image_show_hide,image_show_hide2,image_show_hide3,image_show_hide4,image_show_hide5,image_show_hide6,image_show_hide7,image_show_hide8,image_show_hide9;
      LinearLayout mother_layout_profile,mother_layout_profile2,mother_layout_profile3,mother_layout_profile4,mother_layout_profile5,mother_layout_profile6,mother_layout_profile7,mother_layout_profile8,mother_layout_profile9;
      ConstraintLayout layout_show_hide,layout_show_hide2,layout_show_hide3,layout_show_hide4,layout_show_hide5,layout_show_hide6,layout_show_hide7,layout_show_hide8,layout_show_hide9;
      ConstraintLayout visibility_table_layout,visibility_table_layout2,visibility_table_layout3,visibility_table_layout4,visibility_table_layout5,visibility_table_layout6,visibility_table_layout7,visibility_table_layout8,visibility_table_layout9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

       inItAll();

    }
    /*private void addBadgeView() {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigationView.getChildAt(0);
        BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(3);
        notificationBadge1 = LayoutInflater.from(this).inflate(R.layout.mybadgelayout, menuView, false);
        mybadge =notificationBadge1.findViewById(R.id.badge_counter);
        String offers=String.valueOf(6);
        mybadge.setText("6");
        // TextView _notificationBadgeTextView = notificationBadge1.findViewById();
        itemView.addView(notificationBadge1);
    }

     */

    private void inItAll() {
        image_show_hide=findViewById(R.id.image_show_hide);
        image_show_hide2=findViewById(R.id.image_show_hide2);
        image_show_hide3=findViewById(R.id.image_show_hide3);
        image_show_hide4=findViewById(R.id.image_show_hide4);
        image_show_hide5=findViewById(R.id.image_show_hide5);
        image_show_hide6=findViewById(R.id.image_show_hide6);
        image_show_hide7=findViewById(R.id.image_show_hide7);
        image_show_hide8=findViewById(R.id.image_show_hide8);
        image_show_hide9=findViewById(R.id.image_show_hide9);



        mother_layout_profile=findViewById(R.id.monther_layout_profile);
        mother_layout_profile.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile2=findViewById(R.id.monther_layout_profile2);
        mother_layout_profile2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile3=findViewById(R.id.monther_layout_profile3);
        mother_layout_profile3.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile4=findViewById(R.id.monther_layout_profile4);
        mother_layout_profile4.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile5=findViewById(R.id.monther_layout_profile5);
        mother_layout_profile5.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile6=findViewById(R.id.monther_layout_profile6);
        mother_layout_profile6.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile7=findViewById(R.id.monther_layout_profile7);
        mother_layout_profile7.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile8=findViewById(R.id.monther_layout_profile8);
        mother_layout_profile8.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        mother_layout_profile9=findViewById(R.id.monther_layout_profile9);
        mother_layout_profile9.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        layout_show_hide=findViewById(R.id.layout_show_hide);
        layout_show_hide2=findViewById(R.id.layout_show_hide2);
        layout_show_hide3=findViewById(R.id.layout_show_hide3);
        layout_show_hide4=findViewById(R.id.layout_show_hide4);
        layout_show_hide5=findViewById(R.id.layout_show_hide5);
        layout_show_hide6=findViewById(R.id.layout_show_hide6);
        layout_show_hide7=findViewById(R.id.layout_show_hide7);
        layout_show_hide8=findViewById(R.id.layout_show_hide8);
        layout_show_hide9=findViewById(R.id.layout_show_hide9);

        visibility_table_layout=findViewById(R.id.visibility_table_layout);
        visibility_table_layout2=findViewById(R.id.visibility_table_layout2);
        visibility_table_layout3=findViewById(R.id.visibility_table_layout3);
        visibility_table_layout4=findViewById(R.id.visibility_table_layout4);
        visibility_table_layout5=findViewById(R.id.visibility_table_layout5);
        visibility_table_layout6=findViewById(R.id.visibility_table_layout6);
        visibility_table_layout7=findViewById(R.id.visibility_table_layout7);
        visibility_table_layout8=findViewById(R.id.visibility_table_layout8);
        visibility_table_layout9=findViewById(R.id.visibility_table_layout9);

        layout_show_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout.setVisibility(View.VISIBLE);
                    image_show_hide.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout2.getVisibility()==View.GONE){

                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout2.setVisibility(View.VISIBLE);
                    image_show_hide2.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout2.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout3.getVisibility()==View.GONE){

                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout3.setVisibility(View.VISIBLE);
                    image_show_hide3.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout4.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout4.setVisibility(View.VISIBLE);
                    image_show_hide4.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout5.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout5.setVisibility(View.VISIBLE);
                    image_show_hide5.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout6.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout6.setVisibility(View.VISIBLE);
                    image_show_hide6.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                }
            }
        });


        layout_show_hide7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout7.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout7.setVisibility(View.VISIBLE);
                    image_show_hide7.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                }
            }
        });

        layout_show_hide8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout8.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout8.setVisibility(View.VISIBLE);
                    image_show_hide8.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                }
            }
        });


        layout_show_hide9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(visibility_table_layout9.getVisibility()==View.GONE){

                    visibility_table_layout2.setVisibility(View.GONE);
                    image_show_hide2.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout3.setVisibility(View.GONE);
                    image_show_hide3.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout4.setVisibility(View.GONE);
                    image_show_hide4.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout5.setVisibility(View.GONE);
                    image_show_hide5.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout.setVisibility(View.GONE);
                    image_show_hide.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout7.setVisibility(View.GONE);
                    image_show_hide7.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout8.setVisibility(View.GONE);
                    image_show_hide8.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout6.setVisibility(View.GONE);
                    image_show_hide6.setImageResource(R.drawable.ic_baseline_add_circle_24);

                    visibility_table_layout9.setVisibility(View.VISIBLE);
                    image_show_hide9.setImageResource(R.drawable.ic_minimise);
                }else {
                    image_show_hide9.setImageResource(R.drawable.ic_baseline_add_circle_24);
                    visibility_table_layout9.setVisibility(View.GONE);
                }
            }
        });

    }
}