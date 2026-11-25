package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;

/* JADX INFO: loaded from: classes.dex */
class ObserverImpl extends WrapperObject implements Observer {
    private Observer observer;

    public ObserverImpl(Observer observer) {
        this.observer = observer;
        create(this);
    }

    public native void create(Observer observer);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    @Override // com.philips.lighting.hue.sdk.wrapper.entertainment.Observer
    public void onMessage(Message message) {
        Observer observer = this.observer;
        if (observer != null) {
            observer.onMessage(message);
        }
    }

    public ObserverImpl(WrapperObject.Scope scope) {
        this.observer = null;
    }
}
