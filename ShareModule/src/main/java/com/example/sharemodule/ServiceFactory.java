package com.example.sharemodule;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private ILoginService mLoginService;
    private IShoppingService mShoppingService;

    private ServiceFactory(){}

    public static ServiceFactory getInstance() {
        return instance;
    }

    public ILoginService getLoginService() {
        if (mLoginService == null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IShoppingService getShoppingService() {
        if (mShoppingService == null){
            mShoppingService = new EmptyShoppingService();
        }
        return mShoppingService;
    }

    public void setSignService(IShoppingService mSignService) {
        this.mShoppingService = mSignService;
    }
}
