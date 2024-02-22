package 개인연습.예상_시험문제;

public class Product {
    String name;
    int price;
    int quantity;
    double discount = 0.1;


    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct () {
        double payment = 0;
        payment = (1-discount) * (price * quantity);
        System.out.println("상품명 : " + name + ", 가격 : " + price +
                ", 수량 : " + quantity + ", 할인 후 가격 : " + payment);
    }


}
