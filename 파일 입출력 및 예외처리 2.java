package JavaReport;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
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

public class IOTest {
    public static void main(String[] args) throws IOException {

        String readFilePath = "C:/자바 지운/data.txt";  //읽어올 파일 경로
        String writeFilePath = "C:/자바 지운/output.txt"; //작성할 파일경로
        String strLine = "";
        Scanner in = null;
        PrintWriter out = null;

        // "data.txt"에 access해서 read하기 위한 객체 생성
        try {
            in = new Scanner(new File(readFilePath));

            out = new PrintWriter(writeFilePath); //그냥 간단하게 작성, 버퍼 쓰실분은 쓰시면 됩니다.

            while (in.hasNext()) {
                strLine = in.nextLine();
                //뭔가 작업을 한다.(예를 들면 복호화)
                out.println(strLine);
            }

            out.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } finally {

            if (out != null) {
                out.close();
            }

            // "output.text"에 access해서 write하기 위한 객체 생성


            // Student array 선언 (array size: 10)


        /* "data.txt"로부터 한 라인씩 읽고 student array에 차례대로 객체를 생성 후,
           객체 정보를 "output.txt"에 쓰고 화면에도 출력하는 코드*/


        }
    }
}

