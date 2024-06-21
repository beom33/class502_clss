package exam04;

public class Ex01 {
    public static void main(String[] args) {
        LoginService service = new LoginService();
        try {
            service.login("userID:user02", "userPw:1234565");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
