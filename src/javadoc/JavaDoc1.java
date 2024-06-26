package javadoc;

public class JavaDoc1 {
    public static void main(String[] args) {
        // JavaDoc 으로 추가한 경우 사용할 때 클래스, 생성자, 메서드 등에서 설명을 확인할 수 있다.
        Polygon polygon = new Polygon(3);

        double angle = polygon.getInnerAngle();
        int perimeter = polygon.getPerimeter(10);

        System.out.printf("삼각형의 내각는 %.0f도 입니다.", angle);
        System.out.println();
        System.out.printf("삼각형의 둘레는 %dcm 입니다.", perimeter);


    }
}
