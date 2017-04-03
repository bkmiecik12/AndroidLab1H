package com.example.bkmiecik.androidlab1h;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent intentUklady = new Intent(this,Uklady.class);
        final Intent intentDane = new Intent(this,Dane1.class);

        Button buttonUklady = (Button) findViewById(R.id.b_uklady);
        Button buttonDane = (Button) findViewById(R.id.b_dane);

        buttonUklady.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentUklady);
            }
        });
        buttonDane.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentDane);
            }
        });

    }
}
