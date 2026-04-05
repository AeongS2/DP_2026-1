package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.HashMap;
import java.util.Map;


public class IDCardFactory extends Factory {
    private int serial = 100;   // 정수 기본 데이터 타입
    private Map<Integer, String> database = new HashMap<>();    // 정수 객체
    private String issuedDate;

    public IDCardFactory(String issuedDate){
        this.issuedDate = issuedDate;
    }

    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++, issuedDate);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard) product;   
        database.put(card.getSerial(), card.getOwner());    // serial을 키로, owner를 값으로 저장
        System.out.println(product + "을 등록했습니다.");
    }

    public Map<Integer, String> getDatabase() {
        return database;
    }

}