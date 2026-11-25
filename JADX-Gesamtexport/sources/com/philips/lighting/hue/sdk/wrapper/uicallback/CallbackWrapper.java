package com.philips.lighting.hue.sdk.wrapper.uicallback;

/* JADX INFO: loaded from: classes.dex */
public abstract class CallbackWrapper {
    protected boolean runOnUI = true;

    public boolean post(Runnable runnable) {
        if (this.runOnUI) {
            return UICallbackDelegator.perform(runnable);
        }
        runnable.run();
        return true;
    }
}
