package 개인연습;

import java.util.Scanner;

public class 개인연습23 {
    public static void main(String[] args) {
         /*
    출력예시
    ===
    주문의 개수를 입력하세요:  2
    상품 주문을 입력하세요.
    상품명: 노트북
    가격: 1000000
    수량: 2
    상품 주문을 입력하세요.
    상품명: 마우스
    가격: 50000
    수량: 1

    주문 상품 정보:
    상품명: 노트북, 가격: 1000000원, 수량: 2개
    상품명: 마우스, 가격: 50000원, 수량: 1개
    총 결제 금액: 2050000원
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println("========");
        System.out.print("주문의 개수를 입력하세요 : ");
        int orders = scanner.nextInt();
        ProductOrder[] productInformation = new ProductOrder[orders]; // 창고에 담긴 정보를 보여줄 쇼케이스이지만 셔터문을 열어줄수 있는 출력 메서드가 필요함

        for (int i = 0; i < orders; i++) {
            System.out.println("상품 주문을 입력하세요");
            System.out.print("상품명 : ");
            String name = scanner.next();
            System.out.print("가격 : ");
            double price = scanner.nextInt();
            System.out.print("수량 : ");
            int quantity = scanner.nextInt();

            productInformation[i] = information(name, price, quantity);
        }
        printInformation(productInformation);

        double allPayment = totalPayment(productInformation);
        System.out.println("총 경재 금액 : " + allPayment);



    }
    // 주문 정보를 담을 창고 만들기
    public static ProductOrder information (String name, double price, int quantity) {
        ProductOrder productInformation = new ProductOrder(); // 정보 출처 형성
        productInformation.productName = name; // .productName 정보 원본에서 정리된 칸의 주소
        productInformation.price = price;
        productInformation.quantity = quantity;
      return productInformation;
    }

    // 쇼케이스를 막는 셔터문을 열어줄 메서드 //상품명: 노트북, 가격: 1000000원, 수량: 2개
    public static void printInformation (ProductOrder[] ProductOrders) {
        for (ProductOrder order : ProductOrders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }

    }

    // 총 금액 계산
    public static double totalPayment (ProductOrder[] ProductOrders) {
        double sum = 0;
        for (ProductOrder order : ProductOrders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }

}
