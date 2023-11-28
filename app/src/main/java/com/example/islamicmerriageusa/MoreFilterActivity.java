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

import static com.example.islamicmerriageusa.R.array.my_arr;

public class MoreFilterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
     String state[]={"Select Division","Dhaka","Khulna","Chittagong","Rajshahi","Sylhet","Rangpur","Mymansing","Barishal"};
     Spinner state_spinner,city_spinner;
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
        //Toast.makeText(getApplicationContext(), state[position], Toast.LENGTH_LONG).show();
        if(state[position].toLowerCase().equals("select division")){
           // Toast.makeText(getApplicationContext(), "Plaese Select a Division", Toast.LENGTH_LONG).show();
        }
        else if(state[position].toLowerCase().equals("dhaka")){
            setDistrictMenu(R.array.dhaka);
        }
        else if(state[position].toLowerCase().equals("khulna")){
            setDistrictMenu(R.array.khulna);
        }
        else if(state[position].toLowerCase().equals("rangpur")){
            setDistrictMenu(R.array.rangpur);
        }
        else if(state[position].toLowerCase().equals("chittagong")){
            setDistrictMenu(R.array.chittagong);
        }
        else if(state[position].toLowerCase().equals("barishal")){
            setDistrictMenu(R.array.barishal);
        }
        else if(state[position].toLowerCase().equals("sylhet")){
            setDistrictMenu(R.array.sylhet);
        }
        else if(state[position].toLowerCase().equals("rajshahi")){
            setDistrictMenu(R.array.rajshahi);
        }
        else if(state[position].toLowerCase().equals("mymansing")){
            setDistrictMenu(R.array.mymensingh);
        }
        else {

        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}