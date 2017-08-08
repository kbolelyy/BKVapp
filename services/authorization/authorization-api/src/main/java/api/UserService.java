package api;

import model.User;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by KBolelyy on 19.05.2017.
 */
@Local
public interface UserService {

    /*
    *   создание пользователя
    */
   String createUser(User user);

    /*
    *   обновление пользователя
    */
    void updateUser(User user);

    /*
    *   удаление пользователя
    */
    void deleteUser(User user);

    /*
    *  получение всех пользователей
    */
    List<User> getAllUsers();

    User getUserById(int userid);

}
