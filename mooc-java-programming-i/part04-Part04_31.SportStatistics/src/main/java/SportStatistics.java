
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Game> games = readRecordsFromFile(file);
        
        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;
        
        for (Game game: games) {
            if (game.getHomeTeam().equals(team) || game.getAwayTeam().equals(team) ) {
                gamesPlayed++;
                if (game.hasWon(team)) {
                    wins++;
                } else {
                    losses++;
                }
                
            }
        }
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        
        
        
    }
    
    // Notice how this doesn't use any class variables.
    // So can call it static 
    public static ArrayList<Game> readRecordsFromFile(String file) {
        
        ArrayList<Game> games = new ArrayList<>();
        
        try(Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam, awayTeam, homeScore, awayScore));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return games;
    }
}
