package ru.evm.web.gwt.client.models.user;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.InputElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;


/**
 * Created by KBolelyy on 30.07.2017.
 */
public class UserModel extends Composite {

    interface UserModelUiBinder extends UiBinder<HTMLPanel, UserModel> {
    }

    private static UserModel.UserModelUiBinder ourUiBinder = GWT.create(UserModel.UserModelUiBinder.class);

    public UserModel() {
        initWidget(ourUiBinder.createAndBindUi(this));

    }


    @UiField
    InputElement login;

    @UiField
    InputElement password;

    @UiField
    InputElement email;

    @UiField
    InputElement firstName;

    @UiField
    InputElement lastName;





    public InputElement getLogin() {
        return login;
    }

    public void setLogin(InputElement login) {
        this.login = login;
    }

    public InputElement getPassword() {
        return password;
    }

    public void setPassword(InputElement password) {
        this.password = password;
    }

    public InputElement getEmail() {
        return email;
    }

    public void setEmail(InputElement email) {
        this.email = email;
    }

    public InputElement getFirstName() {
        return firstName;
    }

    public void setFirstName(InputElement firstName) {
        this.firstName = firstName;
    }

    public InputElement getLastName() {
        return lastName;
    }

    public void setLastName(InputElement lastName) {
        this.lastName = lastName;
    }
}
