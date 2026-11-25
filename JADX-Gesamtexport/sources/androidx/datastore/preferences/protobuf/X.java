package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class X extends AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f6830m = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f6831h;
    public Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f6832j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile a0 f6833k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Map f6834l;

    public static X g() {
        X x6 = new X();
        x6.f6831h = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        x6.i = map;
        x6.f6834l = map;
        return x6;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i3;
        int i6;
        int iCompareTo;
        int size = this.f6831h.size();
        int i7 = size - 1;
        if (i7 < 0) {
            i = 0;
            while (i <= i7) {
                i6 = (i + i7) / 2;
                iCompareTo = comparable.compareTo(((Y) this.f6831h.get(i6)).f6835h);
                if (iCompareTo < 0) {
                    i7 = i6 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i6;
                    }
                    i = i6 + 1;
                }
            }
            i3 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((Y) this.f6831h.get(i7)).f6835h);
            if (iCompareTo2 > 0) {
                i3 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i7;
                }
                i = 0;
                while (i <= i7) {
                    i6 = (i + i7) / 2;
                    iCompareTo = comparable.compareTo(((Y) this.f6831h.get(i6)).f6835h);
                    if (iCompareTo < 0) {
                        i7 = i6 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i6;
                        }
                        i = i6 + 1;
                    }
                }
                i3 = i + 1;
            }
        }
        return -i3;
    }

    public final void b() {
        if (this.f6832j) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.f6831h.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.f6831h.isEmpty()) {
            this.f6831h.clear();
        }
        if (this.i.isEmpty()) {
            return;
        }
        this.i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.i.containsKey(comparable);
    }

    public final Set e() {
        return this.i.isEmpty() ? Collections.EMPTY_SET : this.i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f6833k == null) {
            this.f6833k = new a0(this, 0);
        }
        return this.f6833k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return super.equals(obj);
        }
        X x6 = (X) obj;
        int size = size();
        if (size == x6.size()) {
            int size2 = this.f6831h.size();
            if (size2 != x6.f6831h.size()) {
                return ((AbstractSet) entrySet()).equals(x6.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(x6.c(i))) {
                }
            }
            if (size2 != size) {
                return this.i.equals(x6.i);
            }
            return true;
        }
        return false;
    }

    public final SortedMap f() {
        b();
        if (this.i.isEmpty() && !(this.i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.i = treeMap;
            this.f6834l = treeMap.descendingMap();
        }
        return (SortedMap) this.i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((Y) this.f6831h.get(iA)).i : this.i.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((Y) this.f6831h.get(iA)).setValue(obj);
        }
        b();
        if (this.f6831h.isEmpty() && !(this.f6831h instanceof ArrayList)) {
            this.f6831h = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return f().put(comparable, obj);
        }
        if (this.f6831h.size() == 16) {
            Y y2 = (Y) this.f6831h.remove(15);
            f().put(y2.f6835h, y2.i);
        }
        this.f6831h.add(i, new Y(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f6831h.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((Y) this.f6831h.get(i)).hashCode();
        }
        return this.i.size() > 0 ? this.i.hashCode() + iHashCode : iHashCode;
    }

    public final Object i(int i) {
        b();
        Object obj = ((Y) this.f6831h.remove(i)).i;
        if (!this.i.isEmpty()) {
            Iterator it = f().entrySet().iterator();
            List list = this.f6831h;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new Y(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return i(iA);
        }
        if (this.i.isEmpty()) {
            return null;
        }
        return this.i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.i.size() + this.f6831h.size();
    }
}
