package com.example.foodwaste;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class AddOfferingActivity extends AppCompatActivity {

    android.widget.ListView listView;
    ArrayList<String> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_offering);
        listView = (android.widget.ListView)findViewById(R.id.listview);
        final ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);

        Button btnAdd = (Button) findViewById(R.id.addItemBtn);
        final EditText et = (EditText) findViewById(R.id.itemName);
        final EditText qt = (EditText) findViewById(R.id.qty);
        btnAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                arrayList.add(qt.getText().toString() + " – " + et.getText().toString());
                arrayAdapter.setNotifyOnChange(true);
                listView.setAdapter(arrayAdapter);
            }
        });
    }

}
