package com.regex.replaceandmodify;
import java.util.regex.*;

public class CensorBadWords {

    public static String censorWords(String text) {

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        // Join bad words using OR (|)
        String regex = "\\b(" + String.join("|", badWords) + ")\\b";

        // Replace bad words with ****
        return text.replaceAll(regex, "****");
    }

    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words.";

        String result = censorWords(text);
        System.out.println(result);
    }
}

