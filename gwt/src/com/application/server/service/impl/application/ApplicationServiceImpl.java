package com.application.server.service.impl.application;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.application.client.code.api.application.ApplicationService;

public class ApplicationServiceImpl extends RemoteServiceServlet implements ApplicationService {

    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }


}