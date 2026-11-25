package Z2;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class b extends p004a3.a {
    public static final Parcelable.Creator<b> CREATOR = new C0097n(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f5999h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6000j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[] f6001k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6002l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f6003m;

    public b(g gVar, boolean z5, boolean z6, int[] iArr, int i, int[] iArr2) {
        this.f5999h = gVar;
        this.i = z5;
        this.f6000j = z6;
        this.f6001k = iArr;
        this.f6002l = i;
        this.f6003m = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.E0(parcel, 1, this.f5999h, i);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(this.i ? 1 : 0);
        p081p0.c.H0(parcel, 3, 4);
        parcel.writeInt(this.f6000j ? 1 : 0);
        int[] iArr = this.f6001k;
        if (iArr != null) {
            int iJ1 = p081p0.c.J0(parcel, 4);
            parcel.writeIntArray(iArr);
            p081p0.c.L0(parcel, iJ1);
        }
        p081p0.c.H0(parcel, 5, 4);
        parcel.writeInt(this.f6002l);
        int[] iArr2 = this.f6003m;
        if (iArr2 != null) {
            int iJ2 = p081p0.c.J0(parcel, 6);
            parcel.writeIntArray(iArr2);
            p081p0.c.L0(parcel, iJ2);
        }
        p081p0.c.L0(parcel, iJ0);
    }
}
