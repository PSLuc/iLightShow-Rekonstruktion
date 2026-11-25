package p123x;

import S0.b;
import S0.e;
import S0.k;
import p113v0.H;

/* JADX INFO: renamed from: x.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1075h implements InterfaceC1074g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13775b;

    public C1075h(float f6) {
        this.f13774a = f6;
        this.f13775b = f6;
    }

    @Override // p123x.InterfaceC1073f, p123x.InterfaceC1076i
    public final float a() {
        return this.f13775b;
    }

    @Override // p123x.InterfaceC1073f
    public final void b(b bVar, int i, int[] iArr, k kVar, int[] iArr2) {
        int i3;
        int iMin;
        if (iArr.length == 0) {
            return;
        }
        int iH = bVar.H(this.f13774a);
        boolean z5 = kVar == k.i;
        C1069b c1069b = AbstractC1078k.f13777a;
        if (z5) {
            i3 = 0;
            iMin = 0;
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i6 = iArr[length];
                int iMin2 = Math.min(i3, i - i6);
                iArr2[length] = iMin2;
                iMin = Math.min(iH, (i - iMin2) - i6);
                i3 = iArr2[length] + i6 + iMin;
            }
        } else {
            int length2 = iArr.length;
            int i7 = 0;
            i3 = 0;
            iMin = 0;
            int i8 = 0;
            while (i7 < length2) {
                int i9 = iArr[i7];
                int iMin3 = Math.min(i3, i - i9);
                iArr2[i8] = iMin3;
                int iMin4 = Math.min(iH, (i - iMin3) - i9);
                int i10 = iArr2[i8] + i9 + iMin4;
                i7++;
                iMin = iMin4;
                i3 = i10;
                i8++;
            }
        }
        int i11 = i3 - iMin;
        if (i11 < i) {
            int iRound = Math.round((1 + (kVar != k.f4897h ? (-1.0f) * (-1) : -1.0f)) * ((i - i11) / 2.0f));
            int length3 = iArr2.length;
            for (int i12 = 0; i12 < length3; i12++) {
                iArr2[i12] = iArr2[i12] + iRound;
            }
        }
    }

    @Override // p123x.InterfaceC1076i
    public final void c(int i, H h6, int[] iArr, int[] iArr2) {
        b(h6, i, iArr, k.f4897h, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1075h)) {
            return false;
        }
        if (!e.a(this.f13774a, ((C1075h) obj).f13774a)) {
            return false;
        }
        Object obj2 = C1077j.f13776h;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return C1077j.f13776h.hashCode() + p012c.k.m(true, Float.hashCode(this.f13774a) * 31, 31);
    }

    public final String toString() {
        return "Arrangement#spacedAligned(" + ((Object) e.b(this.f13774a)) + ", " + C1077j.f13776h + ')';
    }
}
