package hw.ch02;

public class KoreanOutletAdapter extends KoreanOutlet implements Charger {
    @Override
    public int charge() {
        //한국 콘센트에서 220V AC를 제공받아 스마트폰에 맞게 변환하여 반환
        int voltage = provide(); // 한국 콘센트에서 전압을 제공받음
        System.out.println("KoreanOutletAdapter가 " + voltage + "V를 스마트폰에 맞게 변환합니다.");
        return voltage; // 실제로는 변환 로직이 필요할 수 있음
    }
    
}
