package com.example.matti.whatnow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView whatNow;
    Button edit;
    Button soWhatNow;
    Intent intent;
    Intent intent2;
    Intent intent3;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // Intentet är att ta sig från MainActivity (this) till RandomActivity (RandomActivity.class)
        intent = new Intent(this, RandomActivity.class);
        whatNow = findViewById(R.id.whatNow);
        whatNow.setImageResource(R.drawable.whatnow);
        whatNow.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();
                switch (action) {
                    case (MotionEvent.ACTION_UP) :
                    startActivity(intent);
                return true;
                    case (MotionEvent.ACTION_DOWN) :
                        return true;
                }
                return false;
            }
        });

        intent2 = new Intent(this, EditActivity.class);
        edit = findViewById(R.id.edit);
        edit.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();
                switch (action) {
                    case (MotionEvent.ACTION_UP) :
                        startActivity(intent2);
                        return true;
                    case (MotionEvent.ACTION_DOWN) :
                        return true;
                }
                return false;
            }
        });

        intent3 = new Intent(this, RandomActivity.class);
        soWhatNow = findViewById(R.id.whatNowButton);
        soWhatNow.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                int action = event.getActionMasked();
                switch (action) {
                    case (MotionEvent.ACTION_UP) :
                        startActivity(intent3);
                        return true;
                    case (MotionEvent.ACTION_DOWN) :
                        return true;
                }
                return false;
            }
        });

    }
}
