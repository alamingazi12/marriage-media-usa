package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.islamicmerriageusa.adapter.ViewpagerAdapterGroom;

public class PersonalBiodataActivity extends AppCompatActivity {
      ViewPager slider_viewPager;
      TextView page_count;
      ImageButton back,next;
    ImageView image_show_hide,image_show_hide2,image_show_hide3,image_show_hide4,image_show_hide5,image_show_hide6,image_show_hide7,image_show_hide8,image_show_hide9;
    LinearLayout mother_layout_profile,mother_layout_profile2,mother_layout_profile3,mother_layout_profile4,mother_layout_profile5,mother_layout_profile6,mother_layout_profile7,mother_layout_profile8,mother_layout_profile9;
    ConstraintLayout layout_show_hide,layout_show_hide2,layout_show_hide3,layout_show_hide4,layout_show_hide5,layout_show_hide6,layout_show_hide7,layout_show_hide8,layout_show_hide9;
    ConstraintLayout visibility_table_layout,visibility_table_layout2,visibility_table_layout3,visibility_table_layout4,visibility_table_layout5,visibility_table_layout6,visibility_table_layout7,visibility_table_layout8,visibility_table_layout9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_biodata);

        slider_viewPager=findViewById(R.id.my_view_pager);
        next=findViewById(R.id.btn_next);
        back=findViewById(R.id.btn_back);
        page_count=findViewById(R.id.page_count);
        page_count.setText(1+"/"+3);

        ViewpagerAdapterGroom viewpagerAdapter=new ViewpagerAdapterGroom(PersonalBiodataActivity.this);
        slider_viewPager.setAdapter(viewpagerAdapter);

        slider_viewPager.addOnPageChangeListener(pageChangeListener);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(getItem(0)<2){
                    slider_viewPager.setCurrentItem(getItem(1),true);
                }
                /*
                else {
                    Intent intent=new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }

                 */

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(getItem(0)>0){
                    slider_viewPager.setCurrentItem(getItem(-1),true);
                }

            }
        });
        inItAll();
    }

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

    ViewPager.OnPageChangeListener pageChangeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int position) {
            page_count.setText(String.valueOf(position+1)+"/"+3);
            //setUpIndicator(position);
            if(position>0){
                back.setVisibility(View.VISIBLE);
            }else {
                //back.setVisibility(View.INVISIBLE);
            }

        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
    private int getItem(int i){
        return slider_viewPager.getCurrentItem()+i;
    }
}