package library.lang.ex;

public class Ex14 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};
        int[] prices = {1000, 500, 2000};

        System.out.println("과일 가격표");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%-1s : %,8d원\n", fruits[i],prices[i]);
        }
    }
}
