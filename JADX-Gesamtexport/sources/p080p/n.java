package p080p;

import E4.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p035g0.C0715p;
import p085q.a;
import p085q.b;
import p089q4.l;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0715p f10747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f10748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10751f;

    public n(int i) {
        this.f10746a = i;
        if (i <= 0) {
            a.c("maxSize <= 0");
            throw null;
        }
        this.f10747b = new C0715p(16);
        this.f10748c = new b(0);
    }

    public final Object a(Object obj) {
        k.f("key", obj);
        synchronized (this.f10748c) {
            C0715p c0715p = this.f10747b;
            c0715p.getClass();
            Object obj2 = ((LinkedHashMap) c0715p.i).get(obj);
            if (obj2 != null) {
                this.f10750e++;
                return obj2;
            }
            this.f10751f++;
            return null;
        }
    }

    public final Object b(Object obj, Object obj2) {
        Object objPut;
        k.f("key", obj);
        synchronized (this.f10748c) {
            this.f10749d++;
            C0715p c0715p = this.f10747b;
            c0715p.getClass();
            objPut = ((LinkedHashMap) c0715p.i).put(obj, obj2);
            if (objPut != null) {
                this.f10749d--;
            }
        }
        int i = this.f10746a;
        while (true) {
            synchronized (this.f10748c) {
                try {
                    if (this.f10749d < 0 || (((LinkedHashMap) this.f10747b.i).isEmpty() && this.f10749d != 0)) {
                        break;
                    }
                    if (this.f10749d > i && !((LinkedHashMap) this.f10747b.i).isEmpty()) {
                        Set setEntrySet = ((LinkedHashMap) this.f10747b.i).entrySet();
                        k.e("map.entries", setEntrySet);
                        Map.Entry entry = (Map.Entry) l.Y(setEntrySet);
                        if (entry == null) {
                            return objPut;
                        }
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        C0715p c0715p2 = this.f10747b;
                        c0715p2.getClass();
                        k.f("key", key);
                        ((LinkedHashMap) c0715p2.i).remove(key);
                        int i3 = this.f10749d;
                        k.f("value", value);
                        this.f10749d = i3 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public final String toString() {
        String str;
        synchronized (this.f10748c) {
            try {
                int i = this.f10750e;
                int i3 = this.f10751f + i;
                str = "LruCache[maxSize=" + this.f10746a + ",hits=" + this.f10750e + ",misses=" + this.f10751f + ",hitRate=" + (i3 != 0 ? (i * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
