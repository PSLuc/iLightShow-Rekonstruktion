package com.nanjoran.ilightshow.Services;

import P4.AbstractC0336x;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioRecord;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.nanjoran.ilightshow.Services.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0693t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ K4.e[] f8481h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P4.i0 f8484c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final U4.d f8486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AudioRecord f8487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public P4.i0 f8488g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final defpackage.t f8482a = new defpackage.t("microphoneEnabled", E4.x.a(Boolean.TYPE), Boolean.FALSE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f8483b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8485d = 10;

    static {
        E4.n nVar = new E4.n(C0693t.class, "microphoneEnabled", "getMicrophoneEnabled()Z", 0);
        E4.x.f1075a.getClass();
        f8481h = new K4.e[]{nVar};
    }

    public C0693t() {
        P4.j0 j0VarB = AbstractC0336x.b();
        W4.d dVar = P4.D.f4604a;
        dVar.getClass();
        this.f8486e = AbstractC0336x.a(S1.h0.u(dVar, j0VarB));
    }

    public static final void a(C0693t c0693t, Context context) {
        if (c0693t.b()) {
            AtomicBoolean atomicBoolean = c0693t.f8483b;
            if (!atomicBoolean.get() && com.fasterxml.jackson.databind.deser.std.d0.j(context, "android.permission.RECORD_AUDIO") == 0) {
                if (c0693t.f8487f == null) {
                    c0693t.f8487f = new AudioRecord.Builder().setAudioSource(9).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(16).build()).build();
                }
                AudioRecord audioRecord = c0693t.f8487f;
                if (audioRecord == null) {
                    return;
                }
                atomicBoolean.set(true);
                c0693t.f8484c = AbstractC0336x.o(AbstractC0336x.a(P4.D.f4606c), null, new C0692s(c0693t, audioRecord, null), 3);
            }
        }
    }

    public final boolean b() {
        return ((Boolean) this.f8482a.a(f8481h[0])).booleanValue();
    }

    public final void c(boolean z5) {
        this.f8482a.b(f8481h[0], Boolean.valueOf(z5));
        M.f8305O.getClass();
        C0674i c0674i = C0674i.f8401h;
        C0674i.g();
    }
}
