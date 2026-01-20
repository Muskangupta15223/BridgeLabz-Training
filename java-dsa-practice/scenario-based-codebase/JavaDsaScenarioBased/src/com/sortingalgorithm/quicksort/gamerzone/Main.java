package com.sortingalgorithm.quicksort.gamerzone;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Player> leaderboard = new ArrayList<>();
        
        leaderboard.add(new Player("Alex", 450));
        leaderboard.add(new Player("Brian", 1200));
        leaderboard.add(new Player("Chris", 800));
        leaderboard.add(new Player("David", 1500));
        leaderboard.add(new Player("Eva", 600));

        GamerZone sorter = new GamerZone();
        sorter.quickSort(leaderboard, 0, leaderboard.size() - 1);

        System.out.println("🏆 GamerZone Leaderboard:");
        for (Player p : leaderboard) {
            System.out.println(p);
        }
    }
}
