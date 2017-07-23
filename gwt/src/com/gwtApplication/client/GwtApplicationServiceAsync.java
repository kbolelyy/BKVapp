package com.gwtApplication.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GwtApplicationServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
