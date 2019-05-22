package JavaReport;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.FileNotFoundException;
import java.io.IOException;

 class Student {
    // <필드> 멤버변수
    private int iID;    // 학번
    private String strName; //이름
    private int IScore; //점수

    //  <메소드> - 1. 생성자
    public Student(int iID, String strName, int IScore) {
        this.iID = iID;
        this.strName = strName;
        this.IScore = IScore;
    }

    // - 2.1 getter(accessor)
    public int getID() {
        return iID;
    }
    public String getName() {
        return strName;
    }
    public  int getScore() {
        return IScore;
    }

    // - 2.2 setter(mutator)
    public void setID(int iID) {
        this.iID = iID;
    }
    public void setName(String strName) {
        this.strName = strName;
    }
    public void setScore(int IScore) {
        this.IScore = IScore;
    }
}

//파일에 문자를 쓰기 위해 파일과 연결된 PrintStream 클래스 생성
class PrintStream {
     // print()계열 메소드 사용
}

//예외처리를 위한 성적 예외 클래스
class ScoreException {

}

public class IOTest  {
    public static void main(String[] args) throws IOException {
        // "data.txt"에 access해서 read하기 위한 객체 생성
        BufferedReader br = new BufferedReader(new FileReader("C:/자바 지운/data.txt"));

        br.close();

        // "output.text"에 access해서 write하기 위한 객체 생성


        // Student array 선언 (array size: 10)


        /* "data.txt"로부터 한 라인씩 읽고 student array에 차례대로 객체를 생성 후,
           객체 정보를 "output.txt"에 쓰고 화면에도 출력하는 코드*/


    }
}

