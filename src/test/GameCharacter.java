package test;

public class GameCharacter {
    String name;
    int lever;
    int health;

    GameCharacter (String name, int lever, int health) {
        this.name = name;
        this.lever = lever;
        this.health = health;
    }

    public void attack () {
        System.out.println(name + "의 공격!");
    }

    public void takeDamage (int damage) {
        health -= damage;
        System.out.println(name + "는 " + damage + "의 피해를 입었습니다.");
        System.out.println("체력이 " + health + " 남았습니다.");
    }
}
