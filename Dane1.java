package com.example.bkmiecik.androidlab1h;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Dane1 extends AppCompatActivity {

    TextView wynik;
    RatingBar ratingBar;
    SeekBar seekBar;
    EditText imie;
    EditText nazwisko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dane1);

        imie = (EditText) findViewById(R.id.imie);
        nazwisko = (EditText) findViewById(R.id.nazwisko);
        seekBar = (SeekBar) findViewById(R.id.dane1);
        ratingBar = (RatingBar) findViewById(R.id.dane2);
        wynik = (TextView) findViewById(R.id.wynik);
        Button wyslij = (Button) findViewById(R.id.wyslij);

        ratingBar.setMax(5);
        ratingBar.setNumStars(5);

        seekBar.setMax(100);

        final Intent intent = new Intent(Dane1.this,Dane2.class);

        wyslij.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtras(readData());
                startActivityForResult(intent,123);
                //Toast.makeText(Dane1.this, readControls(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    public String readControls(){
        String text = "";
        text+="Rating Bar: "+(int)ratingBar.getRating();
        text+="\n";
        text+="SeekBar "+seekBar.getProgress();
        text+="\n"+"Text: "+imie.getText();
        text+="\n"+"Text: "+nazwisko.getText();
        return text;
    }

    public Bundle readData(){
        Bundle dane = new Bundle();
        dane.putString("imie", imie.getText().toString());
        dane.putString("naz",nazwisko.getText().toString());
        dane.putInt("num1", (int) ratingBar.getRating());
        dane.putInt("num2", seekBar.getProgress());
        return dane;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 123) {
            if (data!=null) {
                Bundle dane2;
                dane2 = data.getExtras();
                if(dane2!=null){
                    String res = dane2.getString("wynik");
                    wynik.setText(res);
                    imie.setText("");
                    nazwisko.setText("");
                    seekBar.setProgress(0);
                    ratingBar.setRating(0);
                }
            }
        }
        else {
            super.onActivityResult(requestCode,resultCode,data);
        }
    }
}
