package G0;

import android.text.Layout;
import com.google.android.gms.internal.play_billing.AbstractC0599v0;
import java.io.Serializable;
import p035g0.C0704e;
import p035g0.C0709j;
import p035g0.C0715p;

/* JADX INFO: loaded from: classes.dex */
public final class m extends E4.l implements D4.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1509h = 0;
    public final /* synthetic */ long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1510j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Serializable f1511k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f1512l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j4, float[] fArr, E4.u uVar, E4.t tVar) {
        super(1);
        this.i = j4;
        this.f1510j = fArr;
        this.f1511k = uVar;
        this.f1512l = tVar;
    }

    @Override // D4.c
    public final Object invoke(Object obj) {
        C0105a c0105a;
        long j4;
        boolean z5;
        float fA;
        float fA2;
        switch (this.f1509h) {
            case 0:
                q qVar = (q) obj;
                int i = qVar.f1528b;
                long j6 = this.i;
                int iE = i > I.e(j6) ? qVar.f1528b : I.e(j6);
                int iD = I.d(j6);
                int iD2 = qVar.f1529c;
                if (iD2 >= iD) {
                    iD2 = I.d(j6);
                }
                long jD = AbstractC0599v0.d(qVar.b(iE), qVar.b(iD2));
                E4.u uVar = (E4.u) this.f1511k;
                int i3 = uVar.f1072h;
                C0105a c0105a2 = qVar.f1527a;
                int iE2 = I.e(jD);
                int iD3 = I.d(jD);
                H0.y yVar = c0105a2.f1480d;
                Layout layout = yVar.f1734e;
                int length = layout.getText().length();
                if (iE2 < 0) {
                    throw new IllegalArgumentException("startOffset must be > 0");
                }
                if (iE2 >= length) {
                    throw new IllegalArgumentException("startOffset must be less than text length");
                }
                if (iD3 <= iE2) {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset");
                }
                if (iD3 > length) {
                    throw new IllegalArgumentException("endOffset must be smaller or equal to text length");
                }
                int i6 = (iD3 - iE2) * 4;
                float[] fArr = (float[]) this.f1510j;
                if (fArr.length - i3 < i6) {
                    throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(iE2);
                int lineForOffset2 = layout.getLineForOffset(iD3 - 1);
                D0.j jVar = new D0.j(yVar);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int iF = yVar.f(lineForOffset);
                        int iMax = Math.max(iE2, lineStart);
                        int iMin = Math.min(iD3, iF);
                        float fG = yVar.g(lineForOffset);
                        float fE = yVar.e(lineForOffset);
                        c0105a = c0105a2;
                        j4 = jD;
                        boolean z6 = false;
                        boolean z7 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (iMax < iMin) {
                            boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
                            if (!z7 || zIsRtlCharAt) {
                                if (z7 && zIsRtlCharAt) {
                                    z6 = false;
                                    float fA3 = jVar.a(iMax, false, false, false);
                                    z5 = z7;
                                    fA = jVar.a(iMax + 1, true, true, false);
                                    fA2 = fA3;
                                } else {
                                    z5 = z7;
                                    z6 = false;
                                    if (z5 || !zIsRtlCharAt) {
                                        fA = jVar.a(iMax, false, false, false);
                                        fA2 = jVar.a(iMax + 1, true, true, false);
                                    } else {
                                        fA2 = jVar.a(iMax, false, false, true);
                                        fA = jVar.a(iMax + 1, true, true, true);
                                    }
                                }
                                fArr[i3] = fA;
                                fArr[i3 + 1] = fG;
                                fArr[i3 + 2] = fA2;
                                fArr[i3 + 3] = fE;
                                i3 += 4;
                                iMax++;
                                z7 = z5;
                            } else {
                                fA = jVar.a(iMax, z6, z6, true);
                                z5 = z7;
                                fA2 = jVar.a(iMax + 1, true, true, true);
                            }
                            z6 = false;
                            fArr[i3] = fA;
                            fArr[i3 + 1] = fG;
                            fArr[i3 + 2] = fA2;
                            fArr[i3 + 3] = fE;
                            i3 += 4;
                            iMax++;
                            z7 = z5;
                        }
                        if (lineForOffset != lineForOffset2) {
                            lineForOffset++;
                            c0105a2 = c0105a;
                            jD = j4;
                        }
                    }
                } else {
                    c0105a = c0105a2;
                    j4 = jD;
                }
                int iC = (I.c(j4) * 4) + uVar.f1072h;
                int i7 = uVar.f1072h;
                while (true) {
                    E4.t tVar = (E4.t) this.f1512l;
                    if (i7 >= iC) {
                        uVar.f1072h = iC;
                        tVar.f1071h = c0105a.b() + tVar.f1071h;
                        return p084p4.x.f10867a;
                    }
                    int i8 = i7 + 1;
                    float f6 = fArr[i8];
                    float f7 = tVar.f1071h;
                    fArr[i8] = f6 + f7;
                    int i9 = i7 + 3;
                    fArr[i9] = fArr[i9] + f7;
                    i7 += 4;
                }
                break;
            default:
                p124x0.F f8 = (p124x0.F) obj;
                f8.b();
                p030f0.d dVar = (p030f0.d) this.f1510j;
                E4.w wVar = (E4.w) this.f1511k;
                long j7 = this.i;
                C0709j c0709j = (C0709j) this.f1512l;
                p044i0.b bVar = f8.f13862h;
                C0715p c0715p = (C0715p) bVar.i.i;
                float f9 = dVar.f8839a;
                float f10 = dVar.f8840b;
                c0715p.B(f9, f10);
                try {
                    p044i0.d.I(f8, (C0704e) wVar.f1074h, j7, 0L, 0.0f, c0709j, 0, 890);
                    return p084p4.x.f10867a;
                } finally {
                    ((C0715p) bVar.i.i).B(-f9, -f10);
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p030f0.d dVar, E4.w wVar, long j4, C0709j c0709j) {
        super(1);
        this.f1510j = dVar;
        this.f1511k = wVar;
        this.i = j4;
        this.f1512l = c0709j;
    }
}
