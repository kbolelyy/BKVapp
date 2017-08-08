package ru.evm.web.gwt.server;

import api.UserService;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import model.User;
import ru.evm.web.gwt.client.models.user.UserModel;
import ru.evm.web.gwt.client.service.AuthorizationService;

import javax.ejb.EJB;

/**
 * Created by KBolelyy on 30.07.2017.
 */
public class AuthorizationServiceImpl extends RemoteServiceServlet implements AuthorizationService {


    @Override
    public void fillFormUserModel() {}
}
