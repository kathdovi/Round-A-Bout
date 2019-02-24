package com.example.foodwaste;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class BusinessListingActivity extends AppCompatActivity {


    android.widget.ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business_listing);

        listView = (android.widget.ListView)findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("Bananas");
        arrayList.add("Bread");
        arrayList.add("Milk");
        arrayList.add("Bananas");
        arrayList.add("Bread");
        arrayList.add("Milk");
        arrayList.add("Milk");
        arrayList.add("Bananas");
        arrayList.add("Bread");
        arrayList.add("Milk");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);
    }

}
