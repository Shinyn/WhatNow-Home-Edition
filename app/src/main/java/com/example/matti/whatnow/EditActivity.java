package com.example.matti.whatnow;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {

    StuffToDo ustd;
    RadioButton radioButton;
    RadioGroup radioGroup;
    Intent intent;
    Toast toast;
    Context context;
    CharSequence text;
    int duration;

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
                    name.setText("");
                    toast();

                } else if (radioId == R.id.radioBtn2) {
                    EditText participants = findViewById(R.id.editText);
                    String text = participants.getText().toString();
                    ustd.addParticipants(text);
                    participants.setText("");
                    toast();

                } else if (radioId == R.id.radioBtn3) {
                    EditText duration = findViewById(R.id.editText);
                    String text = duration.getText().toString();
                    ustd.addDuration(text);
                    duration.setText("");
                    toast();

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



    public void goToMainActivity() {
        intent = new Intent(this, MainActivity.class);
        intent.putExtra("updatedList", ustd);
        startActivity(intent);
    }

    public void toast() {
        context = getApplicationContext();
        text = "Activity Added";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    //@Override
    //public void onBackPressed() {
    //
    //}


    /*
    public void removeNameActivity() {
        for (int i = 0; i < userInput.getNameSuggestion().size(); i++);
        userInput.getName();
        //Loopa igenom listan och skriva ut innehållet till ListView
    } */
}
