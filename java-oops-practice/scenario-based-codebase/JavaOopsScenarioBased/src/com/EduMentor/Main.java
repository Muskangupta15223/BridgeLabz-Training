package com.EduMentor;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Learner l1 = new Learner("Muskan", "mus@123", 123, "ShortCourse");
        Learner l2 = new Learner("Raghav", "rag@123", 513, "ShortCourse");
        Learner l3 = new Learner("Krishna", "krish@123", 567, "FullCourse");


        Quiz quiz = new Quiz("Medium");
        quiz.addQuestion(
            "What is Java?",
            Arrays.asList("Programming Language", "OS", "Browser", "Hardware"),
            "a"
        );
        quiz.addQuestion(
                "Which exception occurs when dividing by zero?",
                Arrays.asList("NullPointerException","ArithmeticException"," IOException" ,"ArrayIndexOutOfBoundsException"),
                "b"
            );
        quiz.addQuestion(
                "Which operator is used for logical AND?",
                Arrays.asList("&", "|", "&&", "||"),
                "c"
            );
        quiz.addQuestion(
            "Which keyword creates object?",
            Arrays.asList("class", "new", "this", "object"),
            "b"
        );

        quiz.addQuestion(
            "Which concept allows method overriding?",
            Arrays.asList("Encapsulation", "Inheritance", "Polymorphism", "Abstraction"),
            "c"
        );

        conductQuiz(quiz, l1, sc);
        conductQuiz(quiz, l2, sc);
        conductQuiz(quiz, l3, sc);

        sc.close();
    }

    public static void conductQuiz(Quiz quiz, Learner learner, Scanner sc) {

        List<String> userAnswers = new ArrayList<>();

        System.out.println("\n QUIZ FOR " + learner.getName() + " \n");

        for (int i = 0; i < quiz.getQuestions().size(); i++) {

            System.out.println("\nQ" + (i + 1) + ": " + quiz.getQuestions().get(i));

            List<String> opts = quiz.getOptions().get(i);
            System.out.println("a) " + opts.get(0));
            System.out.println("b) " + opts.get(1));
            System.out.println("c) " + opts.get(2));
            System.out.println("d) " + opts.get(3));

            System.out.print("Answer (a/b/c/d): ");
            userAnswers.add(sc.nextLine());
        }

        quiz.evaluateQuiz(userAnswers);
        double percent = quiz.calculatePercentage();

        System.out.println("\n--- RESULT ---");
        learner.displayInfo();
        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + percent + "%");
        System.out.println(learner.generateCertificate(percent));
        System.out.println("----------------------------------");
    }
}
