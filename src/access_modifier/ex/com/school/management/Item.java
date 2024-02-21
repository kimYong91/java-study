package access_modifier.ex.com.school.management;

public class Item {
    private String name;
    private long price;
    private int quantity;

    Item (String name, long price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public long getTotal() {
        return price * quantity;
    }

    public String getName () {
        return name;
    }

}
