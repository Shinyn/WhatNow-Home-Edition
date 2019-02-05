package com.example.matti.whatnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    public StuffToDo userStuffToDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // userStuffToDo = new StuffToDo(this);

        //tar emot de vi skickade med från mainActivity och stoppar det i userStuffToDO
        // vi kallar på den med namet den fick i main - dvs "stuff
        userStuffToDo = (StuffToDo) getIntent().getSerializableExtra("stuff");
        setContentView(R.layout.activity_random);


        TextView suggestedActivity = findViewById(R.id.suggestedActivity);
        suggestedActivity.setText(userStuffToDo.generateName());

        TextView suggestedParticipants = findViewById(R.id.participants);
        suggestedParticipants.setText(userStuffToDo.generateParticipants());

        TextView suggestedDuration = findViewById(R.id.actualDuration);
        suggestedDuration.setText(userStuffToDo.generateDuration());





    }
}
