package TennisGame3;

import common.TennisGame;

public class TennisGame3 implements TennisGame {
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ALL = "-All";
    public static final String SEPARATOR = "-";
    public static final String DEUCE = "Deuce";
    private final Player playerOne;
    private final Player playerTwo;

    public TennisGame3(String playerOneName, String playerTwoName) {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
    }

    public String getScore() {

        if(playerOne.getPoints() < 4 && playerTwo.getPoints() < 4 && playerOne.getPoints() + playerTwo.getPoints() != 6) {
            //Classic score
            String[] points = new String[]{LOVE, FIFTEEN, THIRTY, FORTY};
            String pointName = points[playerOne.getPoints()];
            return (playerOne.getPoints() == playerTwo.getPoints()) ? pointName + ALL : pointName + SEPARATOR + points[playerTwo.getPoints()];
        } else {
            //Specific score
            if(playerOne.getPoints() == playerTwo.getPoints()) {
                return DEUCE;
            }
            String leadingPlayer = playerOne.getPoints() > playerTwo.getPoints() ? playerOne.getName() : playerTwo.getName();
            return ((playerOne.getPoints() - playerTwo.getPoints()) * (playerOne.getPoints() - playerTwo.getPoints()) == 1) ? "Advantage " + leadingPlayer : "Win for " + leadingPlayer;
        }
    }

    public void wonPoint(String playerName) {
        if(playerName.equals(playerOne.getName())) {
            this.playerOne.score();
        } else {
            this.playerTwo.score();
        }
    }
}
