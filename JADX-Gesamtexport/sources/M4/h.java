package M4;

import X.E;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p089q4.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3541h;
    public final Object i;

    public /* synthetic */ h(int i, Object obj) {
        this.f3541h = i;
        this.i = obj;
    }

    @Override // p089q4.AbstractC0861a
    public final int c() {
        switch (this.f3541h) {
            case 0:
                return ((i) this.i).f3542a.groupCount() + 1;
            default:
                return ((List) this.i).size();
        }
    }

    @Override // p089q4.AbstractC0861a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f3541h) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.f3541h) {
            case 0:
                String strGroup = ((i) this.i).f3542a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                if (i >= 0 && i <= p089q4.m.L(this)) {
                    return ((List) this.i).get(p089q4.m.L(this) - i);
                }
                StringBuilder sbV = p012c.k.v(i, "Element index ", " must be in range [");
                sbV.append(new J4.d(0, p089q4.m.L(this), 1));
                sbV.append("].");
                throw new IndexOutOfBoundsException(sbV.toString());
        }
    }

    @Override // p089q4.d, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f3541h) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // p089q4.d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f3541h) {
            case 1:
                return new E(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // p089q4.d, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f3541h) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // p089q4.d, java.util.List
    public ListIterator listIterator() {
        switch (this.f3541h) {
            case 1:
                return new E(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override // p089q4.d, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.f3541h) {
            case 1:
                return new E(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
