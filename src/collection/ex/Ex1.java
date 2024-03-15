package collection.ex;

import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        String listAll = "지갑, 여권, 선글라스, 책, 삼각대, 충전기, 지도, 겨울옷";
        String[] split = listAll.split(",");
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(split));

        Collections.sort(list);
        System.out.println("list = " + list);

        Collections.reverse(list);
        System.out.println("순서 뒤집기 list = " + list);

        Collections.shuffle(list);
        System.out.println("섞은 list = " + list);

        int frequency = Collections.frequency(list, "책");
        System.out.println("책의 빈도 frequency = " + frequency);

        Collections.addAll(list, "휴대폰", "카메라");
        System.out.println("물품 추가 list = " + list);

        Collections.addAll(list, "책", "여권");
        System.out.println("중복 물품 추가 list = " + list);
        HashSet<String> hashSet = new HashSet<>(list);
        System.out.println("중복 물품 제거 hashSet = " + hashSet);

        String max = Collections.max(list);
        System.out.println("가장 중요한 물품 찾기 max(가나다순) = " + max);
    }
}
/*
연습 문제: 여행 가방 준비하기

요구사항
가방에 넣을 물품 리스트 생성: 여러분이 여행 가방에 넣고자 하는 물품들로 리스트를 생성하세요.
-물품 정렬 : 리스트에 있는 물품들을 알파벳 순으로 정렬하세요.
-물품 순서 뒤집기 : 한 번은 순서대로 정렬된 물품 리스트의 순서를 뒤집어 보세요.
-물품 셔플 : 준비한 물품 리스트의 순서를 무작위로 섞어 보세요.
-특정 물품의 빈도 수 계산 : 리스트 내에 특정 물품이 몇 개 있는지 계산하세요.
-물품 추가 : 여행 가방에 추가 물품을 넣으세요. 이미 리스트가 있다면, addAll 메소드를 사용하여 추가 물품 리스트를 기존 리스트에 합쳐 보세요.
-중복 물품 제거 : 여행 가방에서 중복된 물품을 제거한 새로운 리스트를 생성하세요. (힌트: Set 컬렉션 사용)
-가장 중요한 물품 찾기 : 여행에서 가장 중요한 물품(문자열에서 가장 앞서거나 뒤에 오는)을 찾아 보세요.

출력예시
===
원본 물품 리스트: [지갑, 여권, 선글라스, 책, 삼각대, 충전기, 지도, 겨울옷]
정렬 후 물품 리스트: [겨울옷, 선글라스, 여권, 지갑, 지도, 삼각대, 충전기, 책]
뒤집은 후 물품 리스트: [책, 충전기, 삼각대, 지도, 지갑, 여권, 선글라스, 겨울옷]
셔플 후 물품 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권]
'여권'의 빈도 수: 1
추가 물품 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라]
중복 제거 후 리스트: [삼각대, 책, 충전기, 지도, 겨울옷, 선글라스, 지갑, 여권, 휴대폰, 카메라]
가장 중요한 물품(최소값): 겨울옷
 */