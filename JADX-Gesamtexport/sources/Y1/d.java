package Y1;

import B.AbstractC0013g0;
import T1.j;
import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class d extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f5830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H1.d f5831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f5832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5835h;

    public d(int i, d dVar, H1.d dVar2) {
        this.f5215a = i;
        this.f5830c = dVar;
        this.f5831d = dVar2;
        this.f5216b = -1;
    }

    @Override // T1.j
    public final String a() {
        return this.f5833f;
    }

    @Override // T1.j
    public final Object b() {
        return this.f5834g;
    }

    @Override // T1.j
    public final j c() {
        return this.f5830c;
    }

    @Override // T1.j
    public final void g(Object obj) {
        this.f5834g = obj;
    }

    public final d i(Object obj) {
        d dVar = this.f5832e;
        if (dVar == null) {
            H1.d dVar2 = this.f5831d;
            d dVar3 = new d(1, this, dVar2 != null ? dVar2.d() : null, obj);
            this.f5832e = dVar3;
            return dVar3;
        }
        dVar.f5215a = 1;
        dVar.f5216b = -1;
        dVar.f5833f = null;
        dVar.f5835h = false;
        dVar.f5834g = obj;
        H1.d dVar4 = dVar.f5831d;
        if (dVar4 != null) {
            dVar4.f1757h = null;
            dVar4.f1758j = null;
            dVar4.f1759k = null;
        }
        return dVar;
    }

    public final d j(Object obj) {
        d dVar = this.f5832e;
        if (dVar == null) {
            H1.d dVar2 = this.f5831d;
            d dVar3 = new d(2, this, dVar2 != null ? dVar2.d() : null, obj);
            this.f5832e = dVar3;
            return dVar3;
        }
        dVar.f5215a = 2;
        dVar.f5216b = -1;
        dVar.f5833f = null;
        dVar.f5835h = false;
        dVar.f5834g = obj;
        H1.d dVar4 = dVar.f5831d;
        if (dVar4 != null) {
            dVar4.f1757h = null;
            dVar4.f1758j = null;
            dVar4.f1759k = null;
        }
        return dVar;
    }

    public final int k(String str) {
        if (this.f5215a != 2 || this.f5835h) {
            return 4;
        }
        this.f5835h = true;
        this.f5833f = str;
        H1.d dVar = this.f5831d;
        if (dVar == null || !dVar.l(str)) {
            return this.f5216b < 0 ? 0 : 1;
        }
        String strI = AbstractC0013g0.i("Duplicate field '", str, "'");
        Closeable closeable = (Closeable) dVar.i;
        throw new JsonGenerationException(strI, closeable instanceof T1.e ? (T1.e) closeable : null);
    }

    public final int l() {
        int i = this.f5215a;
        if (i == 2) {
            if (!this.f5835h) {
                return 5;
            }
            this.f5835h = false;
            this.f5216b++;
            return 2;
        }
        if (i == 1) {
            int i3 = this.f5216b;
            this.f5216b = i3 + 1;
            if (i3 >= 0) {
                return 1;
            }
        } else {
            int i6 = this.f5216b + 1;
            this.f5216b = i6;
            if (i6 != 0) {
                return 3;
            }
        }
        return 0;
    }

    public d(int i, d dVar, H1.d dVar2, Object obj) {
        this.f5215a = i;
        this.f5830c = dVar;
        this.f5831d = dVar2;
        this.f5216b = -1;
        this.f5834g = obj;
    }
}
