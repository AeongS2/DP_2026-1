package practice.ch12;

// 장식자를 대표하는 클래스
public abstract class Border extends Display {
    protected Display display;             // 장식 대상(내용물)
    //Display 부모 타입 -> 이 밑에 있는건 모두 장식할 수 있다.

    protected Border(Display display) { // 인스턴스 생성 시 '내용물'을 인수로 지정
        this.display = display;
    }
}
