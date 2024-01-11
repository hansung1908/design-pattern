package adapter;

// UserDetailService 인터페이스를 구현하여 유저 정보 찾기 구현(어댑터)
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

