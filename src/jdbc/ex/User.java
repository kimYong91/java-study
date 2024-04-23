package jdbc.ex;

public class User {
    private String userId;
    private String username;
    private String password;
    private int age;
    private String email;

    public User(String userId, String username, String password, int age, String email) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
    }

}
