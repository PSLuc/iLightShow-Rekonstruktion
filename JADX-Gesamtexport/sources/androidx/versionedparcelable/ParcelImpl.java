package androidx.versionedparcelable;

import F1.C0097n;
import N1.b;
import N1.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0097n(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7018h;

    public ParcelImpl(Parcel parcel) {
        this.f7018h = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new b(parcel).i(this.f7018h);
    }
}
