package p096s;

import D4.a;
import D4.c;
import E4.l;
import S0.e;
import S0.f;
import S0.h;
import S0.j;
import S1.h0;
import defpackage.b;
import p015c2.AbstractC0473d;
import p030f0.d;
import p084p4.x;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends l implements c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f12090h;
    public static final p0 i = new p0(1, 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p0 f12073j = new p0(1, 1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p0 f12074k = new p0(1, 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p0 f12075l = new p0(1, 3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p0 f12076m = new p0(1, 4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p0 f12077n = new p0(1, 5);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p0 f12078o = new p0(1, 6);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final p0 f12079p = new p0(1, 7);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final p0 f12080q = new p0(1, 8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final p0 f12081r = new p0(1, 9);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p0 f12082s = new p0(1, 10);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final p0 f12083t = new p0(1, 11);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p0 f12084u = new p0(1, 12);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final p0 f12085v = new p0(1, 13);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p0 f12086w = new p0(1, 14);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final p0 f12087x = new p0(1, 15);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final p0 f12088y = new p0(1, 16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final p0 f12089z = new p0(1, 17);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final p0 f12071A = new p0(1, 18);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final p0 f12072B = new p0(1, 19);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i3, int i6) {
        super(i3);
        this.f12090h = i6;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, p4.f] */
    @Override // D4.c
    public final Object invoke(Object obj) {
        switch (this.f12090h) {
            case 0:
                ((a) obj).invoke();
                return x.f10867a;
            case 1:
                Z z5 = (Z) obj;
                long j4 = z5.f11920m;
                ((X.x) u0.f12124a.getValue()).c(z5, f12073j, z5.f11921n);
                long j6 = z5.f11920m;
                if (j4 != j6) {
                    O o6 = z5.f11928u;
                    if (o6 != null) {
                        o6.f11872g = j6;
                        if (o6.f11867b == null) {
                            o6.f11873h = G4.a.E((1.0d - ((double) o6.f11870e.a(0))) * z5.f11920m);
                        }
                    } else if (j6 != 0) {
                        z5.x();
                    }
                }
                return x.f10867a;
            case 2:
                long j7 = ((f) obj).f4888a;
                return new C0921n(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
            case 3:
                C0921n c0921n = (C0921n) obj;
                return new f((((long) Float.floatToRawIntBits(c0921n.f12048b)) & 4294967295L) | (((long) Float.floatToRawIntBits(c0921n.f12047a)) << 32));
            case 4:
                return new C0920m(((e) obj).f4887h);
            case 5:
                return new e(((C0920m) obj).f12032a);
            case 6:
                return new C0920m(((Number) obj).floatValue());
            case 7:
                return Float.valueOf(((C0920m) obj).f12032a);
            case 8:
                long j8 = ((h) obj).f4890a;
                return new C0921n((int) (j8 >> 32), (int) (j8 & 4294967295L));
            case 9:
                C0921n c0921n2 = (C0921n) obj;
                return new h(h0.c(Math.round(c0921n2.f12047a), Math.round(c0921n2.f12048b)));
            case 10:
                long j9 = ((j) obj).f4896a;
                return new C0921n((int) (j9 >> 32), (int) (j9 & 4294967295L));
            case 11:
                C0921n c0921n3 = (C0921n) obj;
                int iRound = Math.round(c0921n3.f12047a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c0921n3.f12048b);
                return new j(AbstractC0473d.b(iRound, iRound2 >= 0 ? iRound2 : 0));
            case 12:
                return new C0920m(((Number) obj).intValue());
            case 13:
                return Integer.valueOf((int) ((C0920m) obj).f12032a);
            case 14:
                long j10 = ((p030f0.c) obj).f8837a;
                return new C0921n(p030f0.c.d(j10), p030f0.c.e(j10));
            case 15:
                C0921n c0921n4 = (C0921n) obj;
                return new p030f0.c(p081p0.c.y(c0921n4.f12047a, c0921n4.f12048b));
            case 16:
                d dVar = (d) obj;
                return new C0923p(dVar.f8839a, dVar.f8840b, dVar.f8841c, dVar.f8842d);
            case b.TIMEBEFORENEXTDRUM_FIELD_NUMBER /* 17 */:
                C0923p c0923p = (C0923p) obj;
                return new d(c0923p.f12067a, c0923p.f12068b, c0923p.f12069c, c0923p.f12070d);
            case b.TIMEBEFORENEXTBEAT_FIELD_NUMBER /* 18 */:
                long j11 = ((p030f0.f) obj).f8851a;
                return new C0921n(p030f0.f.d(j11), p030f0.f.b(j11));
            default:
                C0921n c0921n5 = (C0921n) obj;
                return new p030f0.f(h0.f(c0921n5.f12047a, c0921n5.f12048b));
        }
    }
}
