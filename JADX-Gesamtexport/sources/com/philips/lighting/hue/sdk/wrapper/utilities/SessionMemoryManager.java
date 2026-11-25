package com.philips.lighting.hue.sdk.wrapper.utilities;

import com.philips.lighting.hue.sdk.wrapper.SessionObject;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SessionMemoryManager {
    private static SessionMemoryManager _instance;
    private ReferenceQueue<SessionObject> _referenceQueue;
    private List<SessionPhantomReference> _referenceSessions;
    private boolean _threadIsRunning = false;

    private SessionMemoryManager() {
        this._referenceQueue = null;
        this._referenceSessions = null;
        this._referenceQueue = new ReferenceQueue<>();
        this._referenceSessions = new ArrayList();
    }

    public static void addSession(SessionObject sessionObject) {
        SessionMemoryManager sessionMemoryManager = getInstance();
        sessionMemoryManager.getReferenceSessions().add(new SessionPhantomReference(sessionObject, sessionMemoryManager.getReferenceQueue()));
        sessionMemoryManager.startReferenceRemovalThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void destroyNativeSession(long j4);

    private static synchronized SessionMemoryManager getInstance() {
        try {
            if (_instance == null) {
                _instance = new SessionMemoryManager();
            }
        } catch (Throwable th) {
            throw th;
        }
        return _instance;
    }

    private ReferenceQueue<SessionObject> getReferenceQueue() {
        return this._referenceQueue;
    }

    private List<SessionPhantomReference> getReferenceSessions() {
        return this._referenceSessions;
    }

    public static int getSessionCount() {
        return getInstance().getReferenceSessions().size();
    }

    private synchronized void startReferenceRemovalThread() {
        if (!this._threadIsRunning) {
            this._threadIsRunning = true;
            Thread thread = new Thread() { // from class: com.philips.lighting.hue.sdk.wrapper.utilities.SessionMemoryManager.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    while (SessionMemoryManager.this._threadIsRunning) {
                        try {
                            SessionPhantomReference sessionPhantomReference = (SessionPhantomReference) SessionMemoryManager.this._referenceQueue.remove();
                            SessionMemoryManager.this.destroyNativeSession(sessionPhantomReference.getSessionKey());
                            SessionMemoryManager.this._referenceSessions.remove(sessionPhantomReference);
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                }
            };
            thread.setDaemon(true);
            thread.start();
        }
    }
}
