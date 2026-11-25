package K0;

import E4.k;
import E4.z;
import W2.g;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedHashSet;
import p089q4.l;
import p119w1.p;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f2042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2043f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2044g;

    public b() {
        this.f2038a = 0;
        this.f2042e = new g(8);
        this.f2043f = new HashMap(0, 0.75f);
        this.f2044g = new LinkedHashSet();
    }

    public Object a(Object obj) {
        synchronized (((g) this.f2042e)) {
            Object obj2 = ((HashMap) this.f2043f).get(obj);
            if (obj2 == null) {
                this.f2041d++;
                return null;
            }
            ((LinkedHashSet) this.f2044g).remove(obj);
            ((LinkedHashSet) this.f2044g).add(obj);
            this.f2040c++;
            return obj2;
        }
    }

    public Object b(Object obj, Object obj2) {
        Object objPut;
        Object objW;
        Object obj3;
        if (obj == null) {
            throw null;
        }
        synchronized (((g) this.f2042e)) {
            try {
                this.f2039b = f() + 1;
                objPut = ((HashMap) this.f2043f).put(obj, obj2);
                if (objPut != null) {
                    this.f2039b = f() - 1;
                }
                if (((LinkedHashSet) this.f2044g).contains(obj)) {
                    ((LinkedHashSet) this.f2044g).remove(obj);
                }
                ((LinkedHashSet) this.f2044g).add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        while (true) {
            synchronized (((g) this.f2042e)) {
                try {
                    if (f() >= 0 && (!((HashMap) this.f2043f).isEmpty() || f() == 0)) {
                        if (((HashMap) this.f2043f).isEmpty() != ((LinkedHashSet) this.f2044g).isEmpty()) {
                            break;
                        }
                        if (f() <= 16 || ((HashMap) this.f2043f).isEmpty()) {
                            objW = null;
                            obj3 = null;
                        } else {
                            objW = l.W((LinkedHashSet) this.f2044g);
                            obj3 = ((HashMap) this.f2043f).get(objW);
                            if (obj3 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            z.c((HashMap) this.f2043f).remove(objW);
                            z.a((LinkedHashSet) this.f2044g).remove(objW);
                            int iF = f();
                            k.c(objW);
                            this.f2039b = iF - 1;
                        }
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objW == null && obj3 == null) {
                return objPut;
            }
            k.c(objW);
            k.c(obj3);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public Object c(Object obj) {
        Object objRemove;
        synchronized (((g) this.f2042e)) {
            objRemove = ((HashMap) this.f2043f).remove(obj);
            ((LinkedHashSet) this.f2044g).remove(obj);
            if (objRemove != null) {
                this.f2039b = f() - 1;
            }
        }
        return objRemove;
    }

    public void d() {
        this.f2039b = 1;
        this.f2043f = (p) this.f2042e;
        this.f2041d = 0;
    }

    public boolean e() {
        p125x1.a aVarB = ((p) this.f2043f).f13443b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) aVarB.f11788k).get(iA + aVarB.f11786h) == 0) || this.f2040c == 65039;
    }

    public int f() {
        int i;
        synchronized (((g) this.f2042e)) {
            i = this.f2039b;
        }
        return i;
    }

    public String toString() {
        String str;
        switch (this.f2038a) {
            case 0:
                synchronized (((g) this.f2042e)) {
                    try {
                        int i = this.f2040c;
                        int i3 = this.f2041d + i;
                        str = "LruCache[maxSize=16,hits=" + this.f2040c + ",misses=" + this.f2041d + ",hitRate=" + (i3 != 0 ? (i * 100) / i3 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public b(p pVar) {
        this.f2038a = 1;
        this.f2039b = 1;
        this.f2042e = pVar;
        this.f2043f = pVar;
    }
}
