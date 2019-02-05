package com.example.matti.whatnow;


import android.content.Context;
import android.print.PageRange;

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

    public StuffToDo() {}

    public StuffToDo(Context c ) {
        participantsSuggestion.add(c.getString(R.string.hopes_dreams));
        participantsSuggestion.add(c.getString(R.string.your_mom));
        participantsSuggestion.add(c.getString(R.string.no_one));
        participantsSuggestion.add(c.getString(R.string.your_best_friend));
        participantsSuggestion.add(c.getString(R.string.a_random_hobo));
        participantsSuggestion.add(c.getString(R.string.copy_of_bible));
        participantsSuggestion.add(c.getString(R.string.stray_cat));
        participantsSuggestion.add(c.getString(R.string.someones_grandmother));
        participantsSuggestion.add(c.getString(R.string.woman_sarah));
        participantsSuggestion.add(c.getString(R.string.man_john));
        participantsSuggestion.add(c.getString(R.string.dog_pluto));
        participantsSuggestion.add(c.getString(R.string.delicious_dinner));
        participantsSuggestion.add(c.getString(R.string.saxophone_player));
        participantsSuggestion.add(c.getString(R.string.willing_animal));
        participantsSuggestion.add(c.getString(R.string.ceo_google));
        participantsSuggestion.add(c.getString(R.string.silverware));
        participantsSuggestion.add(c.getString(R.string.cactus));
        participantsSuggestion.add(c.getString(R.string.vodka));
        participantsSuggestion.add(c.getString(R.string.mothers_firstborn));
        participantsSuggestion.add(c.getString(R.string.five_people));
        participantsSuggestion.add(c.getString(R.string.deck_of_cards));
        participantsSuggestion.add(c.getString(R.string.living_thing));
        participantsSuggestion.add(c.getString(R.string.sibling);
        participantsSuggestion.add(c.getString(R.string.relative);
        participantsSuggestion.add(c.getString(R.string.mushrooms);
        participantsSuggestion.add(c.getString(R.string.collection_unmentionables);
        participantsSuggestion.add(c.getString(R.string.soul_mate);
        participantsSuggestion.add(c.getString(R.string.childhood_toy);
        participantsSuggestion.add(c.getString(R.string.good_book);
        participantsSuggestion.add(c.getString(R.string.novel_stephen_king);
        participantsSuggestion.add(c.getString(R.string.declaration_independence);
        participantsSuggestion.add(c.getString(R.string.mona_lisa);
        participantsSuggestion.add(c.getString(R.string.country_flag);
        participantsSuggestion.add(c.getString(R.string.survival_gear);
        participantsSuggestion.add(c.getString(R.string.three_d_printer);
        participantsSuggestion.add(c.getString(R.string.town_drunk);
        participantsSuggestion.add(c.getString(R.string.elvis_impersonator);
        durationSuggestion.add("1 HOUR");
        durationSuggestion.add("2 MINUTES");
        durationSuggestion.add("A WEEK");
        durationSuggestion.add("HOWEVER LONG IT TAKES TO GROW A MUSTACHE");
        durationSuggestion.add("THE REST OF THE DAY");
        durationSuggestion.add("A SOLID 19 AND A HALF SECONDS");
        durationSuggestion.add("THE AMOUNT OF TIME IT TAKES TO COOK AN OSTRIDGE");
        durationSuggestion.add("3^23 NANO-SECONDS");
        durationSuggestion.add("AS LONG AS IT TOOK YOU TO FINISH 10 PULL-UPS");
        durationSuggestion.add("4 BANK-DAYS");
        durationSuggestion.add("A GOOD 48 MINUTES");
        durationSuggestion.add("ABOUT 16 HOURS");
        durationSuggestion.add("THE REST OF YOUR LIFE");
        durationSuggestion.add("2 MONTHS, 15 DAYS AND 3 HOURS");
        durationSuggestion.add("HOWEVER LONG YOU WOULD LIKE");
        durationSuggestion.add("THE LAST WEEK OF JUNE");
        durationSuggestion.add("2 AND A HALF YEARS");
        durationSuggestion.add("1 DECADE");
        durationSuggestion.add("AS MANY DAYS AS AMOUNT OF WEEKS IT WAS SINCE X-MAS");
        durationSuggestion.add("42 MINUTES AND 9 SECONDS");
        durationSuggestion.add("AS LONG AS YOU LIKE");
        durationSuggestion.add("A VERY LONG TIME");
        durationSuggestion.add("15 MINUTES");
        durationSuggestion.add("HALF AN HOUR");
        durationSuggestion.add("A WHOLE HOUR");
        durationSuggestion.add("THREE QUARTERS OF TWO HOURS");
        durationSuggestion.add("16*27 MINUTES");
        durationSuggestion.add("THE REST OF THE WEEK");
        durationSuggestion.add("72 HOURS");
        durationSuggestion.add("WHATEVER THE CURRENT GUINNESS WORLD RECORD IS");
        durationSuggestion.add("THE LENGTH OF A TV-COMMERCIAL");
        durationSuggestion.add("2 HOURS AND 9 MINUTES");
        durationSuggestion.add("11 OF THOSE LEAP-YEARS");
        durationSuggestion.add("AS MANY MINUTES AS YOU HAVE TEETH IN YOUR MOUTH");
        durationSuggestion.add("A TOILET SESSION");
        nameSuggestion.add("BOWL");
        nameSuggestion.add("HIKE");
        nameSuggestion.add("JUGGLE");
        nameSuggestion.add("WORK OUT");
        nameSuggestion.add("THROW DARTS");
        nameSuggestion.add("PLAY PING-PONG");
        nameSuggestion.add("PLAY TENNIS");
        nameSuggestion.add("PLAY SOCCER");
        nameSuggestion.add("PLAY VIDEO GAMES");
        nameSuggestion.add("DO CARDIO");
        nameSuggestion.add("COOK");
        nameSuggestion.add("HELP A FRIEND");
        nameSuggestion.add("DONATE TO CHARITY");
        nameSuggestion.add("SHARE YOUR WISDOM");
        nameSuggestion.add("GATHER INTELLIGENCE");
        nameSuggestion.add("LOWER YOUR EXPECTATIONS");
        nameSuggestion.add("WATCH INFINITY WAR");
        nameSuggestion.add("GET WASTED");
        nameSuggestion.add("SCREAM INTO A NURSING HOME");
        nameSuggestion.add("LEARN TO JUGGLE");
        nameSuggestion.add("UNDERMINE YOUR FATHERS WISDOM");
        nameSuggestion.add("GO ON A WITCH-HUNT");
        nameSuggestion.add("VISIT AN OLD MANS TOMB");
        nameSuggestion.add("GO TO FRANCE");
        nameSuggestion.add("VISIT AN OLD ENEMY'S HOUSE");
        nameSuggestion.add("VISIT A CURRENT ENEMY'S HOUSE");
        nameSuggestion.add("GO TO THE LAST PLACE YOU HAD ICE-CREAM");
        nameSuggestion.add("FIGURE OUT THE MEANING OF LIFE");
        nameSuggestion.add("START DOING YOGA");
        nameSuggestion.add("START A FAN-CLUB");
        nameSuggestion.add("LEARN TO JUGGLE");
        nameSuggestion.add("LEARN A NEW LANGUAGE");
        nameSuggestion.add("DRINK MORE WATER");
        nameSuggestion.add("DEVELOP AN UNDERSTANDING FOR CHEESE");
        nameSuggestion.add("RIDE A HORSE THROUGH AN EMPTY BEACH");
        nameSuggestion.add("RUN LIKE YOUR LIFE DEPENDED ON IT");

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

    public ArrayList<String> getNameSuggestion() {
        return nameSuggestion;
    }

    public ArrayList<String> getDurationSuggestion() {
        return durationSuggestion;
    }

    public ArrayList<String> getParticipantsSuggestion() {
        return participantsSuggestion;
    }
}
