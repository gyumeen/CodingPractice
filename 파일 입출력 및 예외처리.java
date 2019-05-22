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

public class IOTest  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/자바 지운/data.txt"));

        br.close();
    }
}

