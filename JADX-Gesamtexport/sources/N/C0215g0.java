package N;

import B.AbstractC0013g0;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: N.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0215g0 implements Parcelable.ClassLoaderCreator {
    public static C0217h0 a(Parcel parcel, ClassLoader classLoader) {
        U u6;
        if (classLoader == null) {
            classLoader = C0215g0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            u6 = U.f3670j;
        } else if (i == 1) {
            u6 = U.f3673m;
        } else {
            if (i != 2) {
                throw new IllegalStateException(AbstractC0013g0.f(i, "Unsupported MutableState policy ", " was restored"));
            }
            u6 = U.f3671k;
        }
        return new C0217h0(value, u6);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new C0217h0[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
