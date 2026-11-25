package p080p;

import E4.k;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: p.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831c implements Iterator, Map.Entry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10726h;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0833e f10728k;

    public C0831c(C0833e c0833e) {
        this.f10728k = c0833e;
        this.f10726h = c0833e.f10717j - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f10727j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i = this.i;
        C0833e c0833e = this.f10728k;
        return k.a(key, c0833e.f(i)) && k.a(entry.getValue(), c0833e.i(this.i));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f10727j) {
            return this.f10728k.f(this.i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f10727j) {
            return this.f10728k.i(this.i);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.i < this.f10726h;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f10727j) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i = this.i;
        C0833e c0833e = this.f10728k;
        Object objF = c0833e.f(i);
        Object objI = c0833e.i(this.i);
        return (objF == null ? 0 : objF.hashCode()) ^ (objI != null ? objI.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.i++;
        this.f10727j = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f10727j) {
            throw new IllegalStateException();
        }
        this.f10728k.g(this.i);
        this.i--;
        this.f10726h--;
        this.f10727j = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f10727j) {
            return this.f10728k.h(this.i, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
