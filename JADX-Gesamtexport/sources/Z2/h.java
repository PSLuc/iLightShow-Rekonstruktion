package Z2;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends p004a3.a {
    public static final Parcelable.Creator<h> CREATOR = new C0097n(6);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6032h;
    public List i;

    public h(int i, List list) {
        this.f6032h = i;
        this.i = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = p081p0.c.J0(parcel, 20293);
        p081p0.c.H0(parcel, 1, 4);
        parcel.writeInt(this.f6032h);
        List list = this.i;
        if (list != null) {
            int iJ1 = p081p0.c.J0(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                Parcelable parcelable = (Parcelable) list.get(i3);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    int iDataPosition = parcel.dataPosition();
                    parcel.writeInt(1);
                    int iDataPosition2 = parcel.dataPosition();
                    parcelable.writeToParcel(parcel, 0);
                    int iDataPosition3 = parcel.dataPosition();
                    parcel.setDataPosition(iDataPosition);
                    parcel.writeInt(iDataPosition3 - iDataPosition2);
                    parcel.setDataPosition(iDataPosition3);
                }
            }
            p081p0.c.L0(parcel, iJ1);
        }
        p081p0.c.L0(parcel, iJ0);
    }
}
