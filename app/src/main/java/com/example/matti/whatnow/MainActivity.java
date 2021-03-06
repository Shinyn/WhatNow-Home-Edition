package com.example.matti.whatnow;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    ImageView whatNow;
    Button edit;
    Button soWhatNow;
    Intent intent;
    Intent intent2;
    Intent intent3;
    StuffToDo userStuffToDo;
    StuffToDo updatedList;
    Context context1;
    Toast toast1;
    CharSequence text1;
    int duration1;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Kollar om updatedList finns och om den finns så uppdateras
        // StuffToDo annars skapas ett nytt StuffToDo

        updatedList = (StuffToDo) getIntent().getSerializableExtra("updatedList");

        if (updatedList == null) {
            userStuffToDo = new StuffToDo(this);
        } else {
            userStuffToDo = updatedList;
        }

        // Intentet är att ta sig från MainActivity (this) till RandomActivity (RandomActivity.class)
        // OnTouch så byter man view till Random (bild)
        intent = new Intent(this, RandomActivity.class);
        intent.putExtra("list", userStuffToDo);

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

        // OnTouch så byter man view till Edit
        intent2 = new Intent(this, EditActivity.class);
        intent2.putExtra("list", userStuffToDo);
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

        // OnTouch så byter man view till Random
        intent3 = new Intent(this, RandomActivity.class);
        intent3.putExtra("list", userStuffToDo);
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

    public void tyUser(View v) {
        context1 = getApplicationContext();
        text1 = "(-.-)-.-)(-.(-.(-.-).-).-) (-.-).-)(-.-)";
        duration1 = Toast.LENGTH_SHORT;
        toast1 = Toast.makeText(context1, text1, duration1);
        toast1.show();
    }
}