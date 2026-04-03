package practice.ch05;

public class Main {
    public static void main(String[] args) {
        //Singleton s1 = new Singleton(); //컴파일 에러: singleton() has private access in Singleton
        Singleton s2 = Singleton.getInstance();
    }
}
