package F1;

import B.C0031p0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class E extends B implements Iterable, F4.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f1258u = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p080p.F f1259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f1260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1262t;

    public E(H h6) {
        super(h6);
        this.f1259q = new p080p.F(0);
    }

    @Override // F1.B
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof E) || !super.equals(obj)) {
            return false;
        }
        p080p.F f6 = this.f1259q;
        int iF = f6.f();
        E e6 = (E) obj;
        p080p.F f7 = e6.f1259q;
        if (iF != f7.f() || this.f1260r != e6.f1260r) {
            return false;
        }
        for (B b6 : (L4.a) L4.l.N(new E4.b(2, f6))) {
            if (!b6.equals(f7.c(b6.f1247m))) {
                return false;
            }
        }
        return true;
    }

    @Override // F1.B
    public final z g(C0031p0 c0031p0) {
        return l(c0031p0, false, this);
    }

    @Override // F1.B
    public final int hashCode() {
        int iD = this.f1260r;
        p080p.F f6 = this.f1259q;
        int iF = f6.f();
        for (int i = 0; i < iF; i++) {
            iD = (((iD * 31) + f6.d(i)) * 31) + ((B) f6.g(i)).hashCode();
        }
        return iD;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new D(this);
    }

    public final B j(String str, boolean z5) {
        Object next;
        E e6;
        B b6;
        E4.k.f("route", str);
        p080p.F f6 = this.f1259q;
        E4.k.f("<this>", f6);
        Iterator it = ((L4.a) L4.l.N(new E4.b(2, f6))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b6 = (B) next;
            if (M4.s.Q(b6.f1248n, str, false)) {
                break;
            }
        } while (b6.i(str) == null);
        B b7 = (B) next;
        if (b7 != null) {
            return b7;
        }
        if (!z5 || (e6 = this.i) == null || M4.l.i0(str)) {
            return null;
        }
        return e6.j(str, true);
    }

    public final B k(int i, E e6, boolean z5) {
        p080p.F f6 = this.f1259q;
        B bK = (B) f6.c(i);
        if (bK != null) {
            return bK;
        }
        if (z5) {
            Iterator it = ((L4.a) L4.l.N(new E4.b(2, f6))).iterator();
            do {
                if (!it.hasNext()) {
                    bK = null;
                    break;
                }
                B b6 = (B) it.next();
                bK = (!(b6 instanceof E) || E4.k.a(b6, e6)) ? null : ((E) b6).k(i, this, true);
            } while (bK == null);
        }
        if (bK != null) {
            return bK;
        }
        E e7 = this.i;
        if (e7 == null || e7.equals(e6)) {
            return null;
        }
        E e8 = this.i;
        E4.k.c(e8);
        return e8.k(i, this, z5);
    }

    public final z l(C0031p0 c0031p0, boolean z5, E e6) {
        z zVarL;
        z zVarG = super.g(c0031p0);
        ArrayList arrayList = new ArrayList();
        D d6 = new D(this);
        while (true) {
            zVarL = null;
            if (!d6.hasNext()) {
                break;
            }
            B b6 = (B) d6.next();
            zVarL = E4.k.a(b6, e6) ? null : b6.g(c0031p0);
            if (zVarL != null) {
                arrayList.add(zVarL);
            }
        }
        z zVar = (z) p089q4.l.i0(arrayList);
        E e7 = this.i;
        if (e7 != null && z5 && !e7.equals(e6)) {
            zVarL = e7.l(c0031p0, true, this);
        }
        return (z) p089q4.l.i0(p089q4.k.m0(new z[]{zVarG, zVar, zVarL}));
    }

    public final z m(String str, boolean z5, E e6) {
        z zVarM;
        z zVarI = i(str);
        ArrayList arrayList = new ArrayList();
        D d6 = new D(this);
        while (true) {
            zVarM = null;
            if (!d6.hasNext()) {
                break;
            }
            B b6 = (B) d6.next();
            if (!E4.k.a(b6, e6)) {
                zVarM = b6 instanceof E ? ((E) b6).m(str, false, this) : b6.i(str);
            }
            if (zVarM != null) {
                arrayList.add(zVarM);
            }
        }
        z zVar = (z) p089q4.l.i0(arrayList);
        E e7 = this.i;
        if (e7 != null && z5 && !e7.equals(e6)) {
            zVarM = e7.m(str, true, this);
        }
        return (z) p089q4.l.i0(p089q4.k.m0(new z[]{zVarI, zVar, zVarM}));
    }

    @Override // F1.B
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.f1262t;
        B bJ = (str == null || M4.l.i0(str)) ? null : j(str, true);
        if (bJ == null) {
            bJ = k(this.f1260r, this, false);
        }
        sb.append(" startDestination=");
        if (bJ == null) {
            String str2 = this.f1262t;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.f1261s;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.f1260r));
                }
            }
        } else {
            sb.append("{");
            sb.append(bJ.toString());
            sb.append("}");
        }
        String string = sb.toString();
        E4.k.e("sb.toString()", string);
        return string;
    }
}
