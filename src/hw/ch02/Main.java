package hw.ch02;

public class Main {
    public static void main(String[] args) {
        //한국 콘센트 어댑터 생성
        Charger koreanAdapter = new KoreanOutletAdapter();

        //스마트폰 생성 및 충전
        Smartphone smartphone = new Smartphone(koreanAdapter);
        smartphone.charge();  
    }
}
