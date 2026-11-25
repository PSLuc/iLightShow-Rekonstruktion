package q1;

import android.os.Parcel;
import android.os.Parcelable;
import p057l.u0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Parcelable f11210h;
    public static final a i = new a();
    public static final Parcelable.Creator<b> CREATOR = new u0(2);

    public b() {
        this.f11210h = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable(this.f11210h, i3);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f11210h = parcelable == i ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f11210h = parcelable == null ? i : parcelable;
    }
}
