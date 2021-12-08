package TennisGame2;

public class ScoreUtils {

    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String FIFTEEN = "Fifteen";
    public static final String LOVE = "Love";
    public static final String DEUCE = "Deuce";

    public static String getNonEqualScore(Player playerOne, Player playerTwo) {

        if(playerOne.getPoints() < 4 && playerTwo.getPoints() < 4) {
            return getClassicScore(playerOne, playerTwo);
        }

        String score;
        if(playerOne.getPoints() > playerTwo.getPoints()) {
            score = getSpecificScore(playerOne, playerTwo);
        } else {
            score = getSpecificScore(playerTwo, playerOne);
        }
        return score;
    }

    private static String getClassicScore(Player playerOne, Player playerTwo) {
        return playerOne.getRes() + "-" + playerTwo.getRes();
    }

    private static String getSpecificScore(Player playerOne, Player playerTwo) {
        if((playerOne.getPoints() - playerTwo.getPoints()) < 2) {
            return "Advantage " + playerOne.getName();
        }

        return "Win for " + playerOne.getName();
    }

    public static String getEqualScore(Player player) {
        if(player.getPoints() >= 3) {
            return DEUCE;
        }

        return player.getRes() + "-All";
    }
}
