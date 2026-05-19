package hw.ch16;

import java.awt.Color;
import java.awt.Label;

public class ColleagueLabel extends Label implements Colleague{
    private Mediator mediator;

    public ColleagueLabel(String text){
        super(text);
    }

    @Override
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled){
        setEnabled(enabled);
        
        setText(enabled ? "● 로그인 가능" : "● 로그인 불가능");
        setForeground(enabled ? Color.blue : Color.gray);
        
    }
}
