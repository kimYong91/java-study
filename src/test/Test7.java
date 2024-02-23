package test;

public class Test7 {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item("당근", 1500, 3);
        Item item1 = new Item("양파", 2000, 5);
        cart.addItem(item);
        cart.addItem(item1);
    }
}
// 정상실행 안됨
// 접근제어 안함
