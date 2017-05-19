package api;

import pojo.User;

/**
 * Created by KBolelyy on 19.05.2017.
 */
public interface UserService {

    /*
    *   создание пользователя
    */
    User createUser(String login, String email, String firstName, String lastName);

    /*
    *   обновление пользователя
    */
    void updateUser(User user);

    /*
    *   удаление пользователя
    */
    void deleteUser(User user);


}
