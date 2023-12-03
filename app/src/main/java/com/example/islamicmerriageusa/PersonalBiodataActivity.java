package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.islamicmerriageusa.adapter.ViewpagerAdapterGroom;

public class PersonalBiodataActivity extends AppCompatActivity {
      ViewPager slider_viewPager;
      TextView page_count;
      ImageButton back,next;
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