public class SimpleScore {

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
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            default:
                score = "Deuce";
                break;
        }

        return score;
    }

    private String getScore(int playerScore) {
        String score;
        switch (playerScore) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
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
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }

        return score;
    }
}
