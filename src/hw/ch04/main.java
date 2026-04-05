package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class main {
    public static void main(String[] args) {
        System.out.println("20241369 이정민");

        System.out.println("[3-1]");
        Factory factory1 = new IDCardFactory("2026-04-05");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        
        System.out.println("[3-2]");
        Factory factory2 = new LicenseCardFactory("2026-04-05");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();

    }
}
