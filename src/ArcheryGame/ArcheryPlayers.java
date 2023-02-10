package ArcheryGame;


public class ArcheryPlayers {
    private static int playerCount = 1;
    private final String name;
    private final int playerNumber;
    private final int[] scores = new int[3];
    private final int[] totalScore = new int[3];

    public ArcheryPlayers(String name) {
        this.name = name;
        playerNumber = playerCount;
        playerCount++;
    }

    public String getPlayerName() {
        return name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setScores(int score, int index) {
        this.scores[index] = score;
    }

    public int[] getTotalScore() {
        return this.totalScore;
    }

    public void setTotalScore(int score, int index) {

        this.totalScore[index] = score;
    }
}

