package quiz.quiz6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Quiz5 {
    static class ProductReview {
        String product;
        int review;

        public ProductReview(String product, int review) {
            this.product = product;
            this.review = review;
        }
    }
    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );
        Double collect = reviews.stream().collect(Collectors.averagingInt(review -> review.review));
        System.out.println("평균 리뷰 점수 : " + collect);
        long count = reviews.stream().map(productReview -> productReview.review).filter(integer -> integer == 5).count();
        System.out.println("5점 리뷰 수 : " + count);
    }
}
