package p090r;

import D4.c;
import E4.l;
import N.V0;
import S0.j;
import S0.k;
import p015c2.AbstractC0473d;

/* JADX INFO: renamed from: r.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0871j extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11408h;
    public final /* synthetic */ C0873l i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871j(C0873l c0873l, int i) {
        super(1);
        this.f11408h = i;
        this.i = c0873l;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f11408h) {
            case 0:
                V0 v6 = (V0) this.i.f11416e.e(obj);
                return new j(v6 != null ? ((j) v6.getValue()).f4896a : 0L);
            case 1:
                int iIntValue = ((Number) obj).intValue();
                C0873l c0873l = this.i;
                return Integer.valueOf(((int) (C0873l.d(c0873l) >> 32)) - ((int) (c0873l.f11413b.a(AbstractC0473d.b(iIntValue, iIntValue), C0873l.d(c0873l), k.f4897h) >> 32)));
            case 2:
                int iIntValue2 = ((Number) obj).intValue();
                long jB = AbstractC0473d.b(iIntValue2, iIntValue2);
                C0873l c0873l2 = this.i;
                return Integer.valueOf((-((int) (c0873l2.f11413b.a(jB, C0873l.d(c0873l2), k.f4897h) >> 32))) - iIntValue2);
            case 3:
                int iIntValue3 = ((Number) obj).intValue();
                C0873l c0873l3 = this.i;
                return Integer.valueOf(((int) (C0873l.d(c0873l3) & 4294967295L)) - ((int) (c0873l3.f11413b.a(AbstractC0473d.b(iIntValue3, iIntValue3), C0873l.d(c0873l3), k.f4897h) & 4294967295L)));
            case 4:
                int iIntValue4 = ((Number) obj).intValue();
                long jB2 = AbstractC0473d.b(iIntValue4, iIntValue4);
                C0873l c0873l4 = this.i;
                return Integer.valueOf((-((int) (c0873l4.f11413b.a(jB2, C0873l.d(c0873l4), k.f4897h) & 4294967295L))) - iIntValue4);
            case 5:
                int iIntValue5 = ((Number) obj).intValue();
                C0873l c0873l5 = this.i;
                V0 v7 = (V0) c0873l5.f11416e.e(c0873l5.f11412a.f12059d.getValue());
                return Integer.valueOf((-((int) (c0873l5.f11413b.a(AbstractC0473d.b(iIntValue5, iIntValue5), v7 != null ? ((j) v7.getValue()).f4896a : 0L, k.f4897h) >> 32))) - iIntValue5);
            case 6:
                int iIntValue6 = ((Number) obj).intValue();
                C0873l c0873l6 = this.i;
                V0 v8 = (V0) c0873l6.f11416e.e(c0873l6.f11412a.f12059d.getValue());
                long j4 = v8 != null ? ((j) v8.getValue()).f4896a : 0L;
                return Integer.valueOf((-((int) (c0873l6.f11413b.a(AbstractC0473d.b(iIntValue6, iIntValue6), j4, k.f4897h) >> 32))) + ((int) (j4 >> 32)));
            case 7:
                int iIntValue7 = ((Number) obj).intValue();
                C0873l c0873l7 = this.i;
                V0 v9 = (V0) c0873l7.f11416e.e(c0873l7.f11412a.f12059d.getValue());
                return Integer.valueOf((-((int) (c0873l7.f11413b.a(AbstractC0473d.b(iIntValue7, iIntValue7), v9 != null ? ((j) v9.getValue()).f4896a : 0L, k.f4897h) & 4294967295L))) - iIntValue7);
            default:
                int iIntValue8 = ((Number) obj).intValue();
                C0873l c0873l8 = this.i;
                V0 v10 = (V0) c0873l8.f11416e.e(c0873l8.f11412a.f12059d.getValue());
                long j6 = v10 != null ? ((j) v10.getValue()).f4896a : 0L;
                return Integer.valueOf((-((int) (c0873l8.f11413b.a(AbstractC0473d.b(iIntValue8, iIntValue8), j6, k.f4897h) & 4294967295L))) + ((int) (4294967295L & j6)));
        }
    }
}
