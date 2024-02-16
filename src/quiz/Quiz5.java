package quiz;

public class Quiz5 {
    public static void main(String[] args) {
        /*
상품, 가격, 수량을 3개 담아서
총 결제금액을 계산하는 프로그램을 만들어보세요.

출력예시
=====
상품명: 노트북, 가격 :1000000, 수량 : 2
상품명: 마우스, 가격 :15000, 수량 : 3
상품명: 키보드, 가격 :50000, 수량 : 1
총 결제금액 : 2095000원
         */
        ProductOrder productOrder1;
        productOrder1.productName = "노트북";
        productOrder1.price = 1000000;
        productOrder1.quantity = 2;

        ProductOrder productOrder2;
        productOrder2.productName = "마우스";
        productOrder2.price = 15000;
        productOrder2.quantity = 3;

        ProductOrder productOrder3;
        productOrder3.productName = "키보드";
        productOrder3.price = 50000;
        productOrder3.quantity = 1;

        ProductOrder[] productOrders = new productOrders[3];
        System.out.println(productOrders[0]);
        System.out.println(productOrders[1]);
        System.out.println(productOrders[2]);


    }
//    public static ProductOrder totalPayment () {
//
//        int result =
//
//
//    }


}
