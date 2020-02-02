import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        
        System.out.println("Input the number which you want to make a pyramid");
        
        Scanner scannedNumber = new Scanner(System.in);
        int inputtedNumber = scannedNumber.nextInt();
        
        for(int i = 1; i < inputtedNumber + 1; i++) {
            for(int j = 1; j < i + 1; j++) {
                if(j > i){break;}
                System.out.print(j * i + " ");
            }
            System.out.println();
        }

    }
}
