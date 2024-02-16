package class0.ex;

import java.util.Scanner;

public class Ex4 {
    // 3번 연습문제를 리팩토링 해주세요.
    public static void main(String[] args) {
        ProductOrder productOrderA = createOrder("노트북", 1000000, 2);
        ProductOrder productOrderB = createOrder("마우스", 15000, 3);
        ProductOrder productOrderC = createOrder("마우스", 50000, 1);
        printOrder(productOrderA);
        printOrder(productOrderB);
        printOrder(productOrderC);


    }

    //createOrder 메소드를 통해 상품주문 객체를 생성해주세요.
    public static ProductOrder createOrder(String productName1, int price1, int quantity1) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName1;
        productOrder.price = price1;
        productOrder.quantity = quantity1;
        return productOrder;
    }

    //    // printOrder 메소드를 통해 상품 정보를 출력해주세요.
    public static void printOrder(ProductOrder productOrder) {

        System.out.println("제품명 : " + productOrder.productName + ", 금액 : " + productOrder.price + ", 주문 : " + productOrder.quantity + "개");
    }

    // getTotalPayment 메소드를 통해 총 결제 금액을 구해주세요.
    public static int getTotalPayment(ProductOrder[] orders) {
        int totarpaymeent = 0;
        for (ProductOrder productOrder : orders) {
            totarpaymeent += productOrder.price * productOrder.quantity;
        }
        return totarpaymeent;
    }
}
