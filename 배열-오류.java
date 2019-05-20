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

/*
static을  String[] manage 앞에 붙혀 보았지만 이건 메모리 관리를 위한 기능이지
여기서는 이 문제 해결에는 아무 도움이 되지 못했다.
*/


package ManagingProgram;

public class Managing {

    public static void main(String[] args) {
        String[] manage = new String[3];
        manage [0]="름";
        manage [1]="음";
        manage [2]="앙";
        System.out.println(manage[0]);
    }
}

//출력
/*
름
*/

// 메인 메소드 안에 바로 배열을 인스턴스화해서(?) 만들어야 오류가 나지 않는 건가..
