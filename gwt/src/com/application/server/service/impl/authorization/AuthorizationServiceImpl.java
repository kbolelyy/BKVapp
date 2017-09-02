package com.application.server.service.impl.authorization;

import com.application.client.code.api.authorization.AuthorizationService;
import com.application.server.dao.UserDao;
import com.application.server.hibernate.entity.UsersEntity;
import com.application.server.service.api.UserService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * Created by KBolelyy on 27.08.2017.
 */
public class AuthorizationServiceImpl extends RemoteServiceServlet implements AuthorizationService {

    private UserService userService = new UserDao();


    @Override
    public void addUser(UsersEntity usersEntity) {
            userService.addUser(usersEntity);
    }
}
