package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public class SessionPhantomReference extends PhantomReference<SessionObject> {
    private long sessionKey;

    public SessionPhantomReference(SessionObject sessionObject, ReferenceQueue<SessionObject> referenceQueue) {
        super(sessionObject, referenceQueue);
        this.sessionKey = sessionObject.getSessionKey();
    }

    public long getSessionKey() {
        return this.sessionKey;
    }
}
