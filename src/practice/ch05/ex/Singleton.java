package practice.ch05.ex;

// 다른 방법의 싱글턴 패턴
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("인스턴스가 생성되었습니다.");
        slow(); // 인스턴스가 생성될 때 시간을 지연시킴
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
