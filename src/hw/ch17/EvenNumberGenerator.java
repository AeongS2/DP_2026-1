package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator{
    private int start;
    private int end;
    private int num;

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getNumber(){
        return num;
    }

    @Override
    public void execute(){
        for (num = start; num < end; num += 2){
            notifyObservers();
        }
    }
}
