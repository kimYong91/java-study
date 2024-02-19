package class0.ex;

import java.util.Scanner;

public class Animal {
    //동물의 종류, 이름, 나이를 데이터로 가지고 동물의 정보를 출력하는 메서드를 가짐
    Scanner scanner = new Scanner(System.in);
    void animalKind () {
        System.out.print("동물의 종류 : ");
        String kind = scanner.next();
    }

    void animalName () {
        System.out.println("동물의 이름");
        String name = scanner.next();
    }

    int animalAge () {
        System.out.println("동물의 나이");
        int age = scanner.nextInt();
        return age;
    }

    void showInformation () {
        System.out.println();
    }



}
