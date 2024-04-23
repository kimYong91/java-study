package jdbc.board;

public class BoardEx1 {

    public  void list() {
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no","winter","date","title");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1","winter","2024-04-23","안녕하세요");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "2","winter","2024-04-23","반갑습니다");
        mainMenu();
    }
    public void mainMenu() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("메인메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
    }
    public static void main(String[] args) {
        BoardEx1 boardEx1 = new BoardEx1();
        boardEx1.list();

    }
}
