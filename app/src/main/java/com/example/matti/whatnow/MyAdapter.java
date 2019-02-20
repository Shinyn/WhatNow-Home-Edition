package com.example.matti.whatnow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends ArrayAdapter {

    private StuffToDo suggestions;
    private LayoutInflater inflater;

    public MyAdapter(Context context, StuffToDo suggestions) {
        super(context, -1);

        this.suggestions = suggestions;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = inflater.inflate(R.layout.list_item, parent, false);

        ImageView imageView = listItem.findViewById(R.id.removeImg);
        imageView.setImageResource(R.drawable.minus);
        TextView txtView = listItem.findViewById(R.id.textViewInLIst);

        if (position < suggestions.getNameSuggestion().size()) {

            ArrayList<String> names = suggestions.getNameSuggestion();
            String name = names.get(position);
            txtView.setText(name);

        } else if (position >= suggestions.getNameSuggestion().size() &&
                position < suggestions.getParticipantsSuggestion().size() + suggestions.getNameSuggestion().size()) {

            ArrayList<String> participants = suggestions.getParticipantsSuggestion();
            String participant = participants.get(position - suggestions.getNameSuggestion().size() );
            txtView.setText(participant);

        } else if (position >= suggestions.getNameSuggestion().size() +
                suggestions.getParticipantsSuggestion().size()){

            ArrayList<String> durations = suggestions.getDurationSuggestion();
            String duration = durations.get(position - suggestions.getNameSuggestion().size()
                    - suggestions.getParticipantsSuggestion().size());
            txtView.setText(duration);
        }

        return listItem;
    }


    @Override
    public int getCount() {
        //return super.getCount();

        return suggestions.getNameSuggestion().size() +
                suggestions.getDurationSuggestion().size() +
                suggestions.getParticipantsSuggestion().size();

    }
}
