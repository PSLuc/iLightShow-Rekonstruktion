package p080p;

import E4.k;
import androidx.datastore.preferences.protobuf.a0;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0833e extends E implements Map {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0 f10730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0830b f10731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0832d f10732m;

    @Override // java.util.Map
    public final Set entrySet() {
        a0 a0Var = this.f10730k;
        if (a0Var != null) {
            return a0Var;
        }
        a0 a0Var2 = new a0(this, 1);
        this.f10730k = a0Var2;
        return a0Var2;
    }

    public final boolean j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(Collection collection) {
        int i = this.f10717j;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f10717j;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0830b c0830b = this.f10731l;
        if (c0830b != null) {
            return c0830b;
        }
        C0830b c0830b2 = new C0830b(this);
        this.f10731l = c0830b2;
        return c0830b2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f10717j;
        int i = this.f10717j;
        int[] iArr = this.f10716h;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            k.e("copyOf(this, newSize)", iArrCopyOf);
            this.f10716h = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.i, size * 2);
            k.e("copyOf(this, newSize)", objArrCopyOf);
            this.i = objArrCopyOf;
        }
        if (this.f10717j != i) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0832d c0832d = this.f10732m;
        if (c0832d != null) {
            return c0832d;
        }
        C0832d c0832d2 = new C0832d(this);
        this.f10732m = c0832d2;
        return c0832d2;
    }
}
