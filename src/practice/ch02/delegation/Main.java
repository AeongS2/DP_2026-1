package practice.ch02.delegation;

public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak();
        ((PrintBannerAdapter02)print).printStrong();    //형변환(타입캐스팅) - 부모타입에서 자식타입으로 변환
        //괄호 안치면 .이 우선순위 높아서 먼저 적용됨
    }
}
