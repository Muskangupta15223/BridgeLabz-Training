package com.collections.songvault;

import java.io.*;
import java.util.regex.*;

public class SongFileReader {

    private static final Pattern PATTERN =
            Pattern.compile("(Title|Artist|Duration|Genre):\\s*(.*)");

    public static Song readSong(File file) {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher matcher = PATTERN.matcher(line);
                if (matcher.matches()) {

                    String key = matcher.group(1);
                    String value = matcher.group(2);

                    switch (key) {
                        case "Title": title = value; break;
                        case "Artist": artist = value; break;
                        case "Duration": duration = value; break;
                        case "Genre": genre = value; break;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }

        if (title == null || artist == null || duration == null || genre == null) {
            System.out.println("Incomplete song skipped: " + file.getName());
            return null;
        }

        return new Song(title, artist, duration, genre);
    }
}

