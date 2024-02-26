package polymorphism.ex.ex4;

public class Ex4 {
    public static void main(String[] args) {
        Cookie[] cookies = {new Gingerbread(), new StrawberryCookie(), new ChocoCookie()};
        System.out.println("=====");
        for (Cookie cookie : cookies){
            cookie.run();
            cookie.jump();
            cookie.specialSkill();

        }
        System.out.println("=====");
    }
}
