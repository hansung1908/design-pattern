package adapter;

// UserDetails 인터페이스를 구현하여 계좌 정보 불러오기 구현
// 내가 만든 코드와 기존 코드를 연결하는 코드(어댑터)
public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return this.account.getName();
    }

    @Override
    public String getPaaword() {
        return this.account.getPassword();
    }
}
