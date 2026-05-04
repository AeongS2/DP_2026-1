package practice.ch12;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world.");    // 중심
        d1.show();

        Display d2 = new SideBorder(d1, '#');   // 장식자1
        d2.show();

        Display d3 = new SideBorder(d2, '*'); 
        d3.show();
    }
}
