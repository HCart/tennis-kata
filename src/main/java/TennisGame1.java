import java.util.ArrayList;
import java.util.List;

public class TennisGame1 implements TennisGame {
    private final List<Player> players = new ArrayList<>(2);
    private final SimpleScore gameScore;

    public TennisGame1(String player1Name, String player2Name) {
        players.add(new Player(player1Name));
        players.add(new Player(player2Name));
        gameScore = new SimpleScore();
    }

    public void wonPoint(String playerName) {
        players.stream()
                .filter(player -> playerName.equals(player.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Player exception"))
                .winPoint();
    }

    public String getScore() {
        gameScore.updateScore(players.get(0).getScore(), players.get(1).getScore());
        return gameScore.toString();
    }
}
