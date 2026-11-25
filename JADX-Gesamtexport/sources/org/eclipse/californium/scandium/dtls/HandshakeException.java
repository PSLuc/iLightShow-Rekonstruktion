package org.eclipse.californium.scandium.dtls;

import p5.C0838c;

/* JADX INFO: loaded from: classes.dex */
public class HandshakeException extends Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0838c f10704h;

    public HandshakeException(String str, C0838c c0838c) {
        super(str);
        this.f10704h = c0838c;
    }

    public HandshakeException(String str, C0838c c0838c, Exception exc) {
        super(str, exc);
        this.f10704h = c0838c;
    }
}
