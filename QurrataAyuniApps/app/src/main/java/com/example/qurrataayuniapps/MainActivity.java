package com.example.qurrataayuniapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_menu);
    }

    public void clickRS(View view) {
        //gambar RS di click
        Intent i = new Intent(this,RS.class);
        startActivity(i);

    }

    public void clickPOLICE(View view) {
        //gambar POLICE di click
        Intent i = new Intent(this,POLICE.class);
        startActivity(i);
    }

    public void clickSuperMarket(View view) {
        Intent i = new Intent(this,SuperMarket.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
        Intent i = new Intent(this,Sekolah.class);
        startActivity(i);

    }
}