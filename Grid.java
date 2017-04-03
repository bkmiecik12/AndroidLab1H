package com.example.bkmiecik.androidlab1h;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Grid extends AppCompatActivity {

    EditText pass;
    EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        Button nieaktywny = (Button) findViewById(R.id.nieaktywny);
        nieaktywny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Grid.this,"No mówię, że nieaktywny!",Toast.LENGTH_SHORT).show();
            }
        });

        Button pods = (Button) findViewById(R.id.b_pods_g);
        pods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Grid.this,readControls(),Toast.LENGTH_SHORT).show();
            }
        });

        pass = (EditText) findViewById(R.id.pass);
        num = (EditText) findViewById(R.id.num);
    }

    String readControls(){
        String text = "";
        text+="Number: "+num.getText()+"\n";
        text+="Password: "+pass.getText();
        return text;
    }
}
