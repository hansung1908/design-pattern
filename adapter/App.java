package adapter;

public class App {
    public static void main(String[] args) {

        // 어댑터를 별도의 클래스로 만들어서 기존 코드 수정이 불가한 경우 유용하게 사용
        // -> 내가 직접 코드를 변경할 수 없다면 Account, AccountService, 어댑터를 직접 수정
        AccountService accountService = new AccountService();
        UserDetailService userDetailService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailService);

        String login = loginHandler.login("hmin", "hmin");
        System.out.println("login = " + login);
    }
}
