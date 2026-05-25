package hw.ch17;

public class RangeObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("RangeObserver: ");
        int num = generator.getNumber();
        String str = "";
        
        if (num >= 0 && num < 10) {
            str = "Low";
        }else if(num >= 10 && num < 20){
            str = "Mid";
        }else if( num >= 20 ){
            str = "High";
        }

        System.out.print("["+str+"] ");
        System.out.println(generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
