package p012c;

import B0.f;
import B0.g;
import D4.a;
import E4.i;
import P.d;
import Z.n;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.compose.ui.focus.b;
import p024e0.c;
import p024e0.e;
import p024e0.l;
import p024e0.q;
import p024e0.r;
import p080p.A;
import p084p4.x;
import p124x0.AbstractC1098f;
import p124x0.AbstractC1105m;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C extends i implements a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f7119p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(int i, Object obj, Class cls, String str, String str2, int i3, int i6) {
        super(i, obj, cls, str, str2, i3);
        this.f7119p = i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // D4.a
    public final Object invoke() {
        A a6;
        char c6;
        long j4;
        long j6;
        A a7;
        Object[] objArr;
        long[] jArr;
        A a8;
        long j7;
        long[] jArr2;
        Object[] objArr2;
        Object[] objArr3;
        long[] jArr3;
        long j8;
        Object[] objArr4;
        A a9;
        Object[] objArr5;
        int i;
        char c7;
        d dVar;
        A a10;
        Object[] objArr6;
        switch (this.f7119p) {
            case 0:
                ((D) this.i).e();
                return x.f10867a;
            case 1:
                ((D) this.i).e();
                return x.f10867a;
            case 2:
                e eVar = (e) this.i;
                A a11 = eVar.f8646e;
                Object[] objArr7 = a11.f10709b;
                long[] jArr4 = a11.f10708a;
                int length = jArr4.length - 2;
                char c8 = 7;
                A a12 = eVar.f8644c;
                int i3 = 8;
                if (length >= 0) {
                    int i6 = 0;
                    j4 = 255;
                    while (true) {
                        long j9 = jArr4[i6];
                        j6 = -9187201950435737472L;
                        if ((((~j9) << c8) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j9 & 255) < 128) {
                                    c7 = c8;
                                    n nVar = (n) ((l) objArr7[(i6 << 3) + i8]);
                                    i = i3;
                                    n nVarE = nVar.f5958h;
                                    if (nVarE.f5969t) {
                                        d dVar2 = null;
                                        while (nVarE != null) {
                                            if (nVarE instanceof r) {
                                                a12.a((r) nVarE);
                                            } else {
                                                if ((nVarE.f5959j & 1024) != 0 && (nVarE instanceof AbstractC1105m)) {
                                                    n nVar2 = ((AbstractC1105m) nVarE).f14046v;
                                                    a10 = a11;
                                                    int i9 = 0;
                                                    while (nVar2 != null) {
                                                        Object[] objArr8 = objArr7;
                                                        if ((nVar2.f5959j & 1024) != 0) {
                                                            i9++;
                                                            if (i9 == 1) {
                                                                nVarE = nVar2;
                                                            } else {
                                                                if (dVar2 == null) {
                                                                    dVar2 = new d(new n[16]);
                                                                }
                                                                if (nVarE != null) {
                                                                    dVar2.c(nVarE);
                                                                    nVarE = null;
                                                                }
                                                                dVar2.c(nVar2);
                                                                i9 = i9;
                                                            }
                                                        }
                                                        nVar2 = nVar2.f5962m;
                                                        objArr7 = objArr8;
                                                    }
                                                    objArr6 = objArr7;
                                                    if (i9 == 1) {
                                                    }
                                                    a11 = a10;
                                                    objArr7 = objArr6;
                                                }
                                                nVarE = AbstractC1098f.e(dVar2);
                                                a11 = a10;
                                                objArr7 = objArr6;
                                            }
                                            a10 = a11;
                                            objArr6 = objArr7;
                                            nVarE = AbstractC1098f.e(dVar2);
                                            a11 = a10;
                                            objArr7 = objArr6;
                                        }
                                        a9 = a11;
                                        objArr5 = objArr7;
                                        n nVar3 = nVar.f5958h;
                                        if (!nVar3.f5969t) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        d dVar3 = new d(new n[16]);
                                        n nVar4 = nVar3.f5962m;
                                        if (nVar4 == null) {
                                            AbstractC1098f.b(dVar3, nVar3);
                                        } else {
                                            dVar3.c(nVar4);
                                        }
                                        while (dVar3.n()) {
                                            n nVarE2 = (n) dVar3.p(dVar3.f4583j - 1);
                                            if ((nVarE2.f5960k & 1024) == 0) {
                                                AbstractC1098f.b(dVar3, nVarE2);
                                            } else {
                                                while (nVarE2 != null) {
                                                    if ((nVarE2.f5959j & 1024) != 0) {
                                                        d dVar4 = null;
                                                        while (nVarE2 != null) {
                                                            if (nVarE2 instanceof r) {
                                                                a12.a((r) nVarE2);
                                                            } else {
                                                                if ((nVarE2.f5959j & 1024) != 0 && (nVarE2 instanceof AbstractC1105m)) {
                                                                    n nVar5 = ((AbstractC1105m) nVarE2).f14046v;
                                                                    int i10 = 0;
                                                                    while (nVar5 != null) {
                                                                        if ((nVar5.f5959j & 1024) != 0) {
                                                                            i10++;
                                                                            if (i10 == 1) {
                                                                                dVar3 = dVar3;
                                                                                nVarE2 = nVar5;
                                                                            } else {
                                                                                if (dVar4 == null) {
                                                                                    dVar4 = new d(new n[16]);
                                                                                }
                                                                                if (nVarE2 != null) {
                                                                                    dVar4.c(nVarE2);
                                                                                    nVarE2 = null;
                                                                                }
                                                                                dVar4.c(nVar5);
                                                                            }
                                                                        } else {
                                                                            dVar3 = dVar3;
                                                                        }
                                                                        nVar5 = nVar5.f5962m;
                                                                        dVar3 = dVar3;
                                                                    }
                                                                    dVar = dVar3;
                                                                    if (i10 == 1) {
                                                                    }
                                                                    dVar3 = dVar;
                                                                }
                                                                nVarE2 = AbstractC1098f.e(dVar4);
                                                                dVar3 = dVar;
                                                            }
                                                            dVar = dVar3;
                                                            nVarE2 = AbstractC1098f.e(dVar4);
                                                            dVar3 = dVar;
                                                        }
                                                    }
                                                    nVarE2 = nVarE2.f5962m;
                                                    dVar3 = dVar3;
                                                }
                                            }
                                        }
                                    } else {
                                        a9 = a11;
                                        objArr5 = objArr7;
                                    }
                                } else {
                                    a9 = a11;
                                    objArr5 = objArr7;
                                    i = i3;
                                    c7 = c8;
                                }
                                j9 >>= i;
                                i8++;
                                i3 = i;
                                c8 = c7;
                                a11 = a9;
                                objArr7 = objArr5;
                                break;
                            }
                            a6 = a11;
                            objArr4 = objArr7;
                            c6 = c8;
                            if (i7 == i3) {
                            }
                        } else {
                            a6 = a11;
                            objArr4 = objArr7;
                            c6 = c8;
                        }
                        if (i6 != length) {
                            i6++;
                            c8 = c6;
                            a11 = a6;
                            objArr7 = objArr4;
                            i3 = 8;
                        }
                    }
                } else {
                    a6 = a11;
                    c6 = 7;
                    j4 = 255;
                    j6 = -9187201950435737472L;
                }
                a6.b();
                A a13 = eVar.f8645d;
                Object[] objArr9 = a13.f10709b;
                long[] jArr5 = a13.f10708a;
                int length2 = jArr5.length - 2;
                A a14 = eVar.f8647f;
                if (length2 >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j10 = jArr5[i11];
                        if ((((~j10) << c6) & j10 & j6) != j6) {
                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j10 & j4) < 128) {
                                    c cVar = (c) objArr9[(i11 << 3) + i13];
                                    n nVar6 = (n) cVar;
                                    n nVarE3 = nVar6.f5958h;
                                    a8 = a13;
                                    boolean z5 = nVarE3.f5969t;
                                    q qVar = q.f8671j;
                                    if (z5) {
                                        boolean z6 = true;
                                        boolean z7 = false;
                                        r rVar = null;
                                        d dVar5 = null;
                                        while (nVarE3 != null) {
                                            q qVar2 = qVar;
                                            if (nVarE3 instanceof r) {
                                                r rVar2 = (r) nVarE3;
                                                if (rVar != null) {
                                                    z7 = true;
                                                }
                                                if (a12.c(rVar2)) {
                                                    a14.a(rVar2);
                                                    z6 = false;
                                                }
                                                objArr3 = objArr9;
                                                jArr3 = jArr5;
                                                j8 = j10;
                                                rVar = rVar2;
                                            } else if ((nVarE3.f5959j & 1024) == 0 || !(nVarE3 instanceof AbstractC1105m)) {
                                                objArr3 = objArr9;
                                                jArr3 = jArr5;
                                                j8 = j10;
                                            } else {
                                                n nVar7 = ((AbstractC1105m) nVarE3).f14046v;
                                                objArr3 = objArr9;
                                                int i14 = 0;
                                                while (nVar7 != null) {
                                                    long[] jArr6 = jArr5;
                                                    if ((nVar7.f5959j & 1024) == 0) {
                                                        j10 = j10;
                                                    } else {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            nVarE3 = nVar7;
                                                            j10 = j10;
                                                        } else {
                                                            d dVar6 = dVar5 == null ? new d(new n[16]) : dVar5;
                                                            if (nVarE3 != null) {
                                                                dVar6.c(nVarE3);
                                                                nVarE3 = null;
                                                            }
                                                            dVar6.c(nVar7);
                                                            dVar5 = dVar6;
                                                            i14 = i14;
                                                        }
                                                    }
                                                    nVar7 = nVar7.f5962m;
                                                    jArr5 = jArr6;
                                                    j10 = j10;
                                                }
                                                jArr3 = jArr5;
                                                j8 = j10;
                                                if (i14 == 1) {
                                                }
                                                qVar = qVar2;
                                                objArr9 = objArr3;
                                                jArr5 = jArr3;
                                                j10 = j8;
                                            }
                                            nVarE3 = AbstractC1098f.e(dVar5);
                                            qVar = qVar2;
                                            objArr9 = objArr3;
                                            jArr5 = jArr3;
                                            j10 = j8;
                                        }
                                        q qVar3 = qVar;
                                        objArr2 = objArr9;
                                        jArr2 = jArr5;
                                        j7 = j10;
                                        n nVar8 = nVar6.f5958h;
                                        if (!nVar8.f5969t) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        d dVar7 = new d(new n[16]);
                                        n nVar9 = nVar8.f5962m;
                                        if (nVar9 == null) {
                                            AbstractC1098f.b(dVar7, nVar8);
                                        } else {
                                            dVar7.c(nVar9);
                                        }
                                        while (dVar7.n()) {
                                            n nVarE4 = (n) dVar7.p(dVar7.f4583j - 1);
                                            if ((nVarE4.f5960k & 1024) == 0) {
                                                AbstractC1098f.b(dVar7, nVarE4);
                                            } else {
                                                while (true) {
                                                    if (nVarE4 != null) {
                                                        if ((nVarE4.f5959j & 1024) != 0) {
                                                            d dVar8 = null;
                                                            while (nVarE4 != null) {
                                                                if (nVarE4 instanceof r) {
                                                                    r rVar3 = (r) nVarE4;
                                                                    if (rVar != null) {
                                                                        z7 = true;
                                                                    }
                                                                    if (a12.c(rVar3)) {
                                                                        a14.a(rVar3);
                                                                        z6 = false;
                                                                    }
                                                                    rVar = rVar3;
                                                                } else if ((nVarE4.f5959j & 1024) != 0 && (nVarE4 instanceof AbstractC1105m)) {
                                                                    int i15 = 0;
                                                                    for (n nVar10 = ((AbstractC1105m) nVarE4).f14046v; nVar10 != null; nVar10 = nVar10.f5962m) {
                                                                        if ((nVar10.f5959j & 1024) != 0) {
                                                                            i15++;
                                                                            if (i15 == 1) {
                                                                                nVarE4 = nVar10;
                                                                            } else {
                                                                                if (dVar8 == null) {
                                                                                    dVar8 = new d(new n[16]);
                                                                                }
                                                                                if (nVarE4 != null) {
                                                                                    dVar8.c(nVarE4);
                                                                                    nVarE4 = null;
                                                                                }
                                                                                dVar8.c(nVar10);
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i15 != 1) {
                                                                        nVarE4 = AbstractC1098f.e(dVar8);
                                                                    }
                                                                }
                                                                nVarE4 = AbstractC1098f.e(dVar8);
                                                            }
                                                        }
                                                        nVarE4 = nVarE4.f5962m;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        if (z6) {
                                            cVar.J(z7 ? p024e0.d.o(cVar) : rVar != null ? rVar.z0() : qVar3);
                                        }
                                    } else {
                                        cVar.J(qVar);
                                    }
                                    i13++;
                                    j10 = j7 >> 8;
                                    a13 = a8;
                                    objArr9 = objArr2;
                                    jArr5 = jArr2;
                                } else {
                                    a8 = a13;
                                }
                                objArr2 = objArr9;
                                jArr2 = jArr5;
                                j7 = j10;
                                i13++;
                                j10 = j7 >> 8;
                                a13 = a8;
                                objArr9 = objArr2;
                                jArr5 = jArr2;
                            }
                            a7 = a13;
                            objArr = objArr9;
                            jArr = jArr5;
                            if (i12 == 8) {
                            }
                        } else {
                            a7 = a13;
                            objArr = objArr9;
                            jArr = jArr5;
                        }
                        if (i11 != length2) {
                            i11++;
                            a13 = a7;
                            objArr9 = objArr;
                            jArr5 = jArr;
                        }
                    }
                } else {
                    a7 = a13;
                }
                a7.b();
                Object[] objArr10 = a12.f10709b;
                long[] jArr7 = a12.f10708a;
                int length3 = jArr7.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j11 = jArr7[i16];
                        if ((((~j11) << c6) & j11 & j6) != j6) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j11 & j4) < 128) {
                                    r rVar4 = (r) objArr10[(i16 << 3) + i18];
                                    if (rVar4.f5969t) {
                                        q qVarZ0 = rVar4.z0();
                                        rVar4.C0();
                                        if (qVarZ0 != rVar4.z0() || a14.c(rVar4)) {
                                            p024e0.d.A(rVar4);
                                        }
                                    }
                                }
                                j11 >>= 8;
                            }
                            if (i17 == 8) {
                            }
                        }
                        if (i16 != length3) {
                            i16++;
                        }
                    }
                }
                a12.b();
                a14.b();
                eVar.f8643b.invoke();
                if (!a6.g()) {
                    p027e3.a.y0("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!a7.g()) {
                    p027e3.a.y0("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (a12.g()) {
                    return x.f10867a;
                }
                p027e3.a.y0("Unprocessed FocusTarget nodes");
                throw null;
            case 3:
                b bVar = (b) this.i;
                if (bVar.f6703f.z0() == q.f8671j) {
                    bVar.f6700c.invoke();
                }
                return x.f10867a;
            case 4:
                View view = (View) this.i;
                if (Build.VERSION.SDK_INT >= 30) {
                    g.a(view, 1);
                }
                ContentCaptureSession contentCaptureSessionA = f.a(view);
                if (contentCaptureSessionA == null) {
                    return null;
                }
                return new B0.d(contentCaptureSessionA, view);
            case 5:
                p130y0.r rVar5 = (p130y0.r) this.i;
                if (rVar5.isFocused() || rVar5.hasFocus()) {
                    rVar5.clearFocus();
                }
                return x.f10867a;
            default:
                return ((p130y0.r) this.i).t();
        }
    }
}
