package hw.ch03;

public class NumberDisplay extends AbstractDisplay {
    private int num;

    // 생성자 
    public NumberDisplay(int num, int repeatCount) {
        super(repeatCount);
        this.num = num;
    }

    @Override
    public void open() {
        System.out.println("<<Number>>");
    }

    @Override
    public void print() {
        System.out.println(num);
    }

    @Override
    public void close() {
        System.out.println("<<Number>>");
    }
}
