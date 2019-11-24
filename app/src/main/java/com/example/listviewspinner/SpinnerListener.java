package com.example.listviewspinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class SpinnerListener implements AdapterView.OnItemSelectedListener {
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(), "You Selected "+parent.getItemAtPosition(position)+"", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
