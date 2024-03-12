package collection.list.예시;

import java.util.*;

// 주소록 관리
public class AddressBook {
    // Composition : 필드로 데이터(친구 클래스 리스트)를 가짐
    private List<Friends> friendsList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    // 삽입
    public void addFriend() {
        System.out.print("친구 이름을 입력하세요 : ");
        String name = scanner.nextLine();
        System.out.print("친구 이메일을 입력하세요 : ");
        String email = scanner.nextLine();
        System.out.print("친구 전화번호를 입력하세요 : ");
        String phoneNumber = scanner.nextLine();

        friendsList.add(new Friends(name, email, phoneNumber));
        System.out.println("주소록에 추가되었습니다.");
    }
    // 삭제
    public void deleteFriend() {
        Iterator<Friends> iterator = friendsList.iterator();
        System.out.println("삭제할 친구를 입력해주세요");
        String deleteName = scanner.next();

        // 방법 1
//        while (iterator.hasNext()){
//            Friends next = iterator.next();
//            if (next.getName().equals(deleteName)){
//                iterator.remove();
//            }
//        }
//        System.out.println(deleteName + "님이 삭제 되었습니다.");

        // 방법 2
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(deleteName)) {
                iterator.remove();  // 안전한 삭제
                // friendsList.remove(name) // X
                System.out.println(deleteName + "님의 주소록 정보가 삭제되었습니다.");
            }
        }
    }
    // 조회
    public void searchFriend() {
        System.out.println("찾을 친구 이름을 입력해주세요");
        String searchName = scanner.next();

          // 방법 1
//        Iterator<Friends> iterator = friendsList.iterator();
//        while (iterator.hasNext()) {
//            Friends next = iterator.next();
//            if (next.getName().equals(searchName)) {
//                System.out.println(next);
//            }
//        }

          // 방법 2
//        for (int i = 0; i < friendsList.size(); i++) {
//            if (friendsList.contains(searchName)){
//            }
//            System.out.println(friendsList);
//        }

        // 방법 3
        boolean isSeatched = false;
        for (Friends friends : friendsList) {
            if (searchName.equals(friends.getName())) {
                System.out.println(friends);
            }
        }
        if (!isSeatched) System.out.println("찾을 수 없는 이름입니다.");

    }
    // 출력
    public void printAllFriends() {
        for (Friends friends : friendsList) {
            System.out.println(friends);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while(true) {
            // """ """ String Template 텍스트를 보이는 그대로 출력
            System.out.print("""
                    1. 친구 추가
                    2. 친구 삭제
                    3. 친구 검색
                    4. 주소록 출력
                    5. 종료
                    선택> 
                    """);
            int select = scanner.nextInt();

            // 향상된 switch-case문
            switch (select) {
                case 1 -> addressBook.addFriend();
                case 2 -> addressBook.deleteFriend();
                case 3 -> addressBook.searchFriend();
                case 4 -> addressBook.printAllFriends();
                case 5 -> {
                    System.out.println("종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다.");
            }
        }
    }
}