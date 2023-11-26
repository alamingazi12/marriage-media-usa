package com.example.islamicmerriageusa;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.slider.RangeSlider;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navigationView;
    View notificationBadge1;
    TextView mybadge;
   RangeSlider slider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_groom_item);
        /*
        navigationView=findViewById(R.id.bottomNavigationView);
        //addBadgeView();
        slider=findViewById(R.id.rangeSlider);
        slider.addOnChangeListener(new RangeSlider.OnChangeListener() {
            @Override
            public void onValueChange( RangeSlider slider, float value, boolean fromUser) {
               // Toast.makeText(MainActivity.this,"Start value:"+slider.getValues(),Toast.LENGTH_SHORT).show();
            }
        });

        slider.addOnSliderTouchListener(new RangeSlider.OnSliderTouchListener() {
            @Override
            public void onStartTrackingTouch( RangeSlider slider) {
                //
            }

            @Override
            public void onStopTrackingTouch( RangeSlider slider) {
                Toast.makeText(MainActivity.this,"values:"+slider.getValues(),Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void addBadgeView() {
        BottomNavigationMenuView menuView = (BottomNavigationMenuView) navigationView.getChildAt(0);
        BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(3);
        notificationBadge1 = LayoutInflater.from(this).inflate(R.layout.mybadgelayout, menuView, false);
        mybadge =notificationBadge1.findViewById(R.id.badge_counter);
        String offers=String.valueOf(6);
        mybadge.setText("5");
        //TextView _notificationBadgeTextView = notificationBadge1.findViewById();
        itemView.addView(notificationBadge1);

         */
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}