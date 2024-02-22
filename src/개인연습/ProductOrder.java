package 개인연습;

import java.util.Scanner;

public class ProductOrder {

    String productName;
    double price;
    int quantity;

    public void productOrder (int orders) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < orders; i++) {
            System.out.println("상품 주문을 입력하세요");
            System.out.print("상품명 : ");
            this.productName = scanner.next();
            System.out.print("가격 : ");
            this.price = scanner.nextDouble();
            System.out.print("수량 : ");
            this.quantity = scanner.nextInt();

        }
    }
    /*
    주문 상품 정보:
상품명: 노트북, 가격: 1000000원, 수량: 2개
상품명: 마우스, 가격: 50000원, 수량: 1개
     */
    public static void productInformation (ProductOrder[] productOrders) {
        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 : " + productOrder.productName + ", 가격 : " + productOrder.price + ", 수량 : " + productOrder.quantity + "개");

        }
    }
    //총 결제 금액: 2050000원
    public static double totalPayment (ProductOrder[] productOrders) {
        double sum = 0;
        for (ProductOrder productOrder : productOrders)
        sum += productOrder.price * productOrder.quantity;
    return sum;
    }

}
