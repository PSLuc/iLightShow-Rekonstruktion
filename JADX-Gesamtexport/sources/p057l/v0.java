package p057l;

import android.os.Parcel;
import android.os.Parcelable;
import q1.b;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends b {
    public static final Parcelable.Creator<v0> CREATOR = new u0(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f10144j;

    public v0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10144j = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f10144j + "}";
    }

    @Override // q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f10144j));
    }
}
