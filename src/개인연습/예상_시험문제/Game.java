package 개인연습.예상_시험문제;

public class Game {
    /*
    필드:
    name: 캐릭터의 이름 (String)
    level: 캐릭터의 레벨 (int)
    health: 캐릭터의 생명력 (int)
     */

    String name;
    int level;
    int health;
    private int damage = (int)((Math.random() * 100) + 10);


    Game (String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health= health;
    }
    void printStatus () {
        System.out.println("케릭터 명 : " + name + ", 레벨 : " + level + ", 체력 : " + health);

    }


    int attack (Game game) {
        System.out.println("공격!!");
        System.out.println(damage + "의 데미지를 주었습니다.");
        return damage;
    }
    void takeDamage () {
        health -= damage;
        System.out.println(damage + "의 데미지를 받았습니다. 남은 체력은 " + health + "입니다.");
        if (damage == health){
            System.out.println("케릭터가 죽었습니다.");
        }
    }






}
