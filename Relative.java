package com.example.bkmiecik.androidlab1h;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Relative extends AppCompatActivity {

    Spinner spinner;
    Switch aSwitch;
    SeekBar seekBar;

    String[] arraySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        spinner = (Spinner) findViewById(R.id.spinner);
        aSwitch = (Switch) findViewById(R.id.switch1);
        seekBar = (SeekBar) findViewById(R.id.seekBar);

        arraySpinner = new String[] {
                "Opcja 1", "Opcja 2", "Opcja 3"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        spinner.setAdapter(adapter);

//        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            }
//        });

        seekBar.setMax(10);
        aSwitch.setTextOff("Off");
        aSwitch.setTextOn("On");

        Button pods = (Button) findViewById(R.id.b_pods_r);
        pods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Relative.this,readControls(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    String readControls(){
        String text = "";
        text+="Spinner: "+spinner.getSelectedItem();
        text+="\n";
        text+="Is Switch on? "+aSwitch.isChecked();
        text+="\n"+"Seek Bar: "+seekBar.getProgress();
        return text;
    }
}
