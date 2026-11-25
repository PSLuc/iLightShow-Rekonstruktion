package p057l;

import android.os.Parcel;
import android.os.Parcelable;
import q1.b;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10143a;

    public /* synthetic */ u0(int i) {
        this.f10143a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f10143a) {
            case 0:
                return new v0(parcel, null);
            case 1:
                return new K0(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return b.i;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f10143a) {
            case 0:
                return new v0[i];
            case 1:
                return new K0[i];
            default:
                return new b[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f10143a) {
            case 0:
                return new v0(parcel, classLoader);
            case 1:
                return new K0(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return b.i;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
