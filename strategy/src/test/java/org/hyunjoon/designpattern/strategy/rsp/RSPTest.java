package org.hyunjoon.designpattern.strategy.rsp;

import org.hyunjoon.designpattern.strategy.rsp.Hand;
import org.hyunjoon.designpattern.strategy.rsp.Player;
import org.hyunjoon.designpattern.strategy.rsp.ProbStrategy;
import org.hyunjoon.designpattern.strategy.rsp.RandomStrategy;
import org.hyunjoon.designpattern.strategy.rsp.Strategy;
import org.hyunjoon.designpattern.strategy.rsp.WinningStrategy;
import org.junit.Assert;
import org.junit.Test;

public class RSPTest {
    @Test
    public void handTest() {
        Hand rock = Hand.getHand(0);
        System.out.println(rock);
        Assert.assertEquals("Rock", rock.toString());
    }

    @Test
    public void diffStrategyTest() {
        System.out.println("Player 1 uses PropStrategy, Player 2 uses WinningStrategy");
        testTemplate(new ProbStrategy((int) System.currentTimeMillis()), new WinningStrategy(5 + (int) System.currentTimeMillis()));
    }

    @Test
    public void sameStrategyTest() {
        System.out.println("Both use PropStrategy");
        testTemplate(new ProbStrategy((int) System.currentTimeMillis()), new ProbStrategy(5 + (int) System.currentTimeMillis()));
    }

    @Test
    public void randomStrategyTest() {
        System.out.println("Player 1 uses PropStrategy, Player 2 uses RandomStrategy");
        testTemplate(new ProbStrategy((int) System.currentTimeMillis()), new RandomStrategy(5 + (int) System.currentTimeMillis()));
    }

    private void testTemplate(Strategy strategy1, Strategy strategy2) {
        Player player1 = new Player("Gon", strategy1);
        Player player2 = new Player("Mo", strategy2);

        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();

            if (nextHand1.isStrongerThan(nextHand2)) {
//                System.out.println("----Winner----");
//                System.out.println(player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
//                System.out.println("----Winner----");
//                System.out.println(player2);
                player1.lose();
                player2.win();
            } else {
//                System.out.println("----Draw----");
                player1.draw();
                player2.draw();
            }

            if ((i + 1) % 1000 == 0) {
                System.out.println("----CURRENT SCORE----");
                System.out.println(player1);
                System.out.println(player2);
            }
        }

        System.out.println("----TOTAL RESULT----");
        System.out.println(player1);
        System.out.println(player2);
    }
}
