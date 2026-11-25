package com.philips.lighting.hue.sdk.wrapper.uicallback;

/* JADX INFO: loaded from: classes.dex */
public class UICallbackDelegator {
    private static UICallbackDelegator instance;
    private UICallbackHandler mHandler = null;

    private UICallbackDelegator() {
    }

    public static UICallbackDelegator getInstance() {
        if (instance == null) {
            instance = new UICallbackDelegator();
        }
        return instance;
    }

    public static boolean perform(Runnable runnable) {
        if (getInstance().getHandler() != null) {
            return getInstance().getHandler().post(runnable);
        }
        runnable.run();
        return true;
    }

    public UICallbackHandler getHandler() {
        return this.mHandler;
    }

    public void setHandler(UICallbackHandler uICallbackHandler) {
        this.mHandler = uICallbackHandler;
    }
}
