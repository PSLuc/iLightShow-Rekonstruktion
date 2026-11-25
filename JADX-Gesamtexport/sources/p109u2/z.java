package p109u2;

import T1.k;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k[] f12741e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z f12742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f12744c = new Object[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TreeMap f12745d;

    static {
        k[] kVarArr = new k[16];
        f12741e = kVarArr;
        k[] kVarArrValues = k.values();
        System.arraycopy(kVarArrValues, 1, kVarArr, 1, Math.min(15, kVarArrValues.length - 1));
    }

    public final z a(int i, k kVar) {
        if (i >= 16) {
            z zVar = new z();
            this.f12742a = zVar;
            zVar.f12743b = ((long) kVar.ordinal()) | zVar.f12743b;
            return this.f12742a;
        }
        long jOrdinal = kVar.ordinal();
        if (i > 0) {
            jOrdinal <<= i << 2;
        }
        this.f12743b |= jOrdinal;
        return null;
    }

    public final void b(Object obj, int i, Object obj2) {
        if (this.f12745d == null) {
            this.f12745d = new TreeMap();
        }
        if (obj != null) {
            this.f12745d.put(Integer.valueOf(i + i + 1), obj);
        }
        if (obj2 != null) {
            this.f12745d.put(Integer.valueOf(i + i), obj2);
        }
    }

    public final k c(int i) {
        long j4 = this.f12743b;
        if (i > 0) {
            j4 >>= i << 2;
        }
        return f12741e[((int) j4) & 15];
    }
}
