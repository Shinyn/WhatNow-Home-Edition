package com.example.matti.whatnow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "imageID";

    ImageView whatNow;
    Intent intent;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



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


//        Button button = (Button) findViewById(R.id.edit);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent();
//            }
//        });

        //readFromList();



    }


//
//    public StuffToDo readFromList() {
//        int index = randomizer.nextInt(activitySuggestion.size());
//        StuffToDo item = activitySuggestion.get(index);
//        System.out.println("You should " + item.getName() + " with " + item.getParticipants() +
//                " for " + item.getDuration());
//        return item;
//    }
//
//    public void whtNowButtonPressed(View view) {
//        intent.putExtra(MESSAGE, R.drawable.whatnow);
//        startActivity(intent);
//    }


}
