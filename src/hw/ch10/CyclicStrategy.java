package hw.ch10;

public class CyclicStrategy implements Strategy {
    private int currentHand = 0; // 현재 낸 손

    @Override
    public Hand nextHand() {
        Hand hand = Hand.getHand(currentHand);
        currentHand = (currentHand + 1) % 3; // 다음 손으로 이동
        return hand;
    }

    @Override
    public void study(boolean win) {
        // CyclicStrategy는 학습하지 않음
    }
}
