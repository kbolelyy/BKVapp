package com.application.client.code.java;

import com.application.client.code.api.authorization.AuthorizationService;
import com.application.client.code.api.authorization.AuthorizationServiceAsync;
import com.application.client.model.UserAuthorizationModel;
import com.application.server.hibernate.entity.UsersEntity;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;

import java.sql.Date;


public class Application implements EntryPoint {

    private AuthorizationServiceAsync authorizationService = GWT.create(AuthorizationService.class);

    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {

        AsyncCallback<Void> async = new AsyncCallback<Void>() {
            @Override
            public void onFailure(Throwable caught) {
                Window.alert("Failure");

            }

            @Override
            public void onSuccess(Void result) {
                Window.alert("Done");
            }
        };
        UserAuthorizationModel authorizationModel = new UserAuthorizationModel();
        UsersEntity usersEntity = new UsersEntity();
        authorizationModel.getCreate().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                usersEntity.setFirstname(authorizationModel.getFirstName().getValue());
                usersEntity.setLastname(authorizationModel.getLastName().getValue());
                usersEntity.setLogin(authorizationModel.getLogin().getValue());
                usersEntity.setPassword(authorizationModel.getPassword().getValue());
                usersEntity.setEmail(authorizationModel.getEmail().getValue());
                usersEntity.setDateCreated(new Date(System.currentTimeMillis()));

                authorizationService.addUser(usersEntity,async);
            }
        });

        RootPanel.get().add(authorizationModel);

    }
}
