package com.example.sharemodule;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class EmptyShoppingService implements IShoppingService  {
    @Override
    public void launch(Context ctx, String userId) {

    }

    @Override
    public Fragment newBillFragment(FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }
}
