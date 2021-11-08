package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText c;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c = (EditText) findViewById(R.id.ed0);
    }

    public void sb(View view){
        float fc = Float.parseFloat(c.getEditableText().toString());
        TextView result = (TextView) findViewById(R.id.tv4);

        NumberFormat nf = NumberFormat.getInstance();

        result.setText(nf.format(9 * 0.2 * fc + 32) + "");




    }




}























