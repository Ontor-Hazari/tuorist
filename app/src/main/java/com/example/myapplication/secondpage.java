package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondpage extends AppCompatActivity implements View.OnClickListener{

    String[] chooselist, countrydetels, heritagedetels, listview, doller;
    private RecyclerView firstrecyceler, secondrecycelre, thirdrecyceler;
    int[] image = {R.drawable.missor, R.drawable.taj, R.drawable.ic_amazon, R.drawable.ic_mosque};
    int[] incon = {R.drawable.ic_istanbul, R.drawable.ic_city, R.drawable.ic_view};
    TextView next_page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        chooselist = getResources().getStringArray(R.array.aption);
        countrydetels = getResources().getStringArray(R.array.country);
        heritagedetels = getResources().getStringArray(R.array.heritage);
        listview = getResources().getStringArray(R.array.listheritage);
        doller = getResources().getStringArray(R.array.money);
        firstrecyceler = (RecyclerView) findViewById(R.id.firstrecyceler);
        secondrecycelre = (RecyclerView) findViewById(R.id.secondrecycelre);
        thirdrecyceler = (RecyclerView) findViewById(R.id.thirdrecyceler);
        //first Adapter
        Adapter adapter = new Adapter(this, chooselist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        firstrecyceler.setLayoutManager(layoutManager);
        firstrecyceler.setAdapter(adapter);

        //second adapter
        secondAdapter adapter1 = new secondAdapter(this, image, heritagedetels, countrydetels);
        LinearLayoutManager secondLinear = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        secondrecycelre.setLayoutManager(secondLinear);
        secondrecycelre.setAdapter(adapter1);


        //third adapter
        thirdrcycelerAdapter adapter2 = new thirdrcycelerAdapter(this, incon, listview, doller);

        LinearLayoutManager orientation = new LinearLayoutManager(this);
        thirdrecyceler.setLayoutManager(orientation);
        thirdrecyceler.setAdapter(adapter2);

        next_page = (TextView)findViewById(R.id.next_page);


        next_page.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {


        Intent intent = new Intent(secondpage.this,lastpage.class);
        startActivity(intent);
    }
}