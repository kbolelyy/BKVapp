package com.application.client.model;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

/**
 * Модель для клиентской части отвечающее
 * за авторизацию пользователя
 */

public class UserAuthorizationModel extends Composite {
    interface UserAuthorizationModelUiBinder extends UiBinder<HTMLPanel, UserAuthorizationModel> {
    }

    private static UserAuthorizationModelUiBinder ourUiBinder = GWT.create(UserAuthorizationModelUiBinder.class);


    public UserAuthorizationModel() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }


    @UiField
    InputElement firstName;
    @UiField
    InputElement lastName;
    @UiField
    InputElement email;
    @UiField
    InputElement login;
    @UiField
    InputElement password;
    @UiField
    Button create;


    public InputElement getFirstName() {
        return firstName;
    }

    public InputElement getLastName() {
        return lastName;
    }

    public InputElement getEmail() {
        return email;
    }

    public InputElement getLogin() {
        return login;
    }

    public InputElement getPassword() {
        return password;
    }

    public Button getCreate() {
        return create;
    }
}