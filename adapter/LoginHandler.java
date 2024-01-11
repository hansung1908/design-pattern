package adapter;

// 로그인 기능을 제공하는 서드파티 라이브러리
public class LoginHandler {

    UserDetailService userDetailService;

    // @AllArgsConstructor 대신하여 생성자 생성
    public LoginHandler(UserDetailService userDetailService) {
        this.userDetailService = userDetailService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailService.loadUser(username);

        if(userDetails.getPaaword().equals(password)) {
            return userDetails.getUsername();
        }

        throw new IllegalArgumentException();
    }
}

