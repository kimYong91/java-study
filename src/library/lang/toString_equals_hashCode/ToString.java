package library.lang.toString_equals_hashCode;

public class ToString {

    class Product {
        private String productName;
        private long price;
        private String category;

        public Product(String productName, long price, String category) {
            this.productName = productName;
            this.price = price;
            this.category = category;
        }

        // ^위의 코드까지만 작성하면 Ctrl+ insert키를 동시에 눌러 자동 완성 기능을 사용할 수 있음
        @Override
        public String toString() {
            return "Product{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    ", category='" + category + '\'' +
                    '}';
        }
    }

}
