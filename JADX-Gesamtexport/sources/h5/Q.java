package h5;

import java.io.IOException;
import java.util.LinkedHashMap;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f9334e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f9335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f9336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f9337d;

    static {
        String str = C.i;
        f9334e = W2.g.k("/", false);
    }

    public Q(C c6, y yVar, LinkedHashMap linkedHashMap) {
        E4.k.f("fileSystem", yVar);
        this.f9335b = c6;
        this.f9336c = yVar;
        this.f9337d = linkedHashMap;
    }

    @Override // h5.r
    public final C0739q b(C c6) throws Throwable {
        G gC;
        E4.k.f("path", c6);
        C c7 = f9334e;
        c7.getClass();
        i5.e eVar = (i5.e) this.f9337d.get(i5.c.b(c7, c6, true));
        Throwable th = null;
        if (eVar == null) {
            return null;
        }
        boolean z5 = eVar.f9603b;
        C0739q c0739q = new C0739q(!z5, z5, z5 ? null : Long.valueOf(eVar.f9604c), null, eVar.f9605d, null);
        long j4 = eVar.f9606e;
        if (j4 == -1) {
            return c0739q;
        }
        x xVarE = this.f9336c.e(this.f9335b);
        try {
            gC = AbstractC0724b.c(xVarE.k(j4));
            try {
                xVarE.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            try {
                xVarE.close();
            } catch (Throwable th4) {
                p081p0.c.D(th3, th4);
            }
            th = th3;
            gC = null;
        }
        if (th != null) {
            throw th;
        }
        E4.k.c(gC);
        E4.w wVar = new E4.w();
        wVar.f1074h = c0739q.f9365e;
        E4.w wVar2 = new E4.w();
        E4.w wVar3 = new E4.w();
        int iC = gC.c();
        if (iC != 67324752) {
            throw new IOException("bad zip: expected " + i5.b.c(67324752) + " but was " + i5.b.c(iC));
        }
        gC.l(2L);
        short sO = gC.o();
        int i = sO & 65535;
        if ((sO & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + i5.b.c(i));
        }
        gC.l(18L);
        long jO = ((long) gC.o()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        int iO = gC.o() & 65535;
        gC.l(jO);
        i5.b.e(gC, iO, new i5.h(gC, wVar, wVar2, wVar3));
        C0739q c0739q2 = new C0739q(c0739q.f9361a, c0739q.f9362b, c0739q.f9363c, (Long) wVar3.f1074h, (Long) wVar.f1074h, (Long) wVar2.f1074h);
        E4.k.c(c0739q2);
        return c0739q2;
    }
}
