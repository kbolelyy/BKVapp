import api.UserService;
import model.User;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

// Бин который отвечает за сервис работы с базой данных

@Stateless
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    public UserServiceImpl() {
    }


    public String createUser(User user) {
        userDao.addUser(user);
        return user.getLogin();
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
