package com.example.loginmodule;

import android.content.Context;
import android.content.Intent;

import com.example.sharemodule.ILoginService;


public class LoginService implements ILoginService {
    @Override
    public void launch(Context ctx, String targetClass) {
        Intent intent = new Intent(ctx, LoginActivity.class);
        ctx.startActivity(intent);
    }
}
