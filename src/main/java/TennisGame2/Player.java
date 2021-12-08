package TennisGame2;

import static TennisGame2.ScoreUtils.*;

public class Player {

    private final String name;
    private int points = 0;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getRes(){
        String res = LOVE;
        if(points == 1) {
            res = FIFTEEN;
        }
        if(points == 2) {
            res = THIRTY;
        }
        if(points == 3) {
            res = FORTY;
        }

        return res;
    }

    public void score() {
        points++;
    }

    public int getPoints() {
        return points;
    }
}
