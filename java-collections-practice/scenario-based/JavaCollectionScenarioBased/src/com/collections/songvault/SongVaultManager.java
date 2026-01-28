package com.collections.songvault;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SongVaultManager {

    private List<Song> songs = new ArrayList<>();

    private static final Pattern PATTERN =
            Pattern.compile("(Title|Artist|Duration|Genre):\\s*(.*)");

    public void loadSongs(String folderPath) {
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path: " + folderPath);
            return;
        }
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("No files found in folder.");
            return;
        }
        for (File file : files) {
            if (!file.getName().endsWith(".txt")) continue;
            Song song = readSongFile(file);
            if (song != null) {
                songs.add(song);
            }
        }
    }

    // 🔹 Read single song file
    private Song readSongFile(File file) {

        String title = null, artist = null, duration = null, genre = null;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {

                Matcher matcher = PATTERN.matcher(line);
                if (matcher.matches()) {

                    switch (matcher.group(1)) {
                        case "Title": title = matcher.group(2); break;
                        case "Artist": artist = matcher.group(2); break;
                        case "Duration": duration = matcher.group(2); break;
                        case "Genre": genre = matcher.group(2); break;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading: " + file.getName());
        }

        if (title == null || artist == null || duration == null || genre == null) {
            System.out.println("Incomplete song skipped: " + file.getName());
            return null;
        }

        return new Song(title, artist, duration, genre);
    }

    // 🔹 Sorted songs
    public List<Song> getAllSongsSorted() {
        return songs.stream()
                .sorted(Comparator.comparing(Song::getTitle))
                .collect(Collectors.toList());
    }

    // 🔹 Group by genre
    public Map<String, List<Song>> groupByGenre() {
        return songs.stream()
                .collect(Collectors.groupingBy(Song::getGenre));
    }

    // 🔹 Unique artists
    public Set<String> getUniqueArtists() {
        return songs.stream()
                .map(Song::getArtist)
                .collect(Collectors.toCollection(TreeSet::new));
    }

    // 🔹 Songs longer than 5 minutes
    public List<Song> getSongsLongerThanFive() {
        return songs.stream()
                .filter(s -> isLongerThanFive(s.getDuration()))
                .collect(Collectors.toList());
    }

    private boolean isLongerThanFive(String duration) {
        String[] t = duration.split(":");
        int min = Integer.parseInt(t[0]);
        int sec = Integer.parseInt(t[1]);
        return min > 5 || (min == 5 && sec > 0);
    }
}
