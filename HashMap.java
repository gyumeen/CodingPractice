package dalab1.javaD;

import java.util.HashMap;

public class LottoMain{ // 파일 내 클래스가 하나밖에 존재하지 않기 때문에 클래스명을 파일명과 같도록 입력해야 한다
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>(); //제네릭스는 스트링으로 명시해 놓음
        map.put("Ashal", "멘토"); // 자바에서 해시맵은 키와 밸류값을 통해 마치 사전에 단어 하나하나를 입력하는 기능을 보여준다
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
