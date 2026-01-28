package com.collections.songvault;
import java.util.*;

public class SongVaultMain {

    public static void main(String[] args) {

        SongVaultManager manager = new SongVaultManager();

        manager.loadSongs("D:\\BridgeLabz-Training\\java-collections-practice\\scenario-based\\JavaCollectionScenarioBased\\src\\com\\resources\\samplefiles\\songvault");

        System.out.println("\nAll Songs (sorted):");
        manager.getAllSongsSorted().forEach(System.out::println);

        System.out.println("\nSongs by Genre:");
        Map<String, List<Song>> genreMap = manager.groupByGenre();
        genreMap.forEach((g, list) ->
                System.out.println(g + " -> " + list.size())
        );

        System.out.println("\nUnique Artists:");
        manager.getUniqueArtists().forEach(System.out::println);

        System.out.println("\nSongs longer than 5:00:");
        manager.getSongsLongerThanFive().forEach(System.out::println);
    }
}
