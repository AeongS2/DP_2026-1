package hw.ch12;

public class Main {
    public static void main(String[] args) {
        System.out.println("20241369 이정민");

        MultiStringDisplay md = new MultiStringDisplay();

        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful");

        Display d1 = new NumberedBorder(md);
        d1.show();

        Display d2 = new FullBorder(new NumberedBorder(md));
        d2.show();

        Display d3 = new SideBorder(new NumberedBorder(new FullBorder(md)), '*');
        d3.show();
    }
}
