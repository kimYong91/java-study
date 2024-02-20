package class1.ex;

public class Book {
    /*
    필드:
    title (제목): String 타입
    author (저자): String 타입
    isbn (국제표준도서번호): String 타입
    isAvailable (대여 가능 여부): boolean 타입
     */
    String title;
    String author;
    String isbn;
    boolean isAvailable;


    // 생성자: 모든 필드를 매개변수로 받아 초기화하는 생성자를 작성하세요.
    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }

    // title, author 만 매개변수로 받아 초기화하는 생성자를 작성하세요.
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // Ctrl, Insert를 동시에 누르면



   //borrowBook(): 이 메서드는 도서의 대여 가능 여부(isAvailable)를 확인하고, 도서를 대여할 수 있다면 isAvailable 을 false 로 변경하고 true 를 반환합니다. 이미 대여 중이라면 false 를 반환합니다.
//    boolean borrowBook() {
//        if (isAvailable == true) {
//            System.out.println("대여 가능합니다.");
//            isAvailable = false;
//        } else  {
//            System.out.println("대여 중 입니다.");
//        }
//        return isAvailable;
//    }


    //borrowBook(): 이 메서드는 도서의 대여 가능 여부(isAvailable)를 확인하고, 도서를 대여할 수 있다면 isAvailable 을 false 로 변경하고 true 를 반환합니다. 이미 대여 중이라면 false 를 반환합니다.
    void borrowBook() {
        isAvailable = true;
        if (isAvailable == true) {
            System.out.println("대여 가능합니다.");
            isAvailable = false;
        } else {
            System.out.println("대여 중 입니다.");
        }
    }

    //returnBook(): 도서를 반납하고 isAvailable 을 true 로 변경합니다.
//    void returnBook() {
//        isAvailable = true;
//        System.out.println("반납하였습니다.");
//
//    }

    //returnBook(): 도서를 반납하고 isAvailable 을 true 로 변경합니다.
    void returnBook() {
        if (isAvailable == false) {
            System.out.println("반납하였습니다.");
        }
    }

    // 질문 필요!! 1. if는 왜 안되는지, 2. return 이 int 등을 쓸때 필요하다는것은 알지만 return 에 붙는 코드는 어떤 기준인지 왜 여기서는 void 인지 등
    // 정답 : 1. (isAvailable == true) > (isAvailable == false) 로 바꿨어야 한다.
    //       2. return은 같은 메서드에서 다른 메서드를 멈추게 하는 효과와
    //                       보여주기 위한 값과 전달하기 위한 값등 이 같이 있을때 전달하기 위한 값을 전달하기 위해 return에 담아 보낸다.

    //printInfo(): 현재 도서의 상태정보를 출력하는 메서드를 만들어보세요.
    void printInfo() {
        System.out.println("책 : " + title + " 저자 :" + author +" 국제표준도서번호 : "+ isbn + " 대여 상태 : "+ isAvailable);
    }

}