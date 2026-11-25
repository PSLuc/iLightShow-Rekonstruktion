package p029f;

import E4.k;
import F1.C0097n;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new C0097n(13);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IntentSender f8828h;
    public final Intent i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f8829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8830k;

    public i(IntentSender intentSender, Intent intent, int i, int i3) {
        k.f("intentSender", intentSender);
        this.f8828h = intentSender;
        this.i = intent;
        this.f8829j = i;
        this.f8830k = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        k.f("dest", parcel);
        parcel.writeParcelable(this.f8828h, i);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.f8829j);
        parcel.writeInt(this.f8830k);
    }
}
