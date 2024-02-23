package test;

public class ProductOrder {
    String productName;
    int price;
    int quantity;
    int sum;

    ProductOrder (String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void printProduct () {
        System.out.println("상품명 : " + productName + ", 가격 : " + price + ", 수량 : " + quantity);
    }
    int getTotalPayment () {
      return price * quantity;
    }

}
