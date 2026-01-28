package com.collections.resumeanalyzer;

public class ResumeAnalyzerMain {

    public static void main(String[] args) {
    	System.out.println("                 RESUME ANALYZER");
       ResumeAnalyzer analyzer = new ResumeAnalyzer();

        String folder = "D:\\BridgeLabz-Training\\java-collections-practice\\scenario-based\\JavaCollectionScenarioBased\\src\\com\\resources\\samplefiles\\resumes";

        analyzer.processFolder(folder);
        analyzer.showResults();
    }
}