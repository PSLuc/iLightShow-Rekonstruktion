package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z implements Iterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6837h = -1;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Iterator f6838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ X f6839k;

    public Z(X x6) {
        this.f6839k = x6;
    }

    public final Iterator a() {
        if (this.f6838j == null) {
            this.f6838j = this.f6839k.i.entrySet().iterator();
        }
        return this.f6838j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6837h + 1;
        X x6 = this.f6839k;
        return i < x6.f6831h.size() || (!x6.i.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.i = true;
        int i = this.f6837h + 1;
        this.f6837h = i;
        X x6 = this.f6839k;
        return i < x6.f6831h.size() ? (Map.Entry) x6.f6831h.get(this.f6837h) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.i) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.i = false;
        int i = X.f6830m;
        X x6 = this.f6839k;
        x6.b();
        if (this.f6837h >= x6.f6831h.size()) {
            a().remove();
            return;
        }
        int i3 = this.f6837h;
        this.f6837h = i3 - 1;
        x6.i(i3);
    }
}
