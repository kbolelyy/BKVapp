import api.UserService;
import pojo.User;

/**
 * Created by KBolelyy on 19.05.2017.
 */

public class UserServiceImpl implements UserService {

    public UserServiceImpl() {
    }



    public User createUser(String login, String email, String firstName, String lastName) {
        return new User(login, email, firstName, lastName);
    }

    public void updateUser(User user) {

    }

    public void deleteUser(User user) {

    }


}
