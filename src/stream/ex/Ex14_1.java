package stream.ex;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Ex14_1 {
    public static void main(String[] args) {


        record Book(String title, String genre, String author, int publishYear, int pages) {
        }

        List<Book> books = Arrays.asList(
                new Book("Java의 정석", "컴퓨터 과학", "남궁성", 2013, 1024),
                new Book("모비 딕", "소설", "허먼 멜빌", 1851, 635),
                new Book("클린 코드", "컴퓨터 과학", "로버트 C. 마틴", 2008, 464),
                new Book("햄릿", "연극", "윌리엄 셰익스피어", 1603, 500),
                new Book("데미안", "소설", "헤르만 헤세", 1919, 248),
                new Book("Effective Java", "컴퓨터 과학", "조슈아 블로크", 2018, 412)
        );

//        - 모든 책의 평균 페이지 수를 계산하세요.
        double avgBookPage = books.stream().mapToInt(Book::pages).average().orElse(0.0);
        System.out.printf("모든 책의 평균 페이지 수 = %.0f 페이지\n", avgBookPage);

        //        - 장르가 "소설"인 책들만 추려서, 이들의 평균 출판년도를 계산하세요.
        Double novelAvgYear = books.stream().filter(book -> book.genre.equals("소설"))
                .collect(Collectors.averagingInt(Book::publishYear));
        System.out.println("장르가 \"소설\"인 책들의 평균 출판년도 = " + novelAvgYear);

        // - 2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목들을 출력하세요.
        List<String> titleList = books.stream()
                .filter(book ->
                        book.publishYear > 2010
                                && book.pages >= 300)
                .map(Book::title)
                .collect(Collectors.toList());
        System.out.println("2010년 이후에 출판된 책들 중 페이지 수가 300페이지 이상인 책의 제목 = " + titleList);
//        - 각 장르별로 책이 몇 권씩 있는지 계산하세요.
        Map<String, Long> genreBookMap = books.stream()
                .collect(Collectors.groupingBy(Book::genre,
                        Collectors.counting()));
        System.out.println("각 장르별로 책의 수 = " + genreBookMap);
        // 가장 많은 책이 출판된 장르를 찾으세요.
        String maxGenre = genreBookMap.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("잘못된 장르");
        System.out.println("가장 많은 책이 출판된 장르 = " + maxGenre);
    }
}