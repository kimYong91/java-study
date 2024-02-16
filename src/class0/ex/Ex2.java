package class0.ex;

import java.util.zip.ZipFile;

public class Ex2 {
    public static void main(String[] args) {
         ProductOrder productOrder1;
         productOrder1 = new ProductOrder();
         productOrder1.productName = "노트북";
         productOrder1.price = 1000000;
         productOrder1.quantity = 2;

         ProductOrder productOrder2;
         productOrder2 = new ProductOrder();
         productOrder2.productName = "마우스";
         productOrder2.price = 15000;
         productOrder2.quantity = 3;

         ProductOrder productOrder3;
         productOrder3 = new ProductOrder();
         productOrder3.productName = "키보드";
         productOrder3.price = 50000;
         productOrder3.quantity = 1;

         ProductOrder[] productOrders = new ProductOrder[3];
         productOrders[0] = productOrder1;
         productOrders[1] = productOrder2;
         productOrders[2] = productOrder3;

//        ProductOrder[] productOrders = {productOrder1, productOrder2, productOrder3}; // 위의 것과 같으나 간단함

        int totalPayment = 0;

        for (int i = 0; i < productOrders.length; i++) {
            System.out.println("상품명 : " + productOrders[i].productName +", 가격 : " + productOrders[i].price +
                    ", 수량 : " + productOrders[i].quantity + "개");

            int payment = productOrders[i].price * productOrders[i].quantity;
            totalPayment += payment;
        }

        // 최종 결제 금액
        System.out.println("총 결제 금액 : " + totalPayment + "원");

    }
}
