package com.google.android.gms.common.api;

import F1.C0097n;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p004a3.a;
import p081p0.c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0097n(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7776h;
    public final String i;

    public Scope(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("scopeUri must not be null or empty");
        }
        this.f7776h = i;
        this.i = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.i.equals(((Scope) obj).i);
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String toString() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iJ0 = c.J0(parcel, 20293);
        c.H0(parcel, 1, 4);
        parcel.writeInt(this.f7776h);
        c.F0(parcel, 2, this.i);
        c.L0(parcel, iJ0);
    }
}
