package p011b4;

import R3.d;
import Y3.a;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7110h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f7111j;

    public /* synthetic */ e(Object obj, int i, Object obj2) {
        this.f7110h = i;
        this.i = obj;
        this.f7111j = obj2;
    }

    @Override // R3.d
    public final void c(R3.e eVar) {
        switch (this.f7110h) {
            case 0:
                a aVar = new a(eVar);
                eVar.d(aVar);
                ((g) this.f7111j).b((d) aVar.f5919j);
                ((d) this.i).b(aVar);
                return;
            default:
                a aVar2 = new a(eVar, 2, (v5.a) this.f7111j);
                AbstractC0599v0 abstractC0599v0 = (AbstractC0599v0) this.i;
                abstractC0599v0.getClass();
                try {
                    abstractC0599v0.M(aVar2);
                    return;
                } catch (NullPointerException e6) {
                    throw e6;
                } catch (Throwable th) {
                    p027e3.a.w0(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
        }
    }
}
