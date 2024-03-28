package network.ex;

import java.net.URI;
import java.net.URISyntaxException;

public class Ex1 {
    public static void main(String[] args) {

        try {
            URI uri = new URI("https://www.example.com:8080/path/to/resource?name=John&age=30#section");

            String scheme = uri.getScheme();
            System.out.println("프로토콜: " + scheme);
            String host = uri.getHost();
            System.out.println("호스트: " + host);
            int port = uri.getPort();
            if (port == -1) {
                System.out.println("기본 포트");
            } else {
                System.out.println("포트: " + port);
            }
            String path = uri.getPath();
            System.out.println("경로: " + path);
            String query = uri.getQuery();
            String[] split = query.split("&");
            for (String string : split) {
                System.out.println(" - " + string);
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }


    }
}
 /*
    연습문제 1: URL 구조 분석기
    URL의 각 구성 요소(프로토콜, 호스트, 포트, 경로, 쿼리 파라미터, 참조)를 분석하고 출력하는 자바 프로그램을 작성하세요. 입력된 URL에 대해 다음 정보를 출력해야 합니다:

    요구사항
    - 프로토콜(Protocol)
    - 호스트(Host)
    - 포트 번호(Port) - 명시되지 않은 경우 "기본 포트"라고 출력
    - 경로(Path)
    - 쿼리(Query) - 각 쿼리 파라미터를 별도로 분석하여 출력
    - 참조(Reference) - 없는 경우 "참조 없음"이라고 출력

    입력 예시: https://www.example.com:8080/path/to/resource?name=John&age=30#section

    출력 예시
    ===
    프로토콜: https
    호스트: www.example.com
    포트: 8080
    경로: /path/to/resource
    쿼리:
      - name=John
      - age=30
    참조: section
     */