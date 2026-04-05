package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import java.util.HashMap;
import java.util.Map;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    String baseDate;
    String expiryDate;

    public LicenseCardFactory(String baseDate){
        this.baseDate = baseDate;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(baseDate, formatter);
        LocalDate result = date.plusYears(5);
        expiryDate = result.format(formatter);
        
    }

    protected synchronized Product createProduct(String holder) {
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        // LicenseCard card = (LicenseCard) product;   
        // database.put(card.getLicenseNumber(), card.getHolder());
        System.out.println(product + "을 등록했습니다.");
    }

    // public Map<Integer, String> getDatabase() {
    //     return database;
    // }
}
