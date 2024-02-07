package variable;

public class Type7 {
    public static void main(String[] args) {
        // 문자열 => 기본타입으로 강제 변환
        String s1 = "600000";
        int i1 = Integer.parseInt(s1);

        double d1 = Double.parseDouble("3.14");

        boolean b = Boolean.parseBoolean("true");//Boolean.parseBoolean("true"); => 컨트롤 알트 v 누르면 자동 변환 가능

        // 기본 타입 => 문자열 강제 변환
        String s = String.valueOf(100);
        String s2 = String.valueOf(3.14);
        String s3 = String.valueOf(false);
        
    }
}
