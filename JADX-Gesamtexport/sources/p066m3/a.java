package p066m3;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0097n(14);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = (b) this;
        parcel.writeParcelable(bVar.f10410h, 0);
        parcel.writeInt(bVar.i ? 1 : 0);
    }
}
