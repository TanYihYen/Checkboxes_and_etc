package com.example.checkboxes_and_etc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String tag = "Toppings: ";
    CheckBox ch1, ch2, ch3, ch4, ch5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ch1 = (CheckBox) findViewById(R.id.checkbox1_chocolate);
        ch2 = (CheckBox) findViewById(R.id.checkbox2_sprinkles);
        ch3 = (CheckBox) findViewById(R.id.checkbox3_nuts);
        ch4 = (CheckBox) findViewById(R.id.checkbox4_cherries);
        ch5 = (CheckBox) findViewById(R.id.checkbox5_orio);
    }
    public void tosMessage(String message) {
        tag = "Toppings: ";
        String msg="";
        if(ch1.isChecked())
            msg=msg+"Chocolate Syrup ";
        if(ch2.isChecked())
            msg=msg+"Sprinkles ";
        if(ch3.isChecked())
            msg=msg+"Crushed Nuts ";
        if(ch4.isChecked())
            msg=msg+"Cherries ";
        if(ch5.isChecked())
            msg=msg+"Orio Cookie Crumbles ";
        Toast.makeText(this, tag+msg ,
                Toast.LENGTH_LONG).show();
    }

    public void onSubmit(View view) {
        tosMessage(tag);
    }


}