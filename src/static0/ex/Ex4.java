package static0.ex;

public class Ex4 {
    public static void main(String[] args) {
        Logger.logInfo("앱이 시작되었습니다...");
        Logger.logError("에러 메시지입니다.");

        Logger.setLogLevel("ERROR");
        Logger.logInfo("ERROR 레벨이 세팅되었을 때 출력되는 INFO 메시지입니다.");
        Logger.logError("ERROR 레벨이 세팅되었을 때 출력되는 ERROR 메시지입니다.");
    }

}
