package com.example.matti.whatnow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EditActivity extends AppCompatActivity {

    StuffToDo ustd;
    RadioButton radioButton;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        ustd = (StuffToDo) getIntent().getSerializableExtra("list");

        radioGroup = findViewById(R.id.radioGroup);
        Button addSuggestion = findViewById(R.id.addSuggestion);
        addSuggestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if(radioId == R.id.radioBtn1) {
                    EditText name = findViewById(R.id.editText);
                    String text = name.getText().toString();
                    ustd.addName(text);
                } else if (radioId == R.id.radioBtn2) {
                    EditText participants = findViewById(R.id.editText);
                    String text = participants.getText().toString();
                    ustd.addParticipants(text);
                } else if (radioId == R.id.radioBtn3) {
                    EditText duration = findViewById(R.id.editText);
                    String text = duration.getText().toString();
                    ustd.addDuration(text);
                }  // Inte findViewById utan bara R.id.deDuSöker då vi vill jämföra ett id med ett
                   // id och inte ett id med en view då det inte går.
            }
        });




        //Listview visas




    }

    public void remove() {
        ustd.removeName(1);
        ustd.removeDuration(2);
        ustd.removeParticipants(3);
    }

    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }


    /*
    public void removeNameActivity() {
        for (int i = 0; i < userInput.getNameSuggestion().size(); i++);
        userInput.getName();
        //Loopa igenom listan och skriva ut innehållet till ListView
    } */
}
