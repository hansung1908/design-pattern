package adapter;

// 로그인 기능 써드파티 라이브러리를 사용하는 코드
// 내가 만든 코드(adaptee)
public class AccountService {

    public Account findAccountByUsername(String username) {
        // 계좌 생성
        Account account = new Account();
        // 계좌 정보 입력
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);

        // 정보가 담긴 계좌 반환
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }
}

