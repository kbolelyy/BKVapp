package com.application.client.code.java;

import com.application.client.model.UserAuthorizationModel;
import com.google.gwt.core.client.EntryPoint;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;


public class Application implements EntryPoint {


    /**
     * This is the entry point method.
     */
    public void onModuleLoad() {
        UserAuthorizationModel authorizationModel = new UserAuthorizationModel();


        authorizationModel.getCreate().addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                Window.alert("asd");
            }
        });
        RootPanel.get().add(authorizationModel);

    }
}
