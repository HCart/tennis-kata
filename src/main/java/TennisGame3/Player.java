package TennisGame3;

public class Player {

    private final String name;
    private int points = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void score() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
