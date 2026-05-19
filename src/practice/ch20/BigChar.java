package practice.ch20;

import java.io.IOException;
import java.nio.file.Files; // 파일과 관련된 클래스
import java.nio.file.Path;  // 경로 관리

// 파일에서 큰 문자 데이터를 읽어들임
public class BigChar {
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata;

    // 생성자 
    public BigChar(char charname) { // '3'
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt";

            StringBuilder sb = new StringBuilder(); // StringBuilder : 문자열을 더할 때 사용하는 클래스

            for (String line: Files.readAllLines(Path.of(filename))) {     //각 줄을 읽어서 리스트가 만들어짐
                sb.append(line);    //한줄씩추가
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}
