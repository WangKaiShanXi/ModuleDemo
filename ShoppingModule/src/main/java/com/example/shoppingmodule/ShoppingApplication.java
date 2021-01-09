package com.example.shoppingmodule;

import android.app.Application;

import com.example.sharemodule.IComponentApplication;
import com.example.sharemodule.ServiceFactory;


public class ShoppingApplication extends Application implements IComponentApplication {
    private static Application application;

    public static Application getApplication() {
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    public void initialize(Application app) {
        application = app;
        ServiceFactory.getInstance().setSignService(new ShoppingService());
    }
}