package 개인연습;

import java.util.Scanner;

public class 개인연습22 {
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
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("========");
            System.out.print("주문 개수 : ");
            int productOrder = scanner.nextInt();
            ProductOrder[] orders = new ProductOrder[productOrder]; // 창고에 둔 정보를 사람들에게 보려줄 쇼케이스 장을 만듬

            // 주문 오더 용 창 생성
            for (int i = 0; i < productOrder; i++) {
                System.out.println((i + 1) + "번째 상품 주문을 입력하세요");
                System.out.print("상품명 : ");
                String productName = scanner.next();
                System.out.print("가격 : ");
                double price = scanner.nextDouble();
                System.out.print("수량 : ");
                int quantity = scanner.nextInt();
                orders[i] = totalProductInformation(productName, price, quantity); // 정보를 창고에 둘었음
            }


            totalProductOrders(orders);
            System.out.println("총 결제 금액 : " + getTotalPayment(orders));

        }
        // 주문 받은 것 보여주는 창 생성
        public static void totalProductOrders (ProductOrder[] orders) {
            for (ProductOrder order : orders) {
                System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
            }
        }
        // 상품 정보를 한대 묶는 메서드 * main 에서 받은 정보들을 담을 창고를 만듬
    public static ProductOrder totalProductInformation (String productName, double price, int quantity) {
            ProductOrder productOrders = new ProductOrder();
            productOrders.productName = productName;
            productOrders.price = price;
            productOrders.quantity = quantity;

            return productOrders;
    }
    public static double getTotalPayment (ProductOrder[] orders) {
            double totalPayment = 0;
            for (ProductOrder order : orders) {
                totalPayment += order.price * order.quantity;
            }
            return totalPayment;
    }


    }