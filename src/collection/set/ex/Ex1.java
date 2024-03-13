package collection.set.ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
//        Set<String> names = new HashSet<>();
//        names.add("김철수");
//        names.add("이영희");
//        names.add("박지영");
//        names.add("김철수");
//        names.add("박지영");
//        names.add("박민수");
//        names.add("이영희");
//        for (String name : names) {
//            System.out.println(name);
//        }


        Set<String> names1 = new HashSet<>();
        names1.add("김철수");
        names1.add("이영희");
        names1.add("박지영");
        Set<String> names2 = new HashSet<>();
        names2.add("김철수");
        names2.add("박지영");
        names2.add("박민수");
        names2.add("이영희");

        Set<String> only = new HashSet<>(names1);
        only.addAll(names2);
        System.out.println(only);


    }
}
/*
    고유한 이름 목록 만들기

    다음과 같은 학생들의 이름 목록이 주어졌을 때, Set을 사용하여 중복 없이 유일한 이름만 추출하여 리스트업하는 프로그램을 작성하세요.

    입력:
    김철수
    이영희
    박지영
    김철수
    박지영
    박민수
    이영희

    출력:
    김철수
    이영희
    박지영
    박민수
     */