package adapter;

// UserDetailService 인터페이스를 구현하여 유저 정보 찾기 구현
// 내가 만든 코드와 기존 코드를 연결하는 코드(어댑터)
public class AccountUserDetailsService implements UserDetailService{

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }
}

