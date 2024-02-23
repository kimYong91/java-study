package test;

public class Test6 {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("전사", 5, 100);
        GameCharacter gameCharacter1 = new GameCharacter("마법사", 5, 200);

        gameCharacter.attack();
        gameCharacter1.takeDamage(10);

        gameCharacter1.attack();
        gameCharacter.takeDamage(20);


    }

}
