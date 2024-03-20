package stream.ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Ex7 {
   static class MovieRating {
        String movieName;
        int rating;

        MovieRating(String movieName, int rating) {
            this.movieName = movieName;
            this.rating = rating;
        }

        String getMovieName() {
            return movieName;
        }

        int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return movieName + " (" + rating + ")";
        }
    }

    public static void main(String[] args) {
        List<MovieRating> ratings = Arrays.asList(
                new MovieRating("Inception", 5),
                new MovieRating("The Godfather", 5),
                new MovieRating("Interstellar", 4),
                new MovieRating("Jurassic Park", 3),
                new MovieRating("The Dark Knight", 5),
                new MovieRating("Pulp Fiction", 4),
                new MovieRating("Some Movie", 2)
        );
        ratings.stream()
                .filter(movieRating -> movieRating.getRating() > 3)
                .peek(movieRating -> System.out.println("정렬전 : " + movieRating))
                .sorted(Comparator.comparing(MovieRating::getMovieName))
                .forEach(System.out::println);
    }

}
    /*
    연습 문제: 영화 평점 기록 분석

    영화 평점 정보가 담긴 리스트가 있습니다.
    각 평점 정보는 영화의 이름과 평점(1~5)을 포함합니다.
    평점이 4 이상인 영화만 필터링하고, 그 결과를 확인하기 위해 peek를 사용하세요.
    마지막으로, 평점이 4 이상인 영화의 이름을 알파벳 순으로 정렬하여 최종 목록을 출력하는 프로그램을 작성하세요.

    class MovieRating {
        String movieName;
        int rating;

        MovieRating(String movieName, int rating) {
            this.movieName = movieName;
            this.rating = rating;
        }

        String getMovieName() {
            return movieName;
        }

        int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return movieName + " (" + rating + ")";
        }
    }

    List<MovieRating> ratings = Arrays.asList(
        new MovieRating("Inception", 5),
        new MovieRating("The Godfather", 5),
        new MovieRating("Interstellar", 4),
        new MovieRating("Jurassic Park", 3),
        new MovieRating("The Dark Knight", 5),
        new MovieRating("Pulp Fiction", 4),
        new MovieRating("Some Movie", 2)
    );

    요구사항:
    - 평점이 4 이상인 영화만 필터링하세요.
    - peek를 사용하여 필터링된 영화의 이름과 평점을 출력하세요.
    - 평점이 4 이상인 영화를 영화 이름의 알파벳 순으로 정렬하세요.
    - 최종 목록 출력하세요.
     */