package com.EduMentor;
import java.util.*;

public class Quiz {

    private List<String> questions;
    private List<List<String>> options; // options per question
    private List<String> answers;       // correct option (a/b/c/d)
    private int score;
    private String difficulty;

    public Quiz(String difficulty) {
        this.difficulty = difficulty;
        questions = new ArrayList<>();
        options = new ArrayList<>();
        answers = new ArrayList<>();
        score = 0;
    }

    // add MCQ question
    public void addQuestion(String question, List<String> opts, String answer) {
        questions.add(question);
        options.add(opts);
        answers.add(answer.toLowerCase());
    }

    // evaluate quiz
    public void evaluateQuiz(List<String> userResponses) {
        score = 0;
        for (int i = 0; i < answers.size(); i++) {
            if (answers.get(i).equalsIgnoreCase(userResponses.get(i))) {
                score++;
            }
        }
    }

    public double calculatePercentage() {
        return (questions.size() == 0) ? 0 :
               ((double) score / questions.size()) * 100;
    }

    public int getScore() {
        return score;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public List<String> getQuestions() {
        return Collections.unmodifiableList(questions);
    }

    public List<List<String>> getOptions() {
        return Collections.unmodifiableList(options);
    }
}
