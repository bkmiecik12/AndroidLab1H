package com.example.bkmiecik.androidlab1h;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Dane2 extends AppCompatActivity {
    Intent iii;
    Bundle dane = new Bundle();
    String wynik = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dane2);

        Button sprawdz = (Button) findViewById(R.id.sprawdz);
        sprawdz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        iii = getIntent();
        dane = iii.getExtras();
        String imie = dane.getString("imie");
        String nazwisko = dane.getString("naz");
        int a = dane.getInt("num2");
        int b = dane.getInt("num1");
        int c = a*b;
        String liczba = String.valueOf(c);
        wynik+=imie.charAt(0);
        wynik+=imie.charAt(1);
        wynik+=imie.charAt(2);
        wynik+=nazwisko.charAt(0);
        wynik+=nazwisko.charAt(1);
        wynik+=nazwisko.charAt(2);
        wynik+=liczba;
        dane.putString("wynik",wynik);
        iii.putExtras(dane);
        setResult(Activity.RESULT_OK,iii);
        //Toast.makeText(Dane2.this,wynik,Toast.LENGTH_SHORT).show();
        //finish();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
