package practice.ch04;

import practice.ch04.idcard.IDCard;
import practice.ch04.idcard.IDCardFactory;
import practice.ch04.framework.Product;

public class main {
    public static void main(String[] args) {
        //(1) IDCard를 직접 생성
        // IDCard c1 = new IDCard("이정민");
        // c1.use();

        //(2) 공장을 통해서 IDCard 생성
        IDCardFactory factory = new IDCardFactory();
        Product c2 = factory.create("이정민");
        c2.use();
    }
}
