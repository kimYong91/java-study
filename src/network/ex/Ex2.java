package network.ex;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://n.news.naver.com/article/374/0000376756");

        URLConnection urlConnection = url.openConnection();

        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/network/Ex2_홈페이지.html"));

        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) break;
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        BufferedReader fileReader = new BufferedReader(new FileReader("src/network/Ex2_홈페이지.html"));

        while (true) {
            String line = fileReader.readLine();
            if (line == null) break;
            if (line.contains("<title>")) {
               line = line.replace("<title>", " ").replace("</title>", " ").trim();
                System.out.println(line);
            }
        }



        fileReader.close();
        bufferedWriter.close();
        inputStream.close();
        inputStreamReader.close();
        bufferedReader.close();

    }
}
 /*
    연습문제 : 웹 페이지 제목 추출기

    주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
    이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

    - 웹 페이지의 HTML 내용을 가져옵니다.
    - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
    - 추출한 텍스트를 출력합니다.

    - 입력 예시: https://www.example.com
    - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */