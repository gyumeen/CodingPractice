package dalab1.javaD;

import java.util.HashMap;

public class LottoMain{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Ashal", "멘토");
        map.put("별옥돌", "멘티");

        System.out.println(map.get("Ashal"));
        System.out.println(map.containsKey("Ashal"));
        System.out.println(map.size());
        System.out.println(map.remove("Ashal"));
    }

}

// 출력 
/*
멘토
true
2
멘토
*/
