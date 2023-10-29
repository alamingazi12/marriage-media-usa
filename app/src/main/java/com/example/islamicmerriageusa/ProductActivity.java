package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.islamicmerriageusa.model.Product;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    SliderAdapter sliderAdapter;
    androidx.appcompat.widget.Toolbar toolbar;
    SliderView sliderView;
    int[] images = {R.drawable.one,
            R.drawable.two,
            R.drawable.three,
            R.drawable.four
    };
    ArrayList<Product> product_list;

    RecyclerView product_sel_item_container;
    RecyclerView cir_product_container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initSlider();
        initProductList();
        initCircleContainer();
        initContainer();
    }


    private void initSlider() {
        sliderView = findViewById(R.id.image_slider);
        sliderAdapter=new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    private void initCircleContainer() {
        cir_product_container=findViewById(R.id.circle_item_container);
        cir_product_container.setHasFixedSize(true);
        cir_product_container.setLayoutManager(new LinearLayoutManager(ProductActivity.this,LinearLayoutManager.HORIZONTAL,false));

        cProductAdapter productAdapter=new cProductAdapter(ProductActivity.this,product_list);
        cir_product_container.setAdapter(productAdapter);
    }

    private void initContainer() {
        product_sel_item_container=findViewById(R.id.product_container_sel1);
        product_sel_item_container.setHasFixedSize(true);
        product_sel_item_container.setLayoutManager(new LinearLayoutManager(ProductActivity.this,LinearLayoutManager.HORIZONTAL,false));
        ProductAdapter productAdapter=new ProductAdapter(ProductActivity.this,product_list);
        product_sel_item_container.setAdapter(productAdapter);
    }



    private void initProductList() {
        product_list=new ArrayList<>();
        product_list.add(new Product(R.drawable.camera,"Camera"));
        product_list.add(new Product(R.drawable.smartphone,"smart Phone"));
        product_list.add(new Product(R.drawable.smartwatch,"Smartwatch"));
        product_list.add(new Product(R.drawable.headphones,"HeadPhone"));
        product_list.add(new Product(R.drawable.laptop,"Laptop"));
        product_list.add(new Product(R.drawable.smartwatch,"Smartwatch"));
        product_list.add(new Product(R.drawable.headphones,"HeadPhone"));
        product_list.add(new Product(R.drawable.laptop,"Laptop"));
    }
}