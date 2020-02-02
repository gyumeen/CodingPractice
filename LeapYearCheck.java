// GregorianCalendar 클래스에 있는 isLeapYear 메소드를 활용
import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner scannedLeapYearNumber = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            int verifyingLeapYearNumber = scannedLeapYearNumber.nextInt();
            GregorianCalendar gregorianCalendar_1 = new GregorianCalendar();

            if(gregorianCalendar_1.isLeapYear(verifyingLeapYearNumber)){
                System.out.println(verifyingLeapYearNumber +" = "+ "윤년");
            } else System.out.println(verifyingLeapYearNumber +" = "+ "평년");

            /*
            GregorianCalendar 패키지 미사용
            
            if(verifyingLeapYearNumber % 4 == 0 && verifyingLeapYearNumber % 100 != 0 || verifyingLeapYearNumber % 400 == 0) {
                System.out.println(verifyingLeapYearNumber +" = "+ "윤년");
            } else System.out.println(verifyingLeapYearNumber +" = "+ "평년");
            */
        }

    }
}
