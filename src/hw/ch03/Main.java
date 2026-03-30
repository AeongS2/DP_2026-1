package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //CharDisplay d1 = new CharDisplay('H');  //'H'(char), "H"(String)
        AbstractDisplay d1 = new CharDisplay('H');  //부모 클래스 타입의 참조 변수로 자식 클래스의 인스턴스를 가리킴
        d1.display();
        d1.open();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");    //부모 타입으로 만들면 더 좋다
        d2.display();

        //AbstractDisplay d3 = new AbstractDusplay();
    }
}
