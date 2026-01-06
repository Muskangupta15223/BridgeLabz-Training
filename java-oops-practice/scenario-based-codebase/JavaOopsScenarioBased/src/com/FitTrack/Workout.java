package com.FitTrack;
import java.util.*;

public abstract class Workout implements ITrackable {

    protected String type;
    protected int duration; // minutes
    protected int caloriesBurned;

    private List<String> workoutLogs = new ArrayList<>(); // restricted

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract int calculateCalories(); 

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    @Override
    public void startWorkout() {
        workoutLogs.add("Workout Started");
        System.out.println(type + " workout started");
    }

    @Override
    public void stopWorkout() {
        workoutLogs.add("Workout Ended");
        System.out.println(type + " workout stopped");
    }
}
