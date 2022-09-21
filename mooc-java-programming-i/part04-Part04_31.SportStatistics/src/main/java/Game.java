/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johndo
 */
public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homeScore;
    private int awayScore;
    
    public Game(String homeTeam, String awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    
    public String getHomeTeam() {
        return this.homeTeam;
    }
    
    public String getAwayTeam() {
        return this.awayTeam;
    }
//    
//    public boolean hasPlayed(String team) {
//        return (this.homeTeam.equals(team) || this.awayTeam.equals(team));
//    }
    
    public boolean hasWon(String team) {
        return (this.homeTeam.equals(team) && this.homeScore > this.awayScore) ||
               (this.awayTeam.equals(team) && this.awayScore > this.homeScore);
    }
}
