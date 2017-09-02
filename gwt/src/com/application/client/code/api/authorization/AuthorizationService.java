package com.application.client.code.api.authorization;

import com.application.server.hibernate.entity.UsersEntity;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.google.gwt.core.client.GWT;

/**
 * Created by KBolelyy on 27.08.2017.
 */
@RemoteServiceRelativePath("authorization")
public interface AuthorizationService extends RemoteService {
    /**
     * Utility/Convenience class.
     * Use AuthorizationService.App.getInstance() to access static instance of AuthorizationServiceAsync
     */
    public static class App {
        private static final AuthorizationServiceAsync ourInstance = (AuthorizationServiceAsync) GWT.create(AuthorizationService.class);

        public static AuthorizationServiceAsync getInstance() {
            return ourInstance;
        }
    }


    void addUser(UsersEntity usersEntity);


}
