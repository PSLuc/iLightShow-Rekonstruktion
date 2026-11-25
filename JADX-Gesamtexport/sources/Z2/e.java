package Z2;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e extends p004a3.a {
    public static final Parcelable.Creator<e> CREATOR = new C0097n(7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6019h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f6021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f6022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6026p;

    public e(int i, int i3, int i6, long j4, long j6, String str, String str2, int i7, int i8) {
        this.f6019h = i;
        this.i = i3;
        this.f6020j = i6;
        this.f6021k = j4;
        this.f6022l = j6;
        this.f6023m = str;
        this.f6024n = str2;
        this.f6025o = i7;
        this.f6026p = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.H0(parcel, 1, 4);
        parcel.writeInt(this.f6019h);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(this.i);
        p081p0.c.H0(parcel, 3, 4);
        parcel.writeInt(this.f6020j);
        p081p0.c.H0(parcel, 4, 8);
        parcel.writeLong(this.f6021k);
        p081p0.c.H0(parcel, 5, 8);
        parcel.writeLong(this.f6022l);
        p081p0.c.F0(parcel, 6, this.f6023m);
        p081p0.c.F0(parcel, 7, this.f6024n);
        p081p0.c.H0(parcel, 8, 4);
        parcel.writeInt(this.f6025o);
        p081p0.c.H0(parcel, 9, 4);
        parcel.writeInt(this.f6026p);
        p081p0.c.L0(parcel, iJ0);
    }
}
