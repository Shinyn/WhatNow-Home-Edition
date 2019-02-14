package com.example.matti.whatnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RandomActivity extends AppCompatActivity {

    //ska skicka med intent från main - dvs userstufftodo så alla views kommer åt den
    //public StuffToDo userStuffToDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Tar in extra från main och säger att den vi tar in är en StuffToDo och lägger den i en
        // ny StuffToDo
        StuffToDo ustd = (StuffToDo) getIntent().getSerializableExtra("list");


        //Äldre versionen
        //userStuffToDo = new StuffToDo(this);
        setContentView(R.layout.activity_random);


        TextView suggestedActivity = findViewById(R.id.suggestedActivity);
        suggestedActivity.setText(ustd.generateName());

        TextView suggestedParticipants = findViewById(R.id.participants);
        suggestedParticipants.setText(ustd.generateParticipants());

        TextView suggestedDuration = findViewById(R.id.actualDuration);
        suggestedDuration.setText(ustd.generateDuration());


    }
}