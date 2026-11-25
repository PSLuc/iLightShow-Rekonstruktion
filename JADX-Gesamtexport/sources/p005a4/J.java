package p005a4;

import R3.a;
import R3.c;
import U3.b;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.util.concurrent.Callable;
import p043h4.d;
import p043h4.e;

/* JADX INFO: loaded from: classes.dex */
public final class J extends a {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f6202j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f6203k;

    public /* synthetic */ J(Object obj, b bVar, int i) {
        this.i = i;
        this.f6202j = obj;
        this.f6203k = bVar;
    }

    @Override // R3.a
    public final void f(c cVar) {
        switch (this.i) {
            case 0:
                try {
                    Object objApply = this.f6203k.apply(this.f6202j);
                    W3.b.a("The mapper returned a null Publisher", objApply);
                    u5.a aVar = (u5.a) objApply;
                    if (!(aVar instanceof Callable)) {
                        aVar.a(cVar);
                        return;
                    }
                    try {
                        Object objCall = ((Callable) aVar).call();
                        if (objCall != null) {
                            cVar.h(new e(cVar, objCall));
                            return;
                        } else {
                            cVar.h(d.f9305h);
                            cVar.b();
                            return;
                        }
                    } catch (Throwable th) {
                        p027e3.a.w0(th);
                        d.a(th, cVar);
                        return;
                    }
                } catch (Throwable th2) {
                    d.a(th2, cVar);
                    return;
                }
            default:
                p022d4.c cVar2 = new p022d4.c(cVar, (v5.a) this.f6203k);
                AbstractC0599v0 abstractC0599v0 = (AbstractC0599v0) this.f6202j;
                abstractC0599v0.getClass();
                try {
                    abstractC0599v0.M(cVar2);
                    return;
                } catch (NullPointerException e6) {
                    throw e6;
                } catch (Throwable th3) {
                    p027e3.a.w0(th3);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th3);
                    throw nullPointerException;
                }
        }
    }
}
