package hw.ch10;


public class Main {
    public static void main(String[] args) {
        System.out.println("20241369 이정민");

        System.out.println("===== RandomStrategy =====");
        Player player1 = new Player("Taro", new RandomStrategy(0));

        System.out.println("===== CyclicStrategy =====");
        Player player2 = new Player("Bob", new CyclicStrategy());

        // CyclicStrategy 테스트 : 순환 확인
        System.out.println("CyclicStrategy의 손가락 순환 : ");
        Strategy cyclic = new CyclicStrategy();
        for (int i = 0; i < 9; i++){
            Hand hand = cyclic.nextHand();
            System.out.println((i+1) + "번째: " + hand);

            cyclic.study(false);
        }

        for ( int i = 0; i < 10; i++ ) {
            // 플레이어 2명에서 각각 손을 얻음
            Hand h1 = player1.nextHand();
            Hand h2 = player2.nextHand();

            // 손을 대결시킴
            if ( h1.isStrongerThan(h2) ) {
                System.out.println("Winner: " + player1);
                player1.win();
                player2.lose();
            }else if ( h1.isWeakerThan(h2) ) {
                System.out.println("Winner: " + player2);
                player1.lose();
                player2.win();
            }else{
                System.out.println("Even");
                player1.even();
                player2.even();
            }

        }

        System.out.println("Total result: ");
        System.out.println(player1.toString());
        System.out.println(player2);


    }
}
