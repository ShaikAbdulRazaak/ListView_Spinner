package com.example.listviewspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView l;
    Spinner s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = findViewById(R.id.listView);
        s = (Spinner)findViewById(R.id.spinner);
        s.setOnItemSelectedListener( new SpinnerListener());
        final ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Stever Rogers");
        arrayList.add("Bruce Banner");
        arrayList.add("Natasha Romanoff");
        arrayList.add("Tony Stark");
        arrayList.add("Thor");
        arrayList.add("Barton");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        l.setAdapter(arrayAdapter);
        l.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You Selected " + arrayList.get(position) + "", Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter<String>ar=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arrayList);
        s.setAdapter(ar);
    }
}
