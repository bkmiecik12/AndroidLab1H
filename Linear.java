package com.example.bkmiecik.androidlab1h;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class Linear extends AppCompatActivity {

    RatingBar ratingBar;
    RadioButton radioButton;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);

        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        radioButton = (RadioButton) findViewById(R.id.radioButton);
        editText = (EditText) findViewById(R.id.editText);

        ratingBar.setNumStars(5);
        ratingBar.setMax(5);

        Button buttonPods = (Button) findViewById(R.id.b_pods_l);
        buttonPods.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Linear.this, readControls(), Toast.LENGTH_SHORT).show();
            }
        });

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingBar.setRating(rating);
            }
        });

        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

            }
        });
    }

    public String readControls(){
        String text = "";
        text+="Rating bar: "+ratingBar.getRating();
        text+="\n";
        text+="Is radio button checked? "+radioButton.isChecked();
        text+="\n"+"Text: "+editText.getText();
        return text;
    }
}
