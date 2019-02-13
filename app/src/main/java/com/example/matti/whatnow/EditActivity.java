package com.example.matti.whatnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);


        // Jag behöver tillgång till userStuffToDo i hela appen för att kunna lägga till och ta
        // bort förslag

    }


    /*
    public void addName(String userNameSuggestion) {
        userInput.addNameSuggestion(userNameSuggestion);
    }

    public void addParticipants(String userParticipantsSuggestion) {
        userInput.addParticipantsSuggestion(userParticipantsSuggestion);
    }

    public void addDuration(String userDurationSuggestion) {
        userInput.addDurationSuggestion(userDurationSuggestion);
    }

    public void removeNameActivity() {
        for (int i = 0; i < userInput.getNameSuggestion().size(); i++);
        userInput.getName();
        //Loopa igenom listan och skriva ut innehållet till ListView
    } */
}
