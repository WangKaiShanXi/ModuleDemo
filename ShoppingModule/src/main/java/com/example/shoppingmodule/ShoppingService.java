package com.example.shoppingmodule;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.sharemodule.IShoppingService;


public class ShoppingService implements IShoppingService {

    @Override
    public void launch(Context ctx, String string) {
        Intent intent = new Intent(ctx, ShoppingActivity.class);
        ctx.startActivity(intent);
    }

    @Override
    public Fragment newBillFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        BillFragment fragment = new BillFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().replace(viewId, fragment).commit();
        return fragment;
    }
}