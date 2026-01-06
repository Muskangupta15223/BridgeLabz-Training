package com.EduMentor;

public class Learner extends User  {

    private String courseType;

    public Learner(String name, String email, int id, String courseType) {
        super(name, email, id);
        this.courseType = courseType;
    }

    @Override
    public String generateCertificate(double percentage) {
        if (percentage > 50) {
            return "🎉 Certificate Generated for " + courseType;
        }
        return "❌ Certificate NOT Generated (Score <= 50%)";
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Course Type: " + courseType);
    }

}
