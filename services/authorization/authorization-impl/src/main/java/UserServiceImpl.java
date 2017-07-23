import api.UserService;
import model.User;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.validation.constraints.NotNull;
import java.util.List;

@Stateless
public class UserServiceImpl implements UserService {


    @EJB private UserDao userDao = new UserDao();

    public UserServiceImpl() {
    }


    public User createUser(@NotNull String login, @NotNull String email, @NotNull String password,
                           String firstName, String lastName) {
        User user = new User();
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        userDao.addUser(user);

        return user;
    }

    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    public void deleteUser(User user) {
        userDao.deleteUser(user.getId());
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public User getUserById(int userid) {
       return userDao.getUserById(userid);
    }


}
