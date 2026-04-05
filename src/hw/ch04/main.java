package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;

public class main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory("2026-03-20");
        Product card1 = factory.create("Kim Youngjin");
        Product card2 = factory.create("Son Heungmin");
        card1.use();
        card2.use();

        String owner = ((IDCardFactory) factory).getDatabase().get(100);
        System.out.println("100번 카드는 " + owner + "의 카드입니다.");
    }
}
