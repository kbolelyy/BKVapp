package api;

import model.User;

import java.util.List;

/**
 * Created by KBolelyy on 19.05.2017.
 */
public interface UserService {

    /*
    *   создание пользователя
    */
    User createUser(String login, String email, String password, String firstName, String lastName);

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
