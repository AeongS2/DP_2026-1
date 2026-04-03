package practice.ch05.ex;

public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slow();
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) { // 처음 호출되는지 검사
            instance = new Singleton();
        }

        return instance;
    }

    private void slow() {
        try {
            Thread.sleep(1000); // CPU를 내놓고 1초 쉼
        } catch (InterruptedException e) {

        }
    }
}
