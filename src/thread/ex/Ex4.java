package thread.ex;

import java.util.Arrays;
import java.util.List;

public class Ex4 {
    static class ItemShop {
        boolean item = true;
        public synchronized void buyItem(Player player) {

                if (item == true) {
                    System.out.println("플레이어 " + player.getName() + "가 아이템을 성공적으로 구매 하였습니다.");
                    item = false;
                } else {
                    System.out.println("플레이어 " + player.getName() + "의 구매 시도 실패: 아이템이 이미 판매되었습니다.");
                }

        }
    }

        static class Player implements Runnable{
            private String name;
            ItemShop itemShop;

            public Player(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            @Override
            public void run() {
                while (true) {
                    itemShop.buyItem(this);
                }
            }
        }


    public static void main(String[] args) {
        ItemShop itemShop = new ItemShop();
        new Thread(() -> itemShop.buyItem(new Player("희동이"))).start();
        new Thread(() -> itemShop.buyItem(new Player("둘리"))).start();
        new Thread(() -> itemShop.buyItem(new Player("마이콜"))).start();



    }
}
/*
    연습문제: 온라인 게임의 아이템 상점

    문제 설명:
    여러분은 온라인 게임의 개발자입니다.
    이 게임에는 공유 아이템 상점이 있으며, 여러 플레이어가 동시에 아이템을 구매할 수 있습니다.
    상점에는 한정된 수량의 특별 아이템 단 1개만 있고, 여러 플레이어가 동시에 이 아이템을 구매하려고 합니다.
    특별 아이템은 오직 하나만 존재하며, 먼저 구매한 플레이어에게만 판매됩니다.
    아이템 구매 시도가 성공하면 "플레이어 [이름]이 아이템을 성공적으로 구매했습니다."라고 출력하고,
    실패하면 "플레이어 [이름]의 구매 시도 실패: 아이템이 이미 판매되었습니다."라고 출력합니다.

    요구사항:
    - ItemShop 클래스를 정의하고, buyItem 메서드를 통해 아이템 구매를 처리합니다.
    - buyItem 메서드는 동기화 메서드로 구현하여, 한 번에 한 플레이어만 아이템을 구매할 수 있도록 합니다.
    - 여러 플레이어(스레드)가 아이템을 구매하려고 시도하는 상황을 시뮬레이션합니다.
    - 단 하나의 아이템의 판매 여부는 boolean 필드 itemAvailable으로 관리된다.

    출력예시
    ===
    플레이어 희동이가 아이템을 성공적으로 구매했습니다.
    플레이어 둘리의 구매 시도 실패: 아이템이 이미 판매되었습니다.
    플레이어 마이콜의 구매 시도 실패: 아이템이 이미 판매되었습니다.
     */