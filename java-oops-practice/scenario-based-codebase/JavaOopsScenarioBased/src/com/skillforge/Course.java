package com.skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    protected double rating;            
    private String[] modules;
    private final String[] reviews;       

    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[]{"Introduction", "Basics", "Advanced"};
        this.reviews = new String[]{"Well structured", "Beginner friendly"};
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.reviews = new String[]{"Industry relevant"};
    }

    public String[] getReviews() {
        return reviews.clone();  // prevents modification
    }

    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title);
        System.out.println("Instructor: " + instructor.name);
        System.out.println("Rating: " + rating);
        System.out.print("Modules: ");
        for (String m : modules) {
            System.out.print(m + " | ");
        }
        System.out.println();
    }
}