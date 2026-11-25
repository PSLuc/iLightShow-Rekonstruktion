package com.philips.lighting.hue.sdk.wrapper.entertainment;

import com.philips.lighting.hue.sdk.wrapper.WrapperObject;
import com.philips.lighting.hue.sdk.wrapper.domain.Bridge;
import com.philips.lighting.hue.sdk.wrapper.entertainment.effect.Effect;
import com.philips.lighting.hue.sdk.wrapper.entertainment.lightscript.LightScript;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Entertainment extends WrapperObject {
    private Map _observers = new HashMap();

    public Entertainment(Bridge bridge, String str) {
        create(bridge, str);
    }

    private ObserverImpl getObserverImpl(Observer observer) {
        if (this._observers.containsKey(observer)) {
            return (ObserverImpl) this._observers.get(observer);
        }
        ObserverImpl observerImpl = new ObserverImpl(observer);
        this._observers.put(observer, observerImpl);
        return observerImpl;
    }

    public final native void addEffect(Effect effect);

    public final native void addLightScript(LightScript lightScript);

    public native void create(Bridge bridge, int i, String str);

    public native void create(Bridge bridge, String str);

    @Override // com.philips.lighting.hue.sdk.wrapper.WrapperObject
    public native void delete();

    public final native Effect getEffectByName(String str);

    public final native void lockMixer();

    public void registerObserver(Observer observer, Message.Type type) {
        registerObserver(observer, type.flag);
    }

    public final native void registerObserver(ObserverImpl observerImpl, int i);

    public final native void selectGroup(String str);

    public final native void shutDown(Callback callback);

    public final native void start(StartCallback startCallback);

    public final native void stop(Callback callback);

    public final native void unlockMixer();

    public void unregisterObserver(Observer observer, Message.Type type) {
        unregisterObserver(observer, type.flag);
    }

    public final native void unregisterObserver(ObserverImpl observerImpl);

    public final native void unregisterObserver(ObserverImpl observerImpl, int i);

    public synchronized void registerObserver(Observer observer, int i) {
        registerObserver(getObserverImpl(observer), i);
    }

    public synchronized void unregisterObserver(Observer observer, int i) {
        unregisterObserver(getObserverImpl(observer), i);
    }

    public Entertainment(Bridge bridge, int i, String str) {
        create(bridge, i, str);
    }

    public synchronized void unregisterObserver(Observer observer) {
        unregisterObserver(getObserverImpl(observer));
        this._observers.remove(observer);
    }

    public Entertainment(WrapperObject.Scope scope) {
    }
}
