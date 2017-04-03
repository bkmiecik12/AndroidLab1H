package com.example.bkmiecik.androidlab1h;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Uklady extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uklady);

        final Intent ilinear = new Intent(this,Linear.class);
        final Intent irelative = new Intent(this,Relative.class);
        final Intent igrid = new Intent(this,Grid.class);

        Button linear = (Button) findViewById(R.id.linear);
        Button relative = (Button) findViewById(R.id.relative);
        Button grid = (Button) findViewById(R.id.grid);

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(ilinear);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(irelative);
            }
        });
        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(igrid);
            }
        });

    }
}
