package X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Iterator, F4.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f5644h;
    public final Iterator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5645j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Map.Entry f5646k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map.Entry f5647l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5648m;

    public A(v vVar, Iterator it, int i) {
        this.f5648m = i;
        this.f5644h = vVar;
        this.i = it;
        this.f5645j = vVar.a().f5726d;
        a();
    }

    public final void a() {
        this.f5646k = this.f5647l;
        Iterator it = this.i;
        this.f5647l = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f5647l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5648m) {
            case 0:
                a();
                if (this.f5646k != null) {
                    return new z(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.f5647l;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.f5647l;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        v vVar = this.f5644h;
        if (vVar.a().f5726d != this.f5645j) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.f5646k;
        if (entry == null) {
            throw new IllegalStateException();
        }
        vVar.remove(entry.getKey());
        this.f5646k = null;
        this.f5645j = vVar.a().f5726d;
    }
}
