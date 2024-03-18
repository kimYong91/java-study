package collection;

import java.util.*;

public class CollectionUtil {
    public static void main(String[] args) {
        // Collections 클래스 : 다양한 컬렉션을 다루기 위해 제공하는 메서드들의 모음
        List<Integer> numberList = new ArrayList<>();
        numberList.addAll(
                Arrays.asList(3,1,2,4,5,1,9,2,6,5)
        );
        System.out.println("numberList = " + numberList);

        Collections.sort(numberList);
        System.out.println("정렬된 numberList = " + numberList);

//        Collections.sort(numberList, 비교자); // 정렬기준을 다르게 적용 가능
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     // 내림차순으로 정렬 (o1 - o2 오름차순)
            }
        });
        System.out.println("내림차순 numberList = " + numberList);

        // binarySearch : 이진 검색 알고리즘을 사용해서 정렬된 리스트를 검색  * 미리 정렬이 되어있어야 한다
        Collections.sort(numberList);
        System.out.println("numberList = " + numberList);
        int index = Collections.binarySearch(numberList, 4);
        System.out.println("4의 index = " + index);

        // reverse(List) : 리스트 요소를 역순으로 뒤집는다
        Collections.reverse(numberList);
        System.out.println("역순 numberList = " + numberList);

        // shuffle(List)
        Collections.shuffle(numberList);
        System.out.println("섞은 numberList = " + numberList);

        // fill(List) : 리스트의 모든 요소를 지정된 값으로 대체
        Collections.fill(numberList, 0);
        System.out.println("모든 숫자를 0으로 바꾼 numberList = " + numberList);

        // copy(카피List, 원본List) : 리스트의 내용을 다른 리스트로 복사
        // 카피List 의 크기(size)가 원본List(size)보다 같거나 커야 복사 가능
        List<Integer> copyNumberList = new ArrayList<>();
        copyNumberList.addAll(
                Arrays.asList(1,1,1,1,1,1,1,1,1,1,11,1)
        );
        Collections.copy(copyNumberList, numberList);
        System.out.println("copyNumberList = " + copyNumberList);

        // max, min : 최대값, 최소값 찾기
        numberList = Arrays.asList(2,6,3,3,6,8,2,1,9,4);
        Integer max = Collections.max(numberList);
        Integer min = Collections.min(numberList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        // rotate(List, 거리(정수)) : 지정된 거리만큼 회전시킵니다.
        System.out.println("회전 전 기본 numberList = " + numberList);
        Collections.rotate(numberList, 3);
        System.out.println("3만큼 회전된 numberList = " + numberList);

        // replaceAll(List, 이전값, 새값)
        Collections.replaceAll(numberList, 3, 30);
        System.out.println("3이 30으로 바뀐 numberList = " + numberList);

        // swap(List, 인덱스, 인덱스)
        Collections.swap(numberList, 1, 5);
        System.out.println("인덱스1과 5가 자리 바뀐 numberList = " + numberList);

        // frequency(Collection, 객체) : 객체의 빈도수를 반환
        int frequency = Collections.frequency(numberList, 30);
        System.out.println("30의 빈도 (frequency) = " + frequency);

        // disjoint(Collection, Collection) : 공통요소가 없으면 true 를 반환
        boolean disjoint = Collections.disjoint(numberList, Arrays.asList(40, 50, 60));
        System.out.println("공통요소가 없는지 여부 disjoint = " + disjoint);
    }
}
