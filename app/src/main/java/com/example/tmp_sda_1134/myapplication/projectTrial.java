package com.example.tmp_sda_1134.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class projectTrial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_trial);
    }
    public void calculatefeet(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=i*3.28084;
       String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }
    public void calculateinches(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=i*3.28084*12;
        String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }
    public void calculateyard(View view) {
        EditText input = (EditText) findViewById(R.id.edit_meter);
        int i = Integer.parseInt(String.valueOf(input.getText()));

        double convert=(i*3.28084)/3;
        String message = String.valueOf(convert);
        //Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        //toast.show();

        EditText output = (EditText) findViewById(R.id.edit_result);
        output.setText(message);
    }


}
