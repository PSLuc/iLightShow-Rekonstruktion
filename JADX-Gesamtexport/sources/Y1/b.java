package Y1;

import B.AbstractC0013g0;
import T1.i;
import T1.j;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H1.d f5820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f5821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f5822f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5823g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5824h;
    public int i;

    public b(b bVar, H1.d dVar, int i, int i3, int i6) {
        this.f5819c = bVar;
        this.f5820d = dVar;
        this.f5215a = i;
        this.f5824h = i3;
        this.i = i6;
        this.f5216b = -1;
    }

    @Override // T1.j
    public final String a() {
        return this.f5822f;
    }

    @Override // T1.j
    public final Object b() {
        return this.f5823g;
    }

    @Override // T1.j
    public final j c() {
        return this.f5819c;
    }

    @Override // T1.j
    public final void g(Object obj) {
        this.f5823g = obj;
    }

    public final b i(int i, int i3) {
        b bVar = this.f5821e;
        if (bVar == null) {
            H1.d dVar = this.f5820d;
            b bVar2 = new b(this, dVar != null ? dVar.d() : null, 1, i, i3);
            this.f5821e = bVar2;
            return bVar2;
        }
        bVar.f5215a = 1;
        bVar.f5216b = -1;
        bVar.f5824h = i;
        bVar.i = i3;
        bVar.f5822f = null;
        bVar.f5823g = null;
        H1.d dVar2 = bVar.f5820d;
        if (dVar2 != null) {
            dVar2.f1757h = null;
            dVar2.f1758j = null;
            dVar2.f1759k = null;
        }
        return bVar;
    }

    public final b j(int i, int i3) {
        b bVar = this.f5821e;
        if (bVar == null) {
            H1.d dVar = this.f5820d;
            b bVar2 = new b(this, dVar != null ? dVar.d() : null, 2, i, i3);
            this.f5821e = bVar2;
            return bVar2;
        }
        bVar.f5215a = 2;
        bVar.f5216b = -1;
        bVar.f5824h = i;
        bVar.i = i3;
        bVar.f5822f = null;
        bVar.f5823g = null;
        H1.d dVar2 = bVar.f5820d;
        if (dVar2 != null) {
            dVar2.f1757h = null;
            dVar2.f1758j = null;
            dVar2.f1759k = null;
        }
        return bVar;
    }

    public final void k(String str) throws JsonParseException {
        this.f5822f = str;
        H1.d dVar = this.f5820d;
        if (dVar == null || !dVar.l(str)) {
            return;
        }
        Closeable closeable = (Closeable) dVar.i;
        throw new JsonParseException(closeable instanceof i ? (i) closeable : null, AbstractC0013g0.i("Duplicate field '", str, "'"));
    }
}
