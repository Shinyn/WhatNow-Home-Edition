package com.example.matti.whatnow;


import java.util.ArrayList;
import java.util.Random;

public class Activity {

    private ArrayList<String> nameSuggestion = new ArrayList<>();
    private ArrayList<String> durationSuggestion = new ArrayList<>();
    private ArrayList<String> participantsSuggestion = new ArrayList<>();

    private Random randomizer = new Random();
    private String name;
    private String duration;
    private String participants;

    public Activity() {
        participantsSuggestion.add("Charles");
        participantsSuggestion.add("kevin");
        durationSuggestion.add("1 hour");
        durationSuggestion.add("2 min");
        nameSuggestion.add("bowl");
        nameSuggestion.add("hike");

    }

    public void generate() {
        this.name = nameSuggestion.get(randomizer.nextInt(nameSuggestion.size()));
        this.duration = durationSuggestion.get(randomizer.nextInt(durationSuggestion.size()));
        this.participants = participantsSuggestion.get(randomizer.nextInt(participantsSuggestion.size()));
    }

    public void addNameSuggestion(String name) {
        nameSuggestion.add(name);
    }

    public void addDurationSuggestion(String duration) {
        durationSuggestion.add(duration);
    }

    public void addParticipantsSuggestion(String participants) {
        participantsSuggestion.add(participants);
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }

    public String getParticipants() {
        return participants;
    }
}
