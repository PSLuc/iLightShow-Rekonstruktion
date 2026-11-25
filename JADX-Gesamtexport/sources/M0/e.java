package M0;

import B.C0031p0;
import G0.G;
import G0.I;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p015c2.AbstractC0473d;
import p130y0.H;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p130y0.r f3403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0031p0 f3404b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3408f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3410h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public w f3411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public G f3412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q f3413l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p030f0.d f3415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p030f0.d f3416o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3405c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public E4.l f3414m = C0201d.f3397j;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f3417p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f3418q = p035g0.A.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f3419r = new Matrix();

    public e(p130y0.r rVar, C0031p0 c0031p0) {
        this.f3403a = rVar;
        this.f3404b = c0031p0;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x020f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, p4.f] */
    /* JADX WARN: Type inference failed for: r3v3, types: [D4.c, E4.l] */
    public final void a() {
        CursorAnchorInfo.Builder builder;
        boolean z5;
        C0031p0 c0031p0 = this.f3404b;
        ?? r6 = c0031p0.f394j;
        InputMethodManager inputMethodManager = (InputMethodManager) r6.getValue();
        View view = (View) c0031p0.i;
        if (inputMethodManager.isActive(view)) {
            ?? r7 = this.f3414m;
            float[] fArr = this.f3418q;
            r7.invoke(new p035g0.A(fArr));
            p130y0.r rVar = this.f3403a;
            rVar.y();
            p035g0.A.g(fArr, rVar.f14472S);
            float fD = p030f0.c.d(rVar.f14476W);
            float fE = p030f0.c.e(rVar.f14476W);
            float[] fArr2 = rVar.f14471R;
            p035g0.A.d(fArr2);
            p035g0.A.h(fArr2, fD, fE);
            float fO = H.o(fArr2, 0, fArr, 0);
            float fO2 = H.o(fArr2, 0, fArr, 1);
            float fO3 = H.o(fArr2, 0, fArr, 2);
            float fO4 = H.o(fArr2, 0, fArr, 3);
            float fO5 = H.o(fArr2, 1, fArr, 0);
            float fO6 = H.o(fArr2, 1, fArr, 1);
            float fO7 = H.o(fArr2, 1, fArr, 2);
            float fO8 = H.o(fArr2, 1, fArr, 3);
            float fO9 = H.o(fArr2, 2, fArr, 0);
            float fO10 = H.o(fArr2, 2, fArr, 1);
            float fO11 = H.o(fArr2, 2, fArr, 2);
            float fO12 = H.o(fArr2, 2, fArr, 3);
            float fO13 = H.o(fArr2, 3, fArr, 0);
            float fO14 = H.o(fArr2, 3, fArr, 1);
            float fO15 = H.o(fArr2, 3, fArr, 2);
            float fO16 = H.o(fArr2, 3, fArr, 3);
            fArr[0] = fO;
            fArr[1] = fO2;
            fArr[2] = fO3;
            fArr[3] = fO4;
            fArr[4] = fO5;
            fArr[5] = fO6;
            fArr[6] = fO7;
            fArr[7] = fO8;
            fArr[8] = fO9;
            fArr[9] = fO10;
            fArr[10] = fO11;
            fArr[11] = fO12;
            fArr[12] = fO13;
            fArr[13] = fO14;
            fArr[14] = fO15;
            fArr[15] = fO16;
            Matrix matrix = this.f3419r;
            p035g0.H.o(matrix, fArr);
            w wVar = this.f3411j;
            E4.k.c(wVar);
            q qVar = this.f3413l;
            E4.k.c(qVar);
            G g6 = this.f3412k;
            E4.k.c(g6);
            p030f0.d dVar = this.f3415n;
            E4.k.c(dVar);
            p030f0.d dVar2 = this.f3416o;
            E4.k.c(dVar2);
            boolean z6 = this.f3408f;
            boolean z7 = this.f3409g;
            boolean z8 = this.f3410h;
            boolean z9 = this.i;
            CursorAnchorInfo.Builder builder2 = this.f3417p;
            builder2.reset();
            builder2.setMatrix(matrix);
            long j4 = wVar.f3454b;
            int iE = I.e(j4);
            builder2.setSelectionRange(iE, I.d(j4));
            R0.h hVar = R0.h.i;
            if (!z6 || iE < 0) {
                builder = builder2;
            } else {
                int iB = qVar.b(iE);
                p030f0.d dVarC = g6.c(iB);
                float fN = p081p0.c.N(dVarC.f8839a, 0.0f, (int) (g6.f1460c >> 32));
                boolean zL = AbstractC0473d.l(dVar, fN, dVarC.f8840b);
                boolean zL2 = AbstractC0473d.l(dVar, fN, dVarC.f8842d);
                boolean z10 = g6.a(iB) == hVar;
                int i = (zL || zL2) ? 1 : 0;
                if (!zL || !zL2) {
                    i |= 2;
                }
                if (z10) {
                    i |= 4;
                }
                float f6 = dVarC.f8840b;
                float f7 = dVarC.f8842d;
                builder2.setInsertionMarkerLocation(fN, f6, f7, f7, i);
                builder = builder2;
            }
            if (z7) {
                I i3 = wVar.f3455c;
                int iE2 = i3 != null ? I.e(i3.f1470a) : -1;
                int iD = i3 != null ? I.d(i3.f1470a) : -1;
                if (iE2 < 0 || iE2 >= iD) {
                    z5 = z9;
                } else {
                    builder.setComposingText(iE2, wVar.f3453a.f1494h.subSequence(iE2, iD));
                    int iB2 = qVar.b(iE2);
                    int iB3 = qVar.b(iD);
                    float[] fArr3 = new float[(iB3 - iB2) * 4];
                    CursorAnchorInfo.Builder builder3 = builder;
                    g6.f1459b.a(AbstractC0599v0.d(iB2, iB3), fArr3);
                    while (iE2 < iD) {
                        int iB4 = qVar.b(iE2);
                        int i6 = (iB4 - iB2) * 4;
                        float f8 = fArr3[i6];
                        float f9 = fArr3[i6 + 1];
                        int i7 = iD;
                        float f10 = fArr3[i6 + 2];
                        int i8 = iB2;
                        float f11 = fArr3[i6 + 3];
                        boolean z11 = z9;
                        int i9 = (dVar.f8841c <= f8 || f10 <= dVar.f8839a || dVar.f8842d <= f9 || f11 <= dVar.f8840b) ? 0 : 1;
                        if (!AbstractC0473d.l(dVar, f8, f9) || !AbstractC0473d.l(dVar, f10, f11)) {
                            i9 |= 2;
                        }
                        if (g6.a(iB4) == hVar) {
                            i9 |= 4;
                        }
                        int i10 = iE2;
                        builder3.addCharacterBounds(i10, f8, f9, f10, f11, i9);
                        iE2 = i10 + 1;
                        iD = i7;
                        iB2 = i8;
                        z9 = z11;
                    }
                    z5 = z9;
                    builder = builder3;
                }
            } else {
                z5 = z9;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33 && z8) {
                AbstractC0199b.a(builder, dVar2);
            }
            if (i11 >= 34 && z5) {
                AbstractC0200c.a(builder, g6, dVar);
            }
            ((InputMethodManager) r6.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f3407e = false;
        }
    }
}
