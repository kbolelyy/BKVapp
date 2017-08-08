package ru.evm.web.gwt.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootPanel;
import ru.evm.web.gwt.client.models.user.UserModel;
import ru.evm.web.gwt.client.service.AuthorizationService;
import ru.evm.web.gwt.client.service.AuthorizationServiceAsync;


/**
 * Created by KBolelyy on 24.07.2017.
 */
public class Bkv implements EntryPoint {

    AuthorizationServiceAsync serviceAsync = GWT.create(AuthorizationService.class);
    private UserModel userModel;

    public void onModuleLoad() {

        userModel = new UserModel();
        RootPanel.get().add(userModel);



    }

}
