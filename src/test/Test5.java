package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        ProductOrder productOrder = new ProductOrder("노트북", 1000000, 2);
        ProductOrder productOrder1 = new ProductOrder("마우스", 15000, 3);
        ProductOrder productOrder2 = new ProductOrder("키보드", 50000, 1);

        productOrder.printProduct();
        productOrder1.printProduct();
        productOrder2.printProduct();

        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = productOrder;
        productOrders[1] = productOrder1;
        productOrders[2] = productOrder2;

        int sum = 0;
        for (int i = 0; i < productOrders.length; i++) {

            sum += productOrders[i].getTotalPayment();
        }
        System.out.println("총 결제금액 : " + sum);



    }

}
