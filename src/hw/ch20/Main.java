package hw.ch20;

public class Main {

    static final String RED = "\u001B[31m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String BLUE = "\u001B[34m";
    static final String MAGENTA = "\u001B[35m";
    static final String CYAN = "\u001B[36m";
    static final String RESET = "\u001B[0m";

    public static void main(String[] args) {

        System.out.println("20241369 이정민");

        String text = args[0];

        String[] colors = {
            RED,
            BLUE,
            GREEN,
            MAGENTA,
            CYAN,
            YELLOW,
            BLUE
        };

        BigString bigString = new BigString(text);
        bigString.print(colors);


        // BigChar char1 = new BigChar('1');
        // char1.print();

        // BigChar char2 = new BigChar('1');
        // char2.print();

        // //BigCharFactory를 이용
        // BigCharFactory factory = BigCharFactory.getInstance();

        // BigChar char3 = factory.getBigChar('1');
        // char3.print();

        // BigChar char4 = factory.getBigChar('1');
        // char4.print();

        // if(char3 == char4){
        //     System.out.println("char3과 char4는 같은 BigChar 인스턴스입니다.");
        // } else {
        //     System.out.println("char3과 char4는 다른 BigChar 인스턴스입니다.");
        // }

        // //BigString을 이용
        // BigString bigString = new BigString("1212123");
        // bigString.print();
    }
}
