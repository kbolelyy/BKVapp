package com.application.client.code.api.application;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ApplicationServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
