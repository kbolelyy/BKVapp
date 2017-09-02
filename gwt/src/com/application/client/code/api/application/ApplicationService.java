package com.application.client.code.api.application;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("application")
public interface ApplicationService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use ApplicationService.App.getInstance() to access static instance of applicationServiceAsync
     */
    public static class App {
        private static ApplicationServiceAsync ourInstance = GWT.create(ApplicationService.class);

        public static synchronized ApplicationServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
