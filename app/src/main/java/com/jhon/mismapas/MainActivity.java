package com.jhon.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void irMapa(View v){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("uno", 1);
        startActivity(i);
    }
    public void irMapa1(View v){
        Intent j = new Intent(this, MapsActivity.class);
        j.putExtra("dos", 2);
        startActivity(j);
    }
    public void irMapa2(View v){
        Intent j = new Intent(this, MapsActivity.class);
        j.putExtra("tres", 3);
        startActivity(j);
    }
    public void irMapa3(View v){
        Intent j = new Intent(this, MapsActivity.class);
        j.putExtra("cuatro", 4);
        startActivity(j);
    }
}