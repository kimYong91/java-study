package class0.ex;

import class0.Student;

public class Ex1 {
    public static void main(String[] args) {

        MovieReview movieReview1;
        movieReview1 = new MovieReview();
        movieReview1.MovieTitle = "제목";
        movieReview1.review = "리뷰";

        MovieReview MovieReview = new MovieReview();
        MovieReview = movieReview1;

        System.out.println("영화 제목 : " + movieReview1.MovieTitle + "\n" + "영화 리뷰 : " + movieReview1.review);

       MovieReview movieReview2;
       movieReview2 = new MovieReview();
       movieReview2.title = "부산행";
       movieReview2.review = "재미있어요.";

//       MovieReview movieReview3;
//       movieReview3.title = "기생충";
//       movieReview3.review= "무서원요."


        System.out.println(movieReview2.title + "은 " + movieReview2.review);
        }

    }

