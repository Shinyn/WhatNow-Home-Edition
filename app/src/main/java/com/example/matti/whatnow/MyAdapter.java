package com.example.matti.whatnow;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

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
        return listItem;
    }
}
