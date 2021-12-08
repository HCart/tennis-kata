package TennisGame2;

import common.TennisGame;

import static TennisGame2.ScoreUtils.getEqualScore;
import static TennisGame2.ScoreUtils.getNonEqualScore;

public class TennisGame2 implements TennisGame {
    private final Player playerOne;
    private final Player playerTwo;

    public TennisGame2(String playerOneName, String playerTwoName) {
        this.playerOne = new Player(playerOneName);
        this.playerTwo = new Player(playerTwoName);
    }

    public String getScore() {
        if(playerOne.getPoints() == playerTwo.getPoints()) {
            return getEqualScore(playerOne);
        } else {
            return getNonEqualScore(playerOne, playerTwo);
        }
    }

    public void wonPoint(String player) {
        if(player.equals(playerOne.getName())) {
            playerOne.score();
        } else {
            playerTwo.score();
        }
    }
}