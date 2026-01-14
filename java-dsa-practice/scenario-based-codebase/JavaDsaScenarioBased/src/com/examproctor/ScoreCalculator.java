package com.examproctor;

import java.util.HashMap;

class ScoreCalculator {

    private static HashMap<Integer, String> correctAnswers = new HashMap<>();

    static {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
    }

    public static int calculateScore(HashMap<Integer, String> studentAnswers) {
        int score = 0;

        for (int qId : studentAnswers.keySet()) {
            if (studentAnswers.get(qId)
                    .equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}

