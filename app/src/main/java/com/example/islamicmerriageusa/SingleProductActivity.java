package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SingleProductActivity extends AppCompatActivity {
    ViewPager product_viewPager;
    TextView[] dots;
    LinearLayout mdotlinearlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product);
        product_viewPager=findViewById(R.id.product_viewpager);
        mdotlinearlayout=findViewById(R.id.p_dot_layout);
        product_viewPager.setAdapter(new ProductPagerAdapter(SingleProductActivity.this));
        setUpIndicator(0);
        product_viewPager.addOnPageChangeListener(pageChangeListener);
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
        return product_viewPager.getCurrentItem()+i;
    }

    public void setUpIndicator(int position){
        dots=new TextView[3];
        mdotlinearlayout.removeAllViews();
        for(int i=0;i<dots.length;i++){
            dots[i]=new TextView(this);
            dots[i].setText(Html.fromHtml("&#8722"));
            dots[i].setTextSize(50);
            dots[i].setTextColor(getResources().getColor(R.color.heading_text_color));
            mdotlinearlayout.addView(dots[i]);
        }
        dots[position].setTextColor(getResources().getColor(R.color.black));
    }
}