package com.examproctor;

import java.util.*;

class ExamSession {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> answers = new HashMap<>();

    // Track navigation
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answer
    public void answerQuestion(int questionId, String answer) {
        answers.put(questionId, answer);
        System.out.println("Answered Q" + questionId + ": " + answer);
    }

    // Submit exam
    public void submitExam() {
        int score = ScoreCalculator.calculateScore(answers);
        System.out.println("Final Score: " + score);
    }
}

