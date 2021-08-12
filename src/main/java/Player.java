public class Player {

    private final String name;
    private int score = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void winPoint() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
