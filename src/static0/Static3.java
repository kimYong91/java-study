package static0;

public class Static3 {
    public static void main(String[] args) {
        // 1. 객체 생성
//        StringDecoUtil util = new StringDecoUtil();
        // 2. 객채를 통해 메서드에 접근해서 사용 => 인스턴스 메서드
//        String string = util.decorate("안녕하세요");
//        System.out.println(string);

        // 객체 생성없이 static 메서드 사용 => 클래스 메서드
        String string2 = StringDecoUtil.decorate("반갑습니다.");
        System.out.println(string2);
    }



}
