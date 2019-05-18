package dalab1.javaD;

import java.util.ArrayList;

public class LottoMain{
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("이규민");
        alist.add("이지운");
        alist.add("IT");

        System.out.println(alist.get(2));
        System.out.println(alist.contains("이규민"));
        System.out.println(alist.size());
        System.out.println(alist.remove(0));
        System.out.println(alist.remove("이지운"));
    }

}


//출력
/*
IT
true
3
이규민
true
*/
