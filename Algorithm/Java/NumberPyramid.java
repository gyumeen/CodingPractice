// 숫자로 피라미드 모양 만들기 문제
import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        
        System.out.println("Input the number which you want to make a pyramid");
        
        Scanner scannedPyramidNumber = new Scanner(System.in);
        int inputtedPyramidNumber = scannedPyramidNumber.nextInt();
        
        for(int i = 1; i < inputtedPyramidNumber + 1; i++) {
            for(int j = 1; j < i + 1; j++) {
                if(j > i) break;
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
