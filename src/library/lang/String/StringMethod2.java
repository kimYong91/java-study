package library.lang.String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "오늘은 3월 6일, 곧 점심시간이네요";

        // charAt : (인덱스)번째 '문자(char)'를 반환
        char c1 = str.charAt(0);
        System.out.println("c1 = " + c1);
        char c10 = str.charAt(10);
        System.out.println("c10 = " + c10);
        char cLast = str.charAt(str.length() - 1); // 순서가 0부터 시작하기에 -1을 해줘야 마지막 글자가 나온다.
        System.out.println("cLast = " + cLast);

        String sentence = "대한사람 대한으로 길이보전하세. 대한독립 만세!";

        // indexOf 문자열에서 index 위치를 int로 변환
        int i1 = sentence.indexOf("대한");        // 문자열의 시작위치부터 찾게 된다.
        System.out.println("i1 = " + i1);
        int i2 = sentence.indexOf("대한", 3);     // 2번째 인자 인덱스 위치부터 찾아서 처음 발견하는 위치 변환
        System.out.println("i2 = " + i2);

        int i3 = sentence.indexOf("대한", 3, 10);  // 3번째 인덱스 위치부터 10번째 인덱스 위치의 대한을 찾아라
        System.out.println("i3 = " + i3);

        int i4 = sentence.lastIndexOf("대한");
        System.out.println("i3 = " + i4);
    }
}
