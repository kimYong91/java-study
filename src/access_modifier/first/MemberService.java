package access_modifier.first;

public class MemberService {

    public static void main(String[] args) {
        Data data = new Data();

        data.publicData = 1000;
        data.defaultData = 1000;
        // data.privateData     같은 패키지 메인 접근 불가
    }
}
