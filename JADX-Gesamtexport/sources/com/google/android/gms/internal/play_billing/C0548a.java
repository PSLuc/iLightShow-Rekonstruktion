package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0548a extends AbstractC0557d implements InterfaceC0554c {
    public final int c(int i, String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        int i3 = AbstractC0563f.f7942a;
        parcelA.writeInt(1);
        bundle.writeToParcel(parcelA, 0);
        Parcel parcelB = b(parcelA, 10);
        int i6 = parcelB.readInt();
        parcelB.recycle();
        return i6;
    }

    public final Bundle d(String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeInt(9);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        int i = AbstractC0563f.f7942a;
        parcelA.writeInt(1);
        bundle.writeToParcel(parcelA, 0);
        Parcel parcelB = b(parcelA, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle2;
    }

    public final Bundle e(String str, String str2, String str3) {
        Parcel parcelA = a();
        parcelA.writeInt(3);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        parcelA.writeString(null);
        Parcel parcelB = b(parcelA, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle;
    }

    public final Bundle f(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        parcelA.writeString(null);
        int i3 = AbstractC0563f.f7942a;
        parcelA.writeInt(1);
        bundle.writeToParcel(parcelA, 0);
        Parcel parcelB = b(parcelA, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle2;
    }

    public final Bundle g(String str, String str2) {
        Parcel parcelA = a();
        parcelA.writeInt(3);
        parcelA.writeString(str);
        parcelA.writeString("inapp");
        parcelA.writeString(str2);
        Parcel parcelB = b(parcelA, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle;
    }

    public final Bundle h(int i, String str, String str2, Bundle bundle) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        parcelA.writeString(str);
        parcelA.writeString("inapp");
        parcelA.writeString(str2);
        int i3 = AbstractC0563f.f7942a;
        parcelA.writeInt(1);
        bundle.writeToParcel(parcelA, 0);
        Parcel parcelB = b(parcelA, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle2;
    }

    public final Bundle i(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelA = a();
        parcelA.writeInt(i);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        int i3 = AbstractC0563f.f7942a;
        parcelA.writeInt(1);
        bundle.writeToParcel(parcelA, 0);
        parcelA.writeInt(1);
        bundle2.writeToParcel(parcelA, 0);
        Parcel parcelB = b(parcelA, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) AbstractC0563f.a(parcelB);
        parcelB.recycle();
        return bundle3;
    }
}
