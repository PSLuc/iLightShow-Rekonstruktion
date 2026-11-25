package S;

import java.util.Iterator;
import java.util.Map;
import p058l0.F;
import p058l0.H;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4870h = 0;
    public final Iterator i;

    public h(e eVar) {
        o[] oVarArr = new o[8];
        for (int i = 0; i < 8; i++) {
            oVarArr[i] = new q(this);
        }
        this.i = new f(eVar, oVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4870h) {
            case 0:
                return ((f) this.i).f4859j;
            default:
                return this.i.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4870h) {
            case 0:
                return (Map.Entry) ((f) this.i).next();
            default:
                return (H) this.i.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4870h) {
            case 0:
                ((f) this.i).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public h(F f6) {
        this.i = f6.f10216q.iterator();
    }
}
