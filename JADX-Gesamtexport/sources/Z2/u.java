package Z2;

import F1.C0097n;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p004a3.a {
    public static final Parcelable.Creator<u> CREATOR = new C0097n(9);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bundle f6058h;
    public W2.c[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6059j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f6060k;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        Bundle bundle = this.f6058h;
        if (bundle != null) {
            int iJ1 = p081p0.c.J0(parcel, 1);
            parcel.writeBundle(bundle);
            p081p0.c.L0(parcel, iJ1);
        }
        p081p0.c.G0(parcel, 2, this.i, i);
        p081p0.c.H0(parcel, 3, 4);
        parcel.writeInt(this.f6059j);
        p081p0.c.E0(parcel, 4, this.f6060k, i);
        p081p0.c.L0(parcel, iJ0);
    }
}
