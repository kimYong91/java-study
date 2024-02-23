package test;

public class ShoppingCart {
    Item[] items;

    int index = 10;

    public void addItem (Item item) {
       this.items[index] = item;
        int sum = 0;
        sum += item.price * item.quantity;
        System.out.println("장바구니 상품 출력");
        System.out.println("상품명 : " + item.productName + ", 합계 : " + sum);
        index++;
        }

//        public void display () {
//                int sum = 0;
//            sum += items.length
//            System.out.println("상품명 : " + item.productName + ", 합계 : " + sum);
//                return
//        }

}
