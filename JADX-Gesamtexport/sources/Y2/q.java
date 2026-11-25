package Y2;

import D.x;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class q extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p060l3.b f5914b;

    public q(p060l3.b bVar) {
        super(4);
        this.f5914b = bVar;
    }

    @Override // Y2.l
    public final boolean a(h hVar) {
        if (hVar.f5897f.get(null) == null) {
            return false;
        }
        throw new ClassCastException();
    }

    @Override // Y2.l
    public final W2.c[] b(h hVar) {
        if (hVar.f5897f.get(null) == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // Y2.l
    public final void c(Status status) {
        this.f5914b.a(new ApiException(status));
    }

    @Override // Y2.l
    public final void d(RuntimeException runtimeException) {
        this.f5914b.a(runtimeException);
    }

    @Override // Y2.l
    public final void e(h hVar) throws DeadObjectException {
        try {
            h(hVar);
        } catch (DeadObjectException e6) {
            c(l.g(e6));
            throw e6;
        } catch (RemoteException e7) {
            c(l.g(e7));
        } catch (RuntimeException e8) {
            this.f5914b.a(e8);
        }
    }

    @Override // Y2.l
    public final /* bridge */ /* synthetic */ void f(x xVar, boolean z5) {
    }

    public final void h(h hVar) {
        if (hVar.f5897f.remove(null) != null) {
            throw new ClassCastException();
        }
        this.f5914b.b(Boolean.FALSE);
    }
}
