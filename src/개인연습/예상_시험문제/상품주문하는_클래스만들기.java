package 개인연습.예상_시험문제;

public class 상품주문하는_클래스만들기 {

    public static void main(String[] args) {

        Product product = new Product("노트북", 1000000, 1);
        Product product1 = new Product("마우스", 30000, 2);
        Product product2 = new Product("키보드", 25000,1);

        product.printProduct();
        product1.printProduct();
        product2.printProduct();

        Product[] products = new Product[3];
        products[0] = product;
        products[1] = product1;
        products[2] = product2;

        double totalPayment = 0;
        for (int i = 0; i < products.length; i++) {
            totalPayment += products[i].totalPayment();
        }
        System.out.println("총 곌제 금액 : " + totalPayment);
    }
}