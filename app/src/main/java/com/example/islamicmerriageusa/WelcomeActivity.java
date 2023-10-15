package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    ViewPager slider_viewPager;
    Button next,back;
    TextView[] dots;
    LinearLayout mdotlinearlayout;
   // ViewpagerAdapter viewpagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        slider_viewPager=findViewById(R.id.my_view_pager);
        next=findViewById(R.id.button2);
        back=findViewById(R.id.button);
        mdotlinearlayout=findViewById(R.id.dotlayout);
        ViewpagerAdapter viewpagerAdapter=new ViewpagerAdapter(WelcomeActivity.this);
        slider_viewPager.setAdapter(viewpagerAdapter);
        setUpIndicator(0);
        slider_viewPager.addOnPageChangeListener(pageChangeListener);
    }

    public void setUpIndicator(int position){
        dots=new TextView[3];
        mdotlinearlayout.removeAllViews();
        for(int i=0;i<dots.length;i++){
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(40);
            dots[i].setTextColor(getResources().getColor(R.color.teal_200));
            mdotlinearlayout.addView(dots[i]);
        }
        dots[position].setTextColor(getResources().getColor(R.color.black));
    }
    ViewPager.OnPageChangeListener pageChangeListener=new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int position) {
            setUpIndicator(position);
            if(position>0){
               // back.setVisibility(View.VISIBLE);
            }else {
               // back.setVisibility(View.INVISIBLE);
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