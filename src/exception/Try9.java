package exception;

public class Try9 {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "300", "30o"};


        for (int i = 0; i <= array.length; i++) {
            try {       // try가 없으면 100만 변환하고 그 뒤(300으로 변환 가능하지만)는 모두 변환하지 못하고 에러로 봄
                int length = array[i].length();
                int value = Integer.parseInt(array[i]);
                System.out.println(value);

                // 두 개 이상의 예외를 하나의 catch 블록으로 처리하고 싶을 때 예외 클래스를 ' | ' 로 해결
            } catch (NumberFormatException | NullPointerException e) {
                System.out.println("데이터가 문제 있어서 숫자 변경 불가");
//            } catch (NullPointerException e) {
//                System.out.println("데이터가 null이어서 길이 확인 불가");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과되었습니다.");
            } catch (Exception e) {
                System.out.println("예외가 발생했습니다." + e.getMessage());
            }
        }
    }
}
