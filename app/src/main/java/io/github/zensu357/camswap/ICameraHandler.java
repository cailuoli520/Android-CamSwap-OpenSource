package io.github.zensu357.camswap;

import de.robv.android.xposed.callbacks.XC_LoadPackage;

public interface ICameraHandler {
    void init(XC_LoadPackage.LoadPackageParam lpparam);
}
