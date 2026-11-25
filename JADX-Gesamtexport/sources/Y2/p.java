package Y2;

import D.x;
import F.L;
import K.y;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f5911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p060l3.b f5912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W2.g f5913d;

    public p(L l6, p060l3.b bVar, W2.g gVar) {
        super(2);
        this.f5912c = bVar;
        this.f5911b = l6;
        this.f5913d = gVar;
        if (l6.f1105b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // Y2.l
    public final boolean a(h hVar) {
        return this.f5911b.f1105b;
    }

    @Override // Y2.l
    public final W2.c[] b(h hVar) {
        return (W2.c[]) this.f5911b.f1106c;
    }

    @Override // Y2.l
    public final void c(Status status) {
        this.f5913d.getClass();
        this.f5912c.a(status.f7778j != null ? new ResolvableApiException(status) : new ApiException(status));
    }

    @Override // Y2.l
    public final void d(RuntimeException runtimeException) {
        this.f5912c.a(runtimeException);
    }

    @Override // Y2.l
    public final void e(h hVar) throws DeadObjectException {
        p060l3.b bVar = this.f5912c;
        try {
            this.f5911b.e(hVar.f5893b, bVar);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e7) {
            c(l.g(e7));
        } catch (RuntimeException e8) {
            bVar.a(e8);
        }
    }

    @Override // Y2.l
    public final void f(x xVar, boolean z5) {
        Boolean boolValueOf = Boolean.valueOf(z5);
        Map map = (Map) xVar.f707j;
        p060l3.b bVar = this.f5912c;
        map.put(bVar, boolValueOf);
        y yVar = bVar.f10375a;
        x xVar2 = new x(22, xVar, bVar, false);
        yVar.getClass();
        p060l3.d dVar = new p060l3.d(p060l3.c.f10376a, xVar2);
        L l6 = (L) yVar.f2033d;
        synchronized (l6.f1106c) {
            try {
                if (((ArrayDeque) l6.f1107d) == null) {
                    l6.f1107d = new ArrayDeque();
                }
                ((ArrayDeque) l6.f1107d).add(dVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (yVar.f2032c) {
            try {
                if (yVar.f2031b) {
                    ((L) yVar.f2033d).m(yVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
