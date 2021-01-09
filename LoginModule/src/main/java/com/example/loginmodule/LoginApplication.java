package com.example.loginmodule;

import android.app.Application;

import com.example.sharemodule.IComponentApplication;
import com.example.sharemodule.ServiceFactory;


public class LoginApplication extends Application implements IComponentApplication {

    private static Application application;

    public static Application getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setLoginService(new LoginService());
    }
}
