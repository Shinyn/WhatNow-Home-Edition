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
        participantsSuggestion.add("A STRAY GRANDMOTHER");
        participantsSuggestion.add("A WOMAN NAMED SARAH");
        participantsSuggestion.add("A MAN NAMED JOHN");
        participantsSuggestion.add("A DOG NAMED PLUTO");
        participantsSuggestion.add("YOUR DELICIOUS DINNER");
        participantsSuggestion.add("A SAXOPHONE-PLAYER");
        participantsSuggestion.add("A WILLING ANIMAL OF YOUR CHOICE");
        participantsSuggestion.add("THE CEO OF GOOGLE");
        participantsSuggestion.add("YOUR SILVERWARE");
        participantsSuggestion.add("A CACTUS");
        participantsSuggestion.add("2 BOTTLES OF VODKA");
        participantsSuggestion.add("YOUR MOTHERS FIRST-BORN");
        participantsSuggestion.add("A 5 PEOPLE OF YOUR CHOICE");
        participantsSuggestion.add("A DECK OF CARDS AND NOTHING ELSE");
        durationSuggestion.add("1 HOUR");
        durationSuggestion.add("2 MINUTES");
        durationSuggestion.add("A WEEK");
        durationSuggestion.add("HOWEVER LONG IT TAKES TO GROW A MUSTACHE");
        durationSuggestion.add("THE REST OF THE DAY");
        durationSuggestion.add("A SOLID 19 AND A HALF SECONDS");
        durationSuggestion.add("THE AMOUNT OF TIME IT TAKES TO COOK AN OSTRIDGE");
        durationSuggestion.add("3^23 NANO-SECONDS");
        durationSuggestion.add("AS LONG AS IT TOOK YOU TO FINISH YOUR MASTERS-DEGREE");
        durationSuggestion.add("4 BANK-DAYS");
        durationSuggestion.add("A GOOD 48 MINUTES");
        durationSuggestion.add("ABOUT 16 HOURS");
        durationSuggestion.add("THE REST OF YOUR LIFE");
        durationSuggestion.add("2 MONTHS, 15 DAYS, 3 HOURS, 29 MINUTES AND 11 SECONDS");
        durationSuggestion.add("HOWEVER LONG YOU WOULD LIKE");
        durationSuggestion.add("THE LAST WEEK OF JUNE");
        durationSuggestion.add("2 AND A HALF YEARS");
        durationSuggestion.add("1 DECADE");
        durationSuggestion.add("AS MANY DAYS AS AMOUNT OF WEEKS IT WAS SINCE THE LATEST RECESSION");
        durationSuggestion.add("420 MINUTES AND 69 SECONDS");
        nameSuggestion.add("BOWL");
        nameSuggestion.add("HIKE");
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
        nameSuggestion.add("DEVELOP AND UNDERSTANDING FOR CHEESE");
        nameSuggestion.add("RIDE A HORSE THROUGH AN EMPTY BEACH");

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
