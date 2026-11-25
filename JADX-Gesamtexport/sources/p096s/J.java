package p096s;

import K3.e;
import java.util.Arrays;
import p080p.p;
import p080p.q;
import p089q4.k;

/* JADX INFO: loaded from: classes.dex */
public final class J implements InterfaceC0929w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f11854a;

    public J(e eVar) {
        this.f11854a = eVar;
    }

    @Override // p096s.InterfaceC0929w, p096s.InterfaceC0918k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final D0 a(w0 w0Var) {
        int[] iArr;
        Object[] objArr;
        e eVar = this.f11854a;
        q qVar = (q) eVar.f2139c;
        p pVar = new p(qVar.f10764e + 2);
        q qVar2 = new q(qVar.f10764e);
        int[] iArr2 = qVar.f10761b;
        Object[] objArr2 = qVar.f10762c;
        long[] jArr = qVar.f10760a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j4 = jArr[i];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i6 = 8 - ((~(i - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j4) < 128) {
                            int i8 = (i << 3) + i7;
                            int i9 = iArr2[i8];
                            I i10 = (I) objArr2[i8];
                            pVar.a(i9);
                            qVar2.i(i9, new C0((AbstractC0924q) w0Var.f12136a.invoke(i10.f11852a), i10.f11853b));
                        }
                        j4 >>= i3;
                        i7++;
                        i3 = i3;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i6 != i3) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!qVar.b(0)) {
            int i11 = pVar.f10759b;
            if (i11 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + pVar.f10759b);
            }
            pVar.b(i11 + 1);
            int[] iArr3 = pVar.f10758a;
            int i12 = pVar.f10759b;
            if (i12 != 0) {
                k.c0(1, 0, i12, iArr3, iArr3);
            }
            iArr3[0] = 0;
            pVar.f10759b++;
        }
        if (!qVar.b(eVar.f2138b)) {
            pVar.a(eVar.f2138b);
        }
        int i13 = pVar.f10759b;
        if (i13 != 0) {
            int[] iArr4 = pVar.f10758a;
            E4.k.f("<this>", iArr4);
            Arrays.sort(iArr4, 0, i13);
        }
        return new D0(pVar, qVar2, eVar.f2138b, AbstractC0931y.f12148c);
    }
}
