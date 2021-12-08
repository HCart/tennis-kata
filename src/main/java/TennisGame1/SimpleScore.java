package TennisGame1;

public class SimpleScore {

    public static final String LOVE_ALL = "Love-All";
    public static final String FIFTEEN_ALL = "Fifteen-All";
    public static final String THIRTY_ALL = "Thirty-All";
    public static final String DEUCE = "Deuce";
    public static final String LOVE = "Love";
    public static final String FIFTEEN = "Fifteen";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ADVANTAGE_PLAYER_1 = "Advantage player1";
    public static final String ADVANTAGE_PLAYER_2 = "Advantage player2";
    public static final String WIN_FOR_PLAYER_1 = "Win for player1";
    public static final String WIN_FOR_PLAYER_2 = "Win for player2";
    private int serverScore;
    private int receiverScore;

    public void updateScore(int player1Score, int player2Score) {
        this.serverScore = player1Score;
        this.receiverScore = player2Score;
    }

    public String toString() {
        String score;
        if (serverScore == receiverScore) {
            score = getEquality();
        } else if (serverScore >= 4 || receiverScore >= 4) {
            score = getAvantage();
        } else {
            score = getScore(serverScore) + '-' + getScore(receiverScore);
        }
        return score;
    }

    private String getEquality() {
        String score;
        switch (serverScore) {
            case 0:
                score = LOVE_ALL;
                break;
            case 1:
                score = FIFTEEN_ALL;
                break;
            case 2:
                score = THIRTY_ALL;
                break;
            default:
                score = DEUCE;
                break;
        }

        return score;
    }

    private String getScore(int playerScore) {
        String score;
        switch (playerScore) {
            case 0:
                score = LOVE;
                break;
            case 1:
                score = FIFTEEN;
                break;
            case 2:
                score = THIRTY;
                break;
            case 3:
                score = FORTY;
                break;
            default:
                score = "";
                break;
        }
        return score;
    }

    private String getAvantage() {

        int minusResult = serverScore - receiverScore;
        String score;
        if (minusResult == 1) {
            score = ADVANTAGE_PLAYER_1;
        } else if (minusResult == -1) {
            score = ADVANTAGE_PLAYER_2;
        } else if (minusResult >= 2) {
            score = WIN_FOR_PLAYER_1;
        } else {
            score = WIN_FOR_PLAYER_2;
        }

        return score;
    }
}
