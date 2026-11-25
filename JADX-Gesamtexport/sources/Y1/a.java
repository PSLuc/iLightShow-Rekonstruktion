package Y1;

import B.AbstractC0013g0;
import V1.h;
import p015c2.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends U1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f5812t = V1.b.f5491h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final I1.b f5813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f5814o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5815p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h f5816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5818s;

    public a(I1.b bVar, int i, u uVar) {
        this.f5305j = i;
        this.i = uVar;
        this.f5307l = new d(0, null, T1.d.STRICT_DUPLICATE_DETECTION.a(i) ? new H1.d(this) : null);
        this.f5306k = T1.d.WRITE_NUMBERS_AS_STRINGS.a(i);
        this.f5814o = f5812t;
        this.f5816q = p009b2.f.f7068o;
        this.f5813n = bVar;
        if (T1.d.ESCAPE_NON_ASCII.a(i)) {
            this.f5815p = 127;
        }
        this.f5818s = T1.d.WRITE_HEX_UPPER_CASE.a(i);
        this.f5817r = !T1.d.QUOTE_FIELD_NAMES.a(i);
    }

    public final T1.e A0(T1.d dVar) {
        int i = dVar.i;
        this.f5305j &= ~i;
        if ((i & U1.a.f5304m) != 0) {
            if (dVar == T1.d.WRITE_NUMBERS_AS_STRINGS) {
                this.f5306k = false;
            } else if (dVar == T1.d.ESCAPE_NON_ASCII) {
                this.f5815p = 0;
            } else if (dVar == T1.d.STRICT_DUPLICATE_DETECTION) {
                d dVar2 = this.f5307l;
                dVar2.f5831d = null;
                this.f5307l = dVar2;
            }
        }
        if (dVar == T1.d.QUOTE_FIELD_NAMES) {
            this.f5817r = true;
            return this;
        }
        if (dVar == T1.d.WRITE_HEX_UPPER_CASE) {
            this.f5818s = false;
        }
        return this;
    }

    public final void z0(String str) {
        b(AbstractC0013g0.j("Can not ", str, ", expecting field name (context: ", this.f5307l.h(), ")"));
        throw null;
    }
}
