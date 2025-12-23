import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice randomly
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "Rock";
            case 1: return "Paper";
            default: return "Scissors";
        }
    }

    // Method to find winner
    public static String findWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) {
            return "Draw";
        }
        if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate stats and percentages
    public static String[][] calculateStats(String[] winners) {
        int userWins = 0, computerWins = 0, draws = 0;
        int totalGames = winners.length;

        for (String winner : winners) {
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;
        }

        double userPercentage = (userWins * 100.0) / totalGames;
        double computerPercentage = (computerWins * 100.0) / totalGames;
        double drawPercentage = (draws * 100.0) / totalGames;

        String[][] stats = new String[4][2];
        stats[0][0] = "Total Games"; stats[0][1] = String.valueOf(totalGames);
        stats[1][0] = "User Wins"; stats[1][1] = userWins + " (" + String.format("%.2f", userPercentage) + "%)";
        stats[2][0] = "Computer Wins"; stats[2][1] = computerWins + " (" + String.format("%.2f", computerPercentage) + "%)";
        stats[3][0] = "Draws"; stats[3][1] = draws + " (" + String.format("%.2f", drawPercentage) + "%)";
        return stats;
    }

    // Method to display results
    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats) {
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.println((i + 1) + "\t" + userChoices[i] + "\t" + computerChoices[i] + "\t\t" + winners[i]);
        }

        System.out.println("\nStatistics:");
        System.out.println("-------------------------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + " : " + stat[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] userChoices = new String[n];
        String[] computerChoices = new String[n];
        String[] winners = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = sc.nextLine().trim();
            String computerChoice = getComputerChoice();

            userChoices[i] = userChoice;
            computerChoices[i] = computerChoice;
            winners[i] = findWinner(userChoice, computerChoice);
        }

        String[][] stats = calculateStats(winners);
        displayResults(userChoices, computerChoices, winners, stats);

        sc.close();
    }
}
