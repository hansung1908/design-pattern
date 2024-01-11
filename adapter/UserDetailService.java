package adapter;

// 유저 찾기 기능을 객체화하기 위한 인터페이스
public interface UserDetailService {

    UserDetails loadUser(String username);
}
