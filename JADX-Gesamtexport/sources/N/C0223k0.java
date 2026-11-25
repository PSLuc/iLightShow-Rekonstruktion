package N;

import B.C0043w;
import java.util.ArrayList;

/* JADX INFO: renamed from: N.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0223k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p080p.q f3719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p084p4.m f3720f;

    public C0223k0(int i, ArrayList arrayList) {
        this.f3715a = arrayList;
        this.f3716b = i;
        if (!(i >= 0)) {
            C0208d.S("Invalid start index");
            throw null;
        }
        this.f3718d = new ArrayList();
        p080p.q qVar = new p080p.q();
        int size = arrayList.size();
        int i3 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            O o6 = (O) this.f3715a.get(i6);
            int i7 = o6.f3640c;
            int i8 = o6.f3641d;
            qVar.i(i7, new I(i6, i3, i8));
            i3 += i8;
        }
        this.f3719e = qVar;
        this.f3720f = G4.a.z(new C0043w(21, this));
    }

    public final boolean a(int i, int i3) {
        int i6;
        p080p.q qVar = this.f3719e;
        I i7 = (I) qVar.f(i);
        if (i7 == null) {
            return false;
        }
        int i8 = i7.f3615b;
        int i9 = i3 - i7.f3616c;
        i7.f3616c = i3;
        if (i9 == 0) {
            return true;
        }
        Object[] objArr = qVar.f10762c;
        long[] jArr = qVar.f10760a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j4 = jArr[i10];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j4) < 128) {
                        I i13 = (I) objArr[(i10 << 3) + i12];
                        if (i13.f3615b >= i8 && !i13.equals(i7) && (i6 = i13.f3615b + i9) >= 0) {
                            i13.f3615b = i6;
                        }
                    }
                    j4 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }
}
