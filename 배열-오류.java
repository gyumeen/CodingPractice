package ManagingProgram;

public class Managing {
    String[] manage = new String[3];
    manage [0]="름";
    manage [1]="음";
    manage [2]="앙"


    public static void main(String[] args) {
        Managing mg = new Managing();
        System.out.println(mg.manage[0]);
    }
}


//출력
/*
Error:(5, 13) java: ']' expected
Error:(6, 13) java: ']' expected
Error:(7, 13) java: ']' expected
*/


// 어째서 에러가 나는지 생각해 보자.
