package quiz.quiz5;


import java.util.*;
import java.util.stream.Collectors;

public class Quiz4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String listAll = "지갑, 여권, 선글라스, 책, 삼각대, 충전기, 지도, 겨울옷";
        String[] split = listAll.split(",");
        list.addAll(Arrays.asList(split));
        System.out.println("원본 물품 리스트: " + list);
        Collections.sort(list);
        System.out.println("정렬 후 물품 리스트: " + list);
        Collections.reverse(list);
        System.out.println("뒤집은 후 물품 리스트: " + list);
        Collections.shuffle(list);
        System.out.println("셔플 후 물품 리스트: " + list);
        Collections.addAll(list, "휴대폰, 카메라, 책");
        System.out.println("추가 물품 후 리스트: " + list);
        int frequency = Collections.frequency(list, "책");
        System.out.println("'책'의 빈도 수: " + frequency);
        HashSet<String> removeList = new HashSet<>(list);
        System.out.println("중복 제거 후 리스트: " + removeList);


    }

}
