package access_modifier.ex.com.school.management;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count;

    public void addItem(Item item) {
        // 제약사함
        if (count > 9) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        // 아이템 추가
        items[count] = item;
        count++;
    }

    /*
    ===
장바구니 상품 출력
상품명:당근, 합계:4500
상품명:양파, 합계:10000
전체 가격 합:14500
     */
    public void displayItems() {
        System.out.println("======================");
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명 : " + items[i].getName() +
                    ", 합계 : " + items[i].getTotal());

        }
        System.out.println("전체 가격 합 : " + calculateSum() + "원");
    }

    // 내부에서만(계발자만 사용할 때는 분리하는게 좋음) 사용하는 메서드는 프라이빗 하기
    // 사용자에게 꼭 필요한 메서드만 노출하는 것이 좋은 캡슐화 코드 이다.
    private long calculateSum() {
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum = sum + items[i].getTotal();

        }
        return sum;
    }
}
