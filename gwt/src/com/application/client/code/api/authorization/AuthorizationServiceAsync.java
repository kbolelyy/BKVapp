package com.application.client.code.api.authorization;

import com.application.server.hibernate.entity.UsersEntity;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * Created by KBolelyy on 27.08.2017.
 */
public interface AuthorizationServiceAsync {

    void addUser(UsersEntity usersEntity, AsyncCallback<Void> async);
}
