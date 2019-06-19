package com.example.a1894219.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtRate;
    RatingBar rt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtRate = findViewById(R.id.txtRate);
        rt = findViewById(R.id.rt);

        rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

                txtRate.setText("My Rate : " + rt.getRating());
            }
        });
    }
}
