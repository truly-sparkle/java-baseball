package baseball;

public class GameResults {

    private int strike;
    private int ball;
    private int nothing;

    public GameResults() {
        this.strike = 0;
        this.ball = 0;
        this.nothing = 0;
    }

    public void increaseStrike() {
        strike++;
    }


    private String getStrikeResults() {
        if (strike > 0) {
            return String.format("%d 스트라이크", strike);
        }
        return "";
    }

    public int getStrike() {
        return strike;
    }

    public void increaseBall() {
        ball++;
    }

    private String getBallResults() {
        if (ball > 0) {
            return String.format("%d 스트라이크", ball);
        }
        return "";
    }

    public int getBall() {
        return ball;
    }

    public void finish() {
        nothing = 3 - strike - ball;
    }

    public int getNothing() {
        return nothing;
    }
}
