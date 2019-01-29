package com.example.matti.whatnow;


import java.util.ArrayList;
import java.util.Random;

public class StuffToDo {

    private ArrayList<String> nameSuggestion = new ArrayList<>();
    private ArrayList<String> durationSuggestion = new ArrayList<>();
    private ArrayList<String> participantsSuggestion = new ArrayList<>();

    private Random randomizer = new Random();
    private String name;
    private String duration;
    private String participants;

    public StuffToDo() {
        participantsSuggestion.add("YOUR HOPES AND DREAMS");
        participantsSuggestion.add("YOUR MOM");
        participantsSuggestion.add("ALONE");
        participantsSuggestion.add("YOUR BEST FRIEND");
        participantsSuggestion.add("A RANDOM HOBO");
        participantsSuggestion.add("A COPY OF THE BIBLE");
        durationSuggestion.add("1 HOUR");
        durationSuggestion.add("2 MINUTES");
        durationSuggestion.add("A WEEK");
        durationSuggestion.add("HOWEVER LONG IT TAKES TO GROW A MUSTACHE");
        durationSuggestion.add("THE REST OF THE DAY");
        durationSuggestion.add("A SOLID 19 AND A HALF SECONDS");
        nameSuggestion.add("BOWL");
        nameSuggestion.add("HIKE");
        nameSuggestion.add("GET WASTED");
        nameSuggestion.add("SCREAM INTO A NURSING HOME");
        nameSuggestion.add("LEARN TO JUGGLE");
        nameSuggestion.add("UNDERMINE MY AUTHORITAY");

    }

    public void generate() {
        this.name = nameSuggestion.get(randomizer.nextInt(nameSuggestion.size()));
        this.duration = durationSuggestion.get(randomizer.nextInt(durationSuggestion.size()));
        this.participants = participantsSuggestion.get(randomizer.nextInt(participantsSuggestion.size()));
    }

    public String generateName() {
        this.name = nameSuggestion.get(randomizer.nextInt(nameSuggestion.size()));
        return this.name;
    }

    public String generateDuration() {
        this.duration = durationSuggestion.get(randomizer.nextInt(durationSuggestion.size()));
        return this.duration;
    }

    public String generateParticipants() {
        this.participants = participantsSuggestion.get(randomizer.nextInt(participantsSuggestion.size()));
        return this.participants;
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
