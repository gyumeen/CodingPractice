package dalab1.javaD;

import java.util.HashMap;

public class LottoMain{ // 파일 내 클래스가 하나밖에 존재하지 않기 때문에 클래스명을 파일명과 같도록 입력해야 한다
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
