package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayUtil {
    public static void main(String[] args) {
        // Arrays 배열을 다루기 위한 메서드를 제공하는 유틸리티 클래스
        int[] number = {9,4,6,2,3,5,1,7};

        // Arrays.toString() : 배열을 문자열로 변환
        System.out.println("number = " + Arrays.toString(number));

        // Arrays.sort() : 배열을 정렬
        Arrays.sort(number);
        System.out.println("정렬된 number = " + Arrays.toString(number));

        // Arrays.binarySearch() : 이진 탐색으로 요소의 index 찾기  * 이진 탐색을 하기위해선 먼저 정렬이 되어있어야 한다.
        int index = Arrays.binarySearch(number, 1);
        System.out.println("숫자 1의 index = " + index);

        // Arrays.fill(배열, 값) : 배열을 특정값으로 채움
        Arrays.fill(number, 10);
        System.out.println("10으로 채워진 number = " + Arrays.toString(number));


        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,4};
        boolean equals = Arrays.equals(arr1, arr2);
        System.out.println("배열이 같은지 여부 equals = " + equals);

        // Arrays.deepEquals() : 다차원 배열 비교
        String[][] data1 = {{"a", "b"}, {"c", "d"}};
        String[][] data2 = {{"a", "b"}, {"c", "d"}};
        boolean isEquals = Arrays.deepEquals(data1, data2);
        System.out.println("다차원 배열이 같은지 여부 isEquals = " + isEquals);

        // Arrays.copyOf(원본 배열, 복사할 배열 길이) : 배열 복사본을 생성
        int[] originArr = {1,2,3,4,5};
        int[] copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        // Arrays.compare() : 배열의 요소 비교
        // 비교 규칙: 길이가 크면 큰것
        // 길이가 같으면, 배열의 요소 하나씩 비교해서 인덱스 0부터 치례로 비교하여 큰 요소가 큰것으로 간주 한다.
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {1,3,2};
        int compared = Arrays.compare(originArr, copyArr);
        System.out.println("compared = " + compared);
        System.out.println(Arrays.compare(array1, array2)); // 같으면 0
        System.out.println(Arrays.compare(array1, array3)); // 음수 ; array1 < array3
        System.out.println(Arrays.compare(array3, array1)); // 양수 ; array1 > array3

        // Arrays.copyOfRange(원본, 시작 인덱스, 끝 인덱스); : 부분적으로 배열의 일부를 복사
        int[] copyOfRange = Arrays.copyOfRange(originArr, 1, 3);
        System.out.println("배열의 부분 복사 = " + Arrays.toString(copyOfRange));

        // Arrays.asList(요소,요소.....) : 배열을 고정크기의 리스트로 변환
        String[] strArr = {"a", "b", "c"};
        List<String> list = Arrays.asList(strArr);
        // ArrayList<String> list = Arrays.asList(strArr);  ArrayList 와 다름
        // ArrayList 생성자의 매개변수로 사용될 수 있음.
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        arrayList.addAll(Arrays.asList("b","e","f"));

        // 배열을 소스로 하는 Stream 을 생성 => 스트림 API 사용 가능
        Stream<String> stream = Arrays.stream(strArr);
        stream.forEach(System.out::println);


    }
}
