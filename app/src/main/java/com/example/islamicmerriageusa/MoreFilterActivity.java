package com.example.islamicmerriageusa;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import static com.example.islamicmerriageusa.R.array.barishal;
import static com.example.islamicmerriageusa.R.array.chittagong;
import static com.example.islamicmerriageusa.R.array.dhaka;
import static com.example.islamicmerriageusa.R.array.khulna;
import static com.example.islamicmerriageusa.R.array.my_arr;
import static com.example.islamicmerriageusa.R.array.mymensingh;
import static com.example.islamicmerriageusa.R.array.rajshahi;
import static com.example.islamicmerriageusa.R.array.rangpur;
import static com.example.islamicmerriageusa.R.array.sylhet;

public class MoreFilterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
     String state[]={"Select Division","Dhaka","Khulna","Chittagong","Rajshahi","Sylhet","Rangpur","Mymansing","Barishal"};
     Spinner state_spinner,city_spinner;
     int arr_code=-1;
    ArrayAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_filter);
        state_spinner=findViewById(R.id.state_spinner);
        state_spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);
        city_spinner=findViewById(R.id.city_spinner);
        city_spinner.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) this);


         ArrayAdapter aa =//ArrayAdapter.createFromResource(this,state,R.layout.my_spinner);
                new ArrayAdapter(this,android.R.layout.simple_spinner_item,state);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        state_spinner.setAdapter(aa);
    }

    public void setDistrictMenu(int arr){
     ArrayAdapter aa =ArrayAdapter.createFromResource(this,
                arr,
                R.layout.my_spinner);
        //new ArrayAdapter(this,android.R.layout.simple_spinner_item,state);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        city_spinner.setAdapter(aa);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

       if(parent.getId()==R.id.state_spinner){
           //Toast.makeText(getApplicationContext(), state[position], Toast.LENGTH_LONG).show();
           if(state[position].toLowerCase().equals("select division")){
               // Toast.makeText(getApplicationContext(), "Plaese Select a Division", Toast.LENGTH_LONG).show();
           }
           else if(state[position].toLowerCase().equals("dhaka")){
               setDistrictMenu(R.array.dhaka);
               arr_code=1;
           }
           else if(state[position].toLowerCase().equals("khulna")){
               setDistrictMenu(R.array.khulna);
               arr_code=2;
           }
           else if(state[position].toLowerCase().equals("rangpur")){
               setDistrictMenu(R.array.rangpur);
               arr_code=3;
           }
           else if(state[position].toLowerCase().equals("chittagong")){
               setDistrictMenu(R.array.chittagong);
               arr_code=4;
           }
           else if(state[position].toLowerCase().equals("barishal")){
               setDistrictMenu(R.array.barishal);
               arr_code=5;
           }
           else if(state[position].toLowerCase().equals("sylhet")){
               setDistrictMenu(R.array.sylhet);
               arr_code=6;
           }
           else if(state[position].toLowerCase().equals("rajshahi")){
               setDistrictMenu(R.array.rajshahi);
               arr_code=7;
           }
           else if(state[position].toLowerCase().equals("mymansing")){
               setDistrictMenu(R.array.mymensingh);
               arr_code=8;
           }
           else {

           }

       }else {
         if(arr_code==1){
             String city=getResources().getStringArray(dhaka)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(dhaka)[position], Toast.LENGTH_LONG).show();
         }
          else if(arr_code==2){
               String city=getResources().getStringArray(khulna)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(khulna)[position], Toast.LENGTH_LONG).show();
           }
         else if(arr_code==3){
             String city=getResources().getStringArray(rangpur)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(rangpur)[position], Toast.LENGTH_LONG).show();

         }
         else if(arr_code==4){
             String city=getResources().getStringArray(chittagong)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(chittagong)[position], Toast.LENGTH_LONG).show();
         }
         else if(arr_code==5){
             String city=getResources().getStringArray(barishal)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(barishal)[position], Toast.LENGTH_LONG).show();
         }
         else if(arr_code==6){
             String city=getResources().getStringArray(sylhet)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(sylhet)[position], Toast.LENGTH_LONG).show();
         }
         else if(arr_code==7){
             String city=getResources().getStringArray(rajshahi)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(rajshahi)[position], Toast.LENGTH_LONG).show();
         }
         else if(arr_code==8){
             String city=getResources().getStringArray(mymensingh)[position];
             Toast.makeText(getApplicationContext(), getResources().getStringArray(mymensingh)[position], Toast.LENGTH_LONG).show();
         }



       }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}