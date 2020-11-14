package org.hyunjoon.designpattern.strategy.rsp;

public class Player {
    private String name;
    private Strategy strategy;
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand() {
        return strategy.nextHand();
    }

    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    public void draw() {
        gameCount++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Player: ");
        sb.append(name).append("\n");
        sb.append(gameCount).append(" games  ");
        sb.append(winCount).append(" win  ");
        sb.append(loseCount).append(" lose");

        return sb.toString();
    }

}
