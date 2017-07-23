package com.gwtApplication.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("GwtApplicationService")
public interface GwtApplicationService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use GwtApplicationService.App.getInstance() to access static instance of GwtApplicationServiceAsync
     */
    public static class App {
        private static GwtApplicationServiceAsync ourInstance = GWT.create(GwtApplicationService.class);

        public static synchronized GwtApplicationServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
