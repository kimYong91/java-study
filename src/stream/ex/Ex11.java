package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Ex11 {
    record ProductReview(String productName, int score) {}

    public static void main(String[] args) {
        List<ProductReview> reviews = Arrays.asList(
                new ProductReview("product1", 5),
                new ProductReview("product2", 4),
                new ProductReview("product3", 5),
                new ProductReview("product4", 3),
                new ProductReview("product1", 4)
        );
//        OptionalDouble average = reviews.stream()
//                .mapToInt(ProductReview::score)
//                .average();
//        System.out.println("평균 리뷰 점수: " + average.getAsDouble());

        double average = reviews.stream()
                .mapToInt(ProductReview::score)
                .average()
                .orElse(Double.NaN);
        System.out.println("평균 리뷰 점수: " + average);


//        long count = reviews.stream()
//                .mapToInt(ProductReview::score)
//                .filter(n -> n == 5)
//                .count();
//        System.out.println("5점 리뷰 수: " + count);

        long count = reviews.stream()
                .filter(productReview -> productReview.score() == 5)
                .count();
        System.out.println("5점인 리뷰의 수 = " + count);

    }
}
/*
    연습 문제 3: 제품 리뷰 분석
    온라인 상점에서 판매되는 여러 제품에 대한 리뷰 점수가 있습니다. 각 리뷰에는 제품 ID와 리뷰 점수(1~5)가 포함되어 있습니다. 여러분의 목표는 다음 정보를 계산하는 것입니다:

    - 전체 제품에 대한 평균 리뷰 점수를 계산하세요.
    - 리뷰 점수가 5점인 리뷰의 수를 계산하세요.


    record ProductReview(String productName, int score) {}

    List<ProductReview> reviews = Arrays.asList(
        new ProductReview("product1", 5),
        new ProductReview("product2", 4),
        new ProductReview("product3", 5),
        new ProductReview("product4", 3),
        new ProductReview("product1", 4)
    );

    출력예시
    ===
    평균 리뷰 점수: 4.2
    5점 리뷰 수: 2
     */