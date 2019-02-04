package com.example.matti.whatnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class EditActivity extends AppCompatActivity {

    StuffToDo userInput = new StuffToDo();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);








    }

    public void addName(String userNameSuggestion) {
        userInput.addNameSuggestion(userNameSuggestion);
    }

    public void addParticipants(String userParticipantsSuggestion) {
        userInput.addParticipantsSuggestion(userParticipantsSuggestion);
    }

    public void addDuration(String userDurationSuggestion) {
        userInput.addDurationSuggestion(userDurationSuggestion);
    }

    public void removeActivity() {

    }
}
