package com.gwtApplication.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwtApplication.client.GwtApplicationService;

public class GwtApplicationServiceImpl extends RemoteServiceServlet implements GwtApplicationService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}