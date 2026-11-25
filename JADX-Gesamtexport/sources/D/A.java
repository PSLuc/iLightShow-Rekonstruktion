package D;

import G0.I;
import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import p113v0.InterfaceC1033p;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0054d f627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f628b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f634h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public M0.w f635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public G0.G f636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M0.q f637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p030f0.d f638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p030f0.d f639n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f629c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f640o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f641p = p035g0.A.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f642q = new Matrix();

    public A(C0054d c0054d, x xVar) {
        this.f627a = c0054d;
        this.f628b = xVar;
    }

    public final void a() {
        x xVar = this.f628b;
        InputMethodManager inputMethodManagerM = xVar.m();
        View view = (View) xVar.i;
        if (inputMethodManagerM.isActive(view)) {
            float[] fArr = this.f641p;
            p035g0.A.d(fArr);
            InterfaceC1033p interfaceC1033p = (InterfaceC1033p) this.f627a.f675p.f714x.getValue();
            if (interfaceC1033p != null) {
                if (!interfaceC1033p.K()) {
                    interfaceC1033p = null;
                }
                if (interfaceC1033p != null) {
                    interfaceC1033p.M(fArr);
                }
            }
            p030f0.d dVar = this.f639n;
            E4.k.c(dVar);
            float f6 = -dVar.f8839a;
            p030f0.d dVar2 = this.f639n;
            E4.k.c(dVar2);
            p035g0.A.h(fArr, f6, -dVar2.f8840b);
            Matrix matrix = this.f642q;
            p035g0.H.o(matrix, fArr);
            M0.w wVar = this.f635j;
            E4.k.c(wVar);
            M0.q qVar = this.f637l;
            E4.k.c(qVar);
            G0.G g6 = this.f636k;
            E4.k.c(g6);
            p030f0.d dVar3 = this.f638m;
            E4.k.c(dVar3);
            p030f0.d dVar4 = this.f639n;
            E4.k.c(dVar4);
            boolean z5 = this.f632f;
            boolean z6 = this.f633g;
            boolean z7 = this.f634h;
            boolean z8 = this.i;
            CursorAnchorInfo.Builder builder = this.f640o;
            builder.reset();
            builder.setMatrix(matrix);
            long j4 = wVar.f3454b;
            int iE = I.e(j4);
            builder.setSelectionRange(iE, I.d(j4));
            R0.h hVar = R0.h.i;
            if (z5 && iE >= 0) {
                int iB = qVar.b(iE);
                p030f0.d dVarC = g6.c(iB);
                float fN = p081p0.c.N(dVarC.f8839a, 0.0f, (int) (g6.f1460c >> 32));
                boolean zV = p081p0.c.V(dVar3, fN, dVarC.f8840b);
                boolean zV2 = p081p0.c.V(dVar3, fN, dVarC.f8842d);
                boolean z9 = g6.a(iB) == hVar;
                int i = (zV || zV2) ? 1 : 0;
                if (!zV || !zV2) {
                    i |= 2;
                }
                if (z9) {
                    i |= 4;
                }
                float f7 = dVarC.f8840b;
                float f8 = dVarC.f8842d;
                builder.setInsertionMarkerLocation(fN, f7, f8, f8, i);
            }
            if (z6) {
                I i3 = wVar.f3455c;
                int iE2 = i3 != null ? I.e(i3.f1470a) : -1;
                int iD = i3 != null ? I.d(i3.f1470a) : -1;
                if (iE2 >= 0 && iE2 < iD) {
                    builder.setComposingText(iE2, wVar.f3453a.f1494h.subSequence(iE2, iD));
                    int iB2 = qVar.b(iE2);
                    int iB3 = qVar.b(iD);
                    float[] fArr2 = new float[(iB3 - iB2) * 4];
                    M0.q qVar2 = qVar;
                    g6.f1459b.a(AbstractC0599v0.d(iB2, iB3), fArr2);
                    while (iE2 < iD) {
                        M0.q qVar3 = qVar2;
                        int iB4 = qVar3.b(iE2);
                        int i6 = (iB4 - iB2) * 4;
                        float[] fArr3 = fArr2;
                        float f9 = fArr3[i6];
                        x xVar2 = xVar;
                        float f10 = fArr3[i6 + 1];
                        int i7 = iB2;
                        float f11 = fArr3[i6 + 2];
                        float f12 = fArr3[i6 + 3];
                        int i8 = (dVar3.f8841c <= f9 || f11 <= dVar3.f8839a || dVar3.f8842d <= f10 || f12 <= dVar3.f8840b) ? 0 : 1;
                        if (!p081p0.c.V(dVar3, f9, f10) || !p081p0.c.V(dVar3, f11, f12)) {
                            i8 |= 2;
                        }
                        if (g6.a(iB4) == hVar) {
                            i8 |= 4;
                        }
                        builder.addCharacterBounds(iE2, f9, f10, f11, f12, i8);
                        iE2++;
                        fArr2 = fArr3;
                        xVar = xVar2;
                        iB2 = i7;
                        qVar2 = qVar3;
                    }
                }
            }
            x xVar3 = xVar;
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 33 && z7) {
                l.a(builder, dVar4);
            }
            if (i9 >= 34 && z8) {
                n.a(builder, g6, dVar3);
            }
            xVar3.m().updateCursorAnchorInfo(view, builder.build());
            this.f631e = false;
        }
    }
}
