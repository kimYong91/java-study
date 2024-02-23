package 개인연습.예상_시험문제;

public class Product {
    String productName;
    double price;
    int quantity;
    double discount = 0.1;


    Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct() {
        System.out.println("상품명 : " + productName + ", 가격 : " + price + ", 수량 : " + quantity + ", 할인 후 가격 : " + (1 - discount) * (price * quantity));
    }

    public double totalPayment() {
        return (1 - discount) * (price * quantity);
    }
}

