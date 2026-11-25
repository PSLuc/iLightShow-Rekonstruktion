package Z2;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p004a3.a {
    public static final Parcelable.Creator<g> CREATOR = new C0097n(8);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6028h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f6029j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f6030k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6031l;

    public g(int i, boolean z5, boolean z6, int i3, int i6) {
        this.f6028h = i;
        this.i = z5;
        this.f6029j = z6;
        this.f6030k = i3;
        this.f6031l = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.H0(parcel, 1, 4);
        parcel.writeInt(this.f6028h);
        p081p0.c.H0(parcel, 2, 4);
        parcel.writeInt(this.i ? 1 : 0);
        p081p0.c.H0(parcel, 3, 4);
        parcel.writeInt(this.f6029j ? 1 : 0);
        p081p0.c.H0(parcel, 4, 4);
        parcel.writeInt(this.f6030k);
        p081p0.c.H0(parcel, 5, 4);
        parcel.writeInt(this.f6031l);
        p081p0.c.L0(parcel, iJ0);
    }
}
