package j5;

import F.C0068j;
import c5.C0495p;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f9747A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f9748B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f9749C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9750D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9751E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f9752F;
    public byte[] G;
    public int H;
    public int I;
    public int J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public int f9753K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f9754L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f9755M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f9756N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f9757O;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f9762T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f9763U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f9764V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f9765W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public int f9766X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public byte[] f9767Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9769b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f9771d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9775h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9776j;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f9788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f9791y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f9792z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9768a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f9770c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f9772e = new int[3240];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9773f = new int[3240];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0068j f9777k = new C0068j(7);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0068j f9778l = new C0068j(7);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0068j f9779m = new C0068j(7);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int[] f9780n = new int[3];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f9781o = new int[3];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f9782p = new int[6];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int[] f9783q = {16, 15, 11, 4};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9784r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f9785s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9786t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f9787u = false;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f9758P = 0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f9759Q = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final byte[] f9760R = new byte[0];

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f9761S = 0;

    public static void a(f fVar, ByteArrayInputStream byteArrayInputStream) {
        int i;
        if (fVar.f9768a != 0) {
            throw new IllegalStateException("State MUST be uninitialized");
        }
        a aVar = fVar.f9770c;
        if (aVar.f9721d != null) {
            throw new IllegalStateException("Bit reader already has associated input stream");
        }
        byte[] bArr = aVar.f9718a;
        C0495p c0495p = aVar.f9720c;
        c0495p.i = bArr;
        c0495p.f7476j = aVar.f9719b;
        aVar.f9721d = byteArrayInputStream;
        aVar.f9723f = 0L;
        aVar.f9724g = 64;
        aVar.f9725h = 1024;
        aVar.f9722e = false;
        a.e(aVar);
        a.a(aVar, false);
        a.b(aVar);
        a.b(aVar);
        if (a.d(aVar, 1) == 0) {
            i = 16;
        } else {
            int iD = a.d(aVar, 3);
            i = 17;
            if (iD != 0) {
                i = 17 + iD;
            } else {
                int iD2 = a.d(aVar, 3);
                if (iD2 != 0) {
                    i = iD2 + 8;
                }
            }
        }
        if (i == 9) {
            throw new c("Invalid 'windowBits' code");
        }
        int i3 = 1 << i;
        fVar.f9757O = i3;
        fVar.f9756N = i3 - 16;
        fVar.f9768a = 1;
    }
}
