package p057l;

import android.os.Parcel;
import android.os.Parcelable;
import q1.b;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends b {
    public static final Parcelable.Creator<K0> CREATOR = new u0(1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9990j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9991k;

    public K0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9990j = parcel.readInt();
        this.f9991k = parcel.readInt() != 0;
    }

    @Override // q1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9990j);
        parcel.writeInt(this.f9991k ? 1 : 0);
    }
}
