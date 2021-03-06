package com.application.server.service.api;


import com.application.server.hibernate.entity.UsersEntity;
import java.util.List;

/**
 * Created by KBolelyy on 19.05.2017.
 */

public interface UserService {

    /*
    *   создание пользователя
    */
   String createUser(UsersEntity user);

    /*
    *   обновление пользователя
    */
    void updateUser(UsersEntity user);

    /*
    *   удаление пользователя
    */
    void deleteUser(UsersEntity user);

    /*
    *  получение всех пользователей
    */
    List<UsersEntity> getAllUsers();

    UsersEntity getUserById(int userid);

}
