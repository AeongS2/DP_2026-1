package hw.ch10;

import java.util.Random;

public class WinningStrategy implements Strategy {
    private Random random = null;
    private boolean won = false;    // 이전 게임에서 이겼는지 여부
    private Hand prevHand;  // 이전에 낸 손

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) { // 이전에 졌으면
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
