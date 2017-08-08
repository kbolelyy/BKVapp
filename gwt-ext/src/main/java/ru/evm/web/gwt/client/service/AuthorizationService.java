package ru.evm.web.gwt.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;


/**
 * Created by KBolelyy on 30.07.2017.
 */
@RemoteServiceRelativePath("authorization")
public interface AuthorizationService extends RemoteService {

    void fillFormUserModel();

}
