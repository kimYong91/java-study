# Markdown
- 과제 : 나 자신을 소개하는 글을 마크다운 형식으로 작성
- Emoji : 활용해보기
*****************
  Kim Yong introduction
  =

### job
1. job seeker
3. artist
2. student
### age
###### 34

## email
* rladyd97@naver.com
* rladyd97@google.com

### Home image
>![아파트 이미지](https://ic.zigbang.com/vp/BigData/4928/93548e07beb069e06b23137ce853e5567d71d108.jpg?w=500&h=375&q=60&a=1)
>>[![아파트 이미지와 정보](https://ic.zigbang.com/vp/BigData/4928/93548e07beb069e06b23137ce853e5567d71d108.jpg?w=500&h=375&q=60&a=1)](https://dorojuso.kr/2650010400110460007008928/%EB%B6%80%EC%82%B0%EA%B4%91%EC%97%AD%EC%8B%9C-%EC%88%98%EC%98%81%EA%B5%AC-%EA%B4%91%EC%84%9C%EB%A1%9C-54-%EA%B4%91%EC%95%88%EB%8F%99-%EC%83%81%EC%95%84%EC%95%84%ED%8C%8C%ED%8A%B8)

### java first time (2024.02.06)
1. HelloWorld<br>
public class HelloWorld { *//클래스 선언부* <br>
    public static void main(String[] args) { *// 메소드 선언부*<br>
*// main 메소드는 진입점 entry point*<br>
        System.out.println("Hello, World // 문자열에는 주석 처리가 안됨");<br>
} *//메소드 종료*<br>
} *//클래스 종료*<br>

   
2. result<br>
'public class Statement {<br>
   public static void main(String[] args) {<br>
   /*<br>
   *실행문 끝에는 반드시 세미콜론(;)을 붙여서 실행문이 끝났음을 표시해야 한다.<br>*
   *세미콜론은 명령의 끝을 의미하기에 한줄에 여러 명령을 붙여 사용하여도 세미콜론 때문에 상관없다.*
   */ <br>
   System.out.println("Hello");<br>
        int x; *//x라는 변수를 선언*<br>
        x = 1; *//x에 1을 저장해라*<br>
        int y = 2; *//y를 선언하고 2를 저장해라*<br>
        int result = x + y; *//result를 선언하고 x와 y를 더해서 저장하라*<br>
        System.out.println(result); *//출력하라*<br>
   }<br>
}'


## 메서드 정의
  - 제어자(Modifier) : public, static
  - 리턴 타입 (Return Type) : 메서드가 실행된 뒤 반황 되는 타입
  - 메서드 이름 (Method Name) : 메서드를 호출하는데 사용됨, 기능이 드러나도록 이름을 짓는 것이 좋다.
  - 매개변수 (Parameter) : 이름 값. 메서드 내부에서 사용 가능한 변수 매개변수가 없을수도 있음
  - 메서드 본문 (Method Body) : 실행되는 코드 블록. {} 사이 위치

## 메서드의 종류
 - 매개변수가 없고 리턴 타입도 없는 메서드 정의
 - 리턴 차입이 업는 경우 void를 사용

## 메서드의 장점
1. 반복되는 코드의 중복을 줄일 수 있다.
2. 작업이 분리되어 코드의 가독성이 향상된다.
3. 코드를 다른 프로그램에서 재사용할 수 있다.
4. 기존의 기증을 확장해서 사용하는데 유용하다.
5. 메서드를 사용할 때는 내부 작업, 구현부에 대해 알 필요가 없이 사용할 수 있다.
6. 모듈화된 메서드는 개별적으로 테스트하고 디버깅할 수 있다.
7. 유지보수가 용이해진다.

## 메서드 명령 규칙
- 기본적으로 변수의 이름을 붙이는 방식과 같다. (CamelCase) 등
- 메서드의 이름에는 동사를 사용해서 시작하는 것이 좋다. 
- addNumbers : 두 숫자를 더하는 메서드 <- 명시적으로 추측 가능
- getStudentInfo : 학생의 정보를 가져오는 메서드
- setEmployeeName : 직원의 이름을 설정하는 메서드
- 일반적으로 널리 사용되지 않는 약어는 사용하지 않는 것이 좋다.
- addN, gerSi <- 무슨 동작을 하는 메서드인지 추측이 어렵다.   