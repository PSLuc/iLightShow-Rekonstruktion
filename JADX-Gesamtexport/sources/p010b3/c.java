package p010b3;

import B.C0025m0;
import D.x;
import F.L;
import K.y;
import W2.g;
import X2.b;
import Y2.a;
import Y2.p;
import Z2.f;
import Z2.h;
import Z2.i;
import Z2.n;
import android.content.Context;
import android.os.Build;
import p038g3.d;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final x i = new x(new b(), new f(16, false));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f7098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f7099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f7100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f7102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Y2.c f7103h;

    public c(Context context, x xVar, b bVar) {
        i iVar = i.f6033a;
        n.c("Null context is not permitted.", context);
        n.c("Api must not be null.", xVar);
        n.c("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", bVar);
        Context applicationContext = context.getApplicationContext();
        n.c("The provided context did not have an application context.", applicationContext);
        this.f7096a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f7097b = attributionTag;
        this.f7098c = xVar;
        this.f7099d = iVar;
        this.f7100e = new a(xVar, attributionTag);
        Y2.c cVarD = Y2.c.d(applicationContext);
        this.f7103h = cVarD;
        this.f7101f = cVarD.f5882h.getAndIncrement();
        this.f7102g = bVar.f5766a;
        d dVar = cVarD.f5886m;
        dVar.sendMessage(dVar.obtainMessage(7, this));
    }

    public final y a(h hVar) {
        C0025m0 c0025m0 = new C0025m0(13, false);
        W2.c[] cVarArr = {p038g3.b.f9180a};
        c0025m0.i = new C0025m0(21, hVar);
        L l6 = new L(c0025m0, cVarArr, false);
        p060l3.b bVar = new p060l3.b();
        Y2.c cVar = this.f7103h;
        cVar.getClass();
        Y2.n nVar = new Y2.n(new p(l6, bVar, this.f7102g), cVar.i.get(), this);
        d dVar = cVar.f5886m;
        dVar.sendMessage(dVar.obtainMessage(4, nVar));
        return bVar.f10375a;
    }
}
