package N;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0207c0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3686a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3686a) {
            case 0:
                return new C0209d0(parcel.readFloat());
            case 1:
                return new C0211e0(parcel.readInt());
            default:
                return new C0213f0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f3686a) {
            case 0:
                return new C0209d0[i];
            case 1:
                return new C0211e0[i];
            default:
                return new C0213f0[i];
        }
    }
}
