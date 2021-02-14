package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class lastpage extends AppCompatActivity {

    RecyclerView t_recyceler;

    String[] time_day;
    String[]  day_place;
    int[] t_trigoanal =  {R.drawable.ic_trigonal,R.drawable.ic_trigonal,R.drawable.ic_trigonal};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lastpage);

        time_day = getResources().getStringArray(R.array.time);
        day_place = getResources().getStringArray(R.array.descript);

        t_recyceler = (RecyclerView)findViewById(R.id.t_recyceler);

        trip_plan trip_Adapter = new trip_plan(this,time_day,day_place,t_trigoanal);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        t_recyceler.setLayoutManager(linearLayoutManager);
        t_recyceler.setAdapter(trip_Adapter);



    }
}