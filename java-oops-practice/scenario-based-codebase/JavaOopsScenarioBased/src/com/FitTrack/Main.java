package com.FitTrack;

public class Main {

    public static void main(String[] args) {

        // User
        UserProfile user = new UserProfile("Muskan",21,55,"Weight Loss");

        user.displayProfile();
        System.out.println("----------------------");

        Workout cardio = new CardioWorkout(30);
        Workout strength = new StrengthWorkout(20);

        cardio.startWorkout();
        int cardioCalories = cardio.calculateCalories();
        cardio.stopWorkout();

        strength.startWorkout();
        int strengthCalories = strength.calculateCalories();
        strength.stopWorkout();

        int totalCalories = cardioCalories + strengthCalories;

        System.out.println("\nCalories Burned (Cardio): " + cardioCalories);
        System.out.println("Calories Burned (Strength): " + strengthCalories);
        System.out.println("Total Calories Burned: " + totalCalories);

        int progress = user.calculateProgress(totalCalories);
        System.out.println("Remaining Calories to Target: " + progress);
    }
}
