package c5;

import B.AbstractC0013g0;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: c5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0500v implements Y4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0500v f7496a = new C0500v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g0 f7497b = new g0("kotlin.time.Duration", a5.e.f6360r);

    @Override // Y4.a
    public final Object deserialize(b5.c cVar) {
        int i = N4.a.f4327k;
        String strY = cVar.y();
        E4.k.f("value", strY);
        try {
            return new N4.a(AbstractC0473d.g(strY));
        } catch (IllegalArgumentException e6) {
            throw new IllegalArgumentException(AbstractC0013g0.i("Invalid ISO duration string format: '", strY, "'."), e6);
        }
    }

    @Override // Y4.a
    public final a5.g getDescriptor() {
        return f7497b;
    }

    @Override // Y4.a
    public final void serialize(b5.d dVar, Object obj) {
        long j4;
        long j6 = ((N4.a) obj).f4328h;
        int i = N4.a.f4327k;
        StringBuilder sb = new StringBuilder();
        if (j6 < 0) {
            sb.append('-');
        }
        sb.append("PT");
        boolean z5 = true;
        if (j6 < 0) {
            j4 = ((-(j6 >> 1)) << 1) + ((long) (((int) j6) & 1));
            int i3 = N4.b.f4329a;
        } else {
            j4 = j6;
        }
        long jF = N4.a.f(j4, N4.c.HOURS);
        int iF = N4.a.d(j4) ? 0 : (int) (N4.a.f(j4, N4.c.MINUTES) % ((long) 60));
        int iF2 = N4.a.d(j4) ? 0 : (int) (N4.a.f(j4, N4.c.SECONDS) % ((long) 60));
        int iC = N4.a.c(j4);
        if (N4.a.d(j6)) {
            jF = 9999999999999L;
        }
        boolean z6 = jF != 0;
        boolean z7 = (iF2 == 0 && iC == 0) ? false : true;
        if (iF == 0 && (!z7 || !z6)) {
            z5 = false;
        }
        if (z6) {
            sb.append(jF);
            sb.append('H');
        }
        if (z5) {
            sb.append(iF);
            sb.append('M');
        }
        if (z7 || (!z6 && !z5)) {
            N4.a.b(sb, iF2, iC, 9, "S", true);
        }
        String string = sb.toString();
        E4.k.e("toString(...)", string);
        dVar.q(string);
    }
}
