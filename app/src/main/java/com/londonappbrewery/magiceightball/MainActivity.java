package com.londonappbrewery.magiceightball;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonmakeDecion=(Button)findViewById(R.id.button_ask);
        final ImageView imageAsk=(ImageView)findViewById(R.id.image_eightBall);

        final int[] decisionArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5

        };

        buttonmakeDecion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("8Ball","Random decision has been made");
               Random randomDecisionGenerated = new Random();
               int number= randomDecisionGenerated.nextInt(5);
                Log.d("8Ball","The ball number is:"+number);
                imageAsk.setImageResource(decisionArray[number]);

            }
        });
    }
}
