package com.example.matti.whatnow;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class EditActivity extends AppCompatActivity {

    public StuffToDo ustd;
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
        ListView nameListView = findViewById(R.id.listView);
        final MyAdapter adapter = new MyAdapter(this, ustd);
        nameListView.setAdapter(adapter);

        nameListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position < ustd.getNameSuggestion().size()) {
                    ArrayList<String> names = ustd.getNameSuggestion();
                    names.remove(position);
                    adapter.notifyDataSetChanged();

                } else if (position >= ustd.getNameSuggestion().size() &&
                        position < ustd.getParticipantsSuggestion().size()
                    + ustd.getNameSuggestion().size()) {

                    ArrayList<String> participants = ustd.getParticipantsSuggestion();
                    participants.remove(position - ustd.getNameSuggestion().size());
                    adapter.notifyDataSetChanged();

                } else if (position >= ustd.getNameSuggestion().size() +
                        ustd.getParticipantsSuggestion().size()) {

                    ArrayList<String> durations = ustd.getDurationSuggestion();
                    durations.remove(position
                            - ustd.getNameSuggestion().size()
                            - ustd.getParticipantsSuggestion().size());
                    adapter.notifyDataSetChanged();
                }

            }
        });

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
                    adapter.notifyDataSetChanged();
                    toast();

                } else if (radioId == R.id.radioBtn2) {
                    EditText participants = findViewById(R.id.editText);
                    String text = participants.getText().toString();
                    ustd.addParticipants(text);
                    participants.setText("");
                    adapter.notifyDataSetChanged();
                    toast();

                } else if (radioId == R.id.radioBtn3) {
                    EditText duration = findViewById(R.id.editText);
                    String text = duration.getText().toString();
                    ustd.addDuration(text);
                    duration.setText("");
                    adapter.notifyDataSetChanged();
                    toast();

                }  // Inte findViewById utan bara R.id.deDuSöker då vi vill jämföra ett id med ett
                   // id och inte ett id med en view då det inte går.
            }
        });
    }

    // Håller koll på den radioknapp som är aktiverad.
    public void checkButton(View v) {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
    }

    // Overridar tillbaka knappen så att main får den uppdaterade listan.
    @Override
    public void onBackPressed() {
        intent = new Intent(this, MainActivity.class);
        intent.putExtra("updatedList", ustd);
        startActivity(intent);
    }

    // Visar en Toast när en aktivitet lagts till (FUNKAR)
    public void toast() {
        context = getApplicationContext();
        text = "Activity Added";
        duration = Toast.LENGTH_SHORT;
        toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
