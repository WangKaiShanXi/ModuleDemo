package com.example.sharemodule;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public interface IShoppingService {
    void launch(Context ctx, String userId);
    Fragment newBillFragment(FragmentManager fragmentManager, int viewId, Bundle bundle);
}
