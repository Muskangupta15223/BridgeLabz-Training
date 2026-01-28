package com.collections.chatlogparser;

public class ChatLogParserMain {
    public static void main(String[] args) {
        ChatLogParser parser = new ChatLogParser();
        
        MessageFilter<String> filter = new IdleMessageFilter();


        String logFile = "D:\\\\BridgeLabz-Training\\\\java-collections-practice\\\\scenario-based\\\\JavaCollectionScenarioBased\\\\src\\\\com\\\\resources\\samplefiles\\logs\\chatlog.txt";

        try {
            parser.parseLogFile(logFile, filter);
            parser.printSummary();

            System.out.println("Messages by John: " + parser.getMessageCount("John"));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
