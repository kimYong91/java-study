package stream.ex;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");
//        for (String catName : catNames) {
//            if (catName.length() >= 4) {
//                System.out.println(catName.substring(0,1).toUpperCase()+catName.substring(1).toLowerCase());
//            }
//        }

//        catNames.stream()
//                .filter(name -> name.length() >= 4)
//                .map(name -> name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase())
//                .forEach(System.out::println);

        List<String> newCatNames = catNames.stream()
                // 이름이 4글자 이상인 고양이들만 필터링하여
                .filter(catName -> catName.length() > 3)
                // 그 이름을 대문자로 변환한 후, 결과를 출력하세요.
                .map(String::toUpperCase)
                .toList();

        newCatNames.forEach(System.out::println);        // 이렇게 하면 newCatNames 이걸 다른곳에도 쓸수가 있다
    }
}
/*
    문제 1: 고양이 이름 필터링

    고양이 이름이 담긴 리스트가 있습니다.
    이름이 4글자 이상인 고양이들만 필터링하여
    그 이름을 대문자로 변환한 후, 결과를 출력하세요.

    List<String> catNames = Arrays.asList("Leo", "Milo", "Luna", "Oli", "Zoe", "Bella");

    출력 결과:
    MILO
    LUNA
    BELLA

     */