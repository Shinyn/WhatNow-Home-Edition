package com.example.matti.whatnow;


import android.content.Context;
import android.util.Log;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

// implements Serializable - lovar att använda sig av vissa saker (konstruktor, getter, setter)
// och vi behöver den för att kunna skicka runt vår StuffToDo till olika views.
// implements Serializable
public class StuffToDo {

    private ArrayList<String> nameSuggestion = new ArrayList<>();
    private ArrayList<String> durationSuggestion = new ArrayList<>();
    private ArrayList<String> participantsSuggestion = new ArrayList<>();


    private Random randomizer = new Random();
    private String name;
    private String duration;
    private String participants;

    public StuffToDo() {
        //randomizer = new Random();
        //Log.d("David", "Random()");
    }

    public StuffToDo(Context c ) {
        //Log.d("David", "Random(c)");
        //randomizer = new Random();
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
        participantsSuggestion.add(c.getString(R.string.poodle_rex));
        participantsSuggestion.add(c.getString(R.string.ceo_google));
        participantsSuggestion.add(c.getString(R.string.silverware));
        participantsSuggestion.add(c.getString(R.string.cactus));
        participantsSuggestion.add(c.getString(R.string.vodka));
        participantsSuggestion.add(c.getString(R.string.mothers_firstborn));
        participantsSuggestion.add(c.getString(R.string.five_people));
        participantsSuggestion.add(c.getString(R.string.deck_of_cards));
        participantsSuggestion.add(c.getString(R.string.living_thing));
        participantsSuggestion.add(c.getString(R.string.sibling));
        participantsSuggestion.add(c.getString(R.string.relative));
        participantsSuggestion.add(c.getString(R.string.mushrooms));
        participantsSuggestion.add(c.getString(R.string.collection_unmentionables));
        participantsSuggestion.add(c.getString(R.string.soul_mate));
        participantsSuggestion.add(c.getString(R.string.childhood_toy));
        participantsSuggestion.add(c.getString(R.string.good_book));
        participantsSuggestion.add(c.getString(R.string.novel_stephen_king));
        participantsSuggestion.add(c.getString(R.string.declaration_independence));
        participantsSuggestion.add(c.getString(R.string.mona_lisa));
        participantsSuggestion.add(c.getString(R.string.country_flag));
        participantsSuggestion.add(c.getString(R.string.survival_gear));
        participantsSuggestion.add(c.getString(R.string.three_d_printer));
        participantsSuggestion.add(c.getString(R.string.town_drunk));
        participantsSuggestion.add(c.getString(R.string.elvis_impersonator));
        durationSuggestion.add(c.getString(R.string.one_hour));
        durationSuggestion.add(c.getString(R.string.two_minutes));
        durationSuggestion.add(c.getString(R.string.week));
        durationSuggestion.add(c.getString(R.string.grow_mustache));
        durationSuggestion.add(c.getString(R.string.rest_of_day));
        durationSuggestion.add(c.getString(R.string.solid_nineteen_half));
        durationSuggestion.add(c.getString(R.string.cook_ostridge));
        durationSuggestion.add(c.getString(R.string.nano_seconds));
        durationSuggestion.add(c.getString(R.string.pull_ups));
        durationSuggestion.add(c.getString(R.string.four_bank_days));
        durationSuggestion.add(c.getString(R.string.forty_eight_min));
        durationSuggestion.add(c.getString(R.string.sixteen_hours));
        durationSuggestion.add(c.getString(R.string.rest_of_life));
        durationSuggestion.add(c.getString(R.string.months_days_hours));
        durationSuggestion.add(c.getString(R.string.as_long_as_like));
        durationSuggestion.add(c.getString(R.string.last_week_june));
        durationSuggestion.add(c.getString(R.string.two_half_years));
        durationSuggestion.add(c.getString(R.string.one_decade));
        durationSuggestion.add(c.getString(R.string.days_weeks_xmas));
        durationSuggestion.add(c.getString(R.string.forty_two_min_sec));
        durationSuggestion.add(c.getString(R.string.long_want));
        durationSuggestion.add(c.getString(R.string.very_long_time));
        durationSuggestion.add(c.getString(R.string.fifteen_min));
        durationSuggestion.add(c.getString(R.string.half_hour));
        durationSuggestion.add(c.getString(R.string.whole_hour));
        durationSuggestion.add(c.getString(R.string.three_quarters_hours));
        durationSuggestion.add(c.getString(R.string.sixteen_twenty_seven));
        durationSuggestion.add(c.getString(R.string.rest_of_week));
        durationSuggestion.add(c.getString(R.string.seventy_two_hours));
        durationSuggestion.add(c.getString(R.string.youtube_video_load));
        durationSuggestion.add(c.getString(R.string.tv_commercial));
        durationSuggestion.add(c.getString(R.string.two_hours_nine_min));
        durationSuggestion.add(c.getString(R.string.eleven_leap_years));
        durationSuggestion.add(c.getString(R.string.min_teeth_mouth));
        durationSuggestion.add(c.getString(R.string.toilet_session));
        nameSuggestion.add(c.getString(R.string.bowl));
        nameSuggestion.add(c.getString(R.string.hike));
        nameSuggestion.add(c.getString(R.string.juggle));
        nameSuggestion.add(c.getString(R.string.work_out));
        nameSuggestion.add(c.getString(R.string.throw_darts));
        nameSuggestion.add(c.getString(R.string.play_ping_pong));
        nameSuggestion.add(c.getString(R.string.tennis));
        nameSuggestion.add(c.getString(R.string.soccer));
        nameSuggestion.add(c.getString(R.string.video_games));
        nameSuggestion.add(c.getString(R.string.do_cardio));
        nameSuggestion.add(c.getString(R.string.cook));
        nameSuggestion.add(c.getString(R.string.help_a_friend));
        nameSuggestion.add(c.getString(R.string.donate_to_charity));
        nameSuggestion.add(c.getString(R.string.share_wisdom));
        nameSuggestion.add(c.getString(R.string.gather_intelligence));
        nameSuggestion.add(c.getString(R.string.lower_expectations));
        nameSuggestion.add(c.getString(R.string.watch_infinity_war));
        nameSuggestion.add(c.getString(R.string.get_wasted));
        nameSuggestion.add(c.getString(R.string.scream_nursing_home));
        nameSuggestion.add(c.getString(R.string.learn_juggle));
        nameSuggestion.add(c.getString(R.string.undermine_father_wisdom));
        nameSuggestion.add(c.getString(R.string.go_witch_hunt));
        nameSuggestion.add(c.getString(R.string.visit_old_tomb));
        nameSuggestion.add(c.getString(R.string.go_to_france));
        nameSuggestion.add(c.getString(R.string.visit_old_friend));
        nameSuggestion.add(c.getString(R.string.visit_current_enemy));
        nameSuggestion.add(c.getString(R.string.go_last_ice_cream));
        nameSuggestion.add(c.getString(R.string.figure_out_life));
        nameSuggestion.add(c.getString(R.string.start_yoga));
        nameSuggestion.add(c.getString(R.string.start_fan_club));
        nameSuggestion.add(c.getString(R.string.mind_business));
        nameSuggestion.add(c.getString(R.string.learn_language));
        nameSuggestion.add(c.getString(R.string.drink_more_water));
        nameSuggestion.add(c.getString(R.string.develop_understand_cheese));
        nameSuggestion.add(c.getString(R.string.ride_horse_beach));
        nameSuggestion.add(c.getString(R.string.run_life_depends_on_it));

    }

    public void generate() {
        this.name = nameSuggestion.get(randomizer.nextInt(nameSuggestion.size()));
        this.duration = durationSuggestion.get(randomizer.nextInt(durationSuggestion.size()));
        this.participants = participantsSuggestion.get(randomizer.nextInt(participantsSuggestion.size()));
    }

    public String generateName() {
        //int ran = randomizer.nextInt(nameSuggestion.size());
        //Log.d("David", "rand: " + ran);
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
