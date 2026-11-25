package F1;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.EnumC0454n;
import com.spotify.sdk.android.auth.AuthorizationClient;

/* JADX INFO: renamed from: F1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0098o implements Parcelable {
    public static final Parcelable.Creator<C0098o> CREATOR = new C0097n(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1365h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Bundle f1366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Bundle f1367k;

    public C0098o(C0096m c0096m) {
        E4.k.f("entry", c0096m);
        this.f1365h = c0096m.f1357m;
        this.i = c0096m.i.f1247m;
        this.f1366j = c0096m.g();
        Bundle bundle = new Bundle();
        this.f1367k = bundle;
        c0096m.f1360p.j(bundle);
    }

    public final C0096m a(Context context, B b6, EnumC0454n enumC0454n, C0103u c0103u) {
        E4.k.f("context", context);
        E4.k.f("hostLifecycleState", enumC0454n);
        Bundle bundle = this.f1366j;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f1365h;
        E4.k.f(AuthorizationClient.PlayStoreParams.ID, str);
        return new C0096m(context, b6, bundle2, enumC0454n, c0103u, str, this.f1367k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        E4.k.f("parcel", parcel);
        parcel.writeString(this.f1365h);
        parcel.writeInt(this.i);
        parcel.writeBundle(this.f1366j);
        parcel.writeBundle(this.f1367k);
    }

    public C0098o(Parcel parcel) {
        String string = parcel.readString();
        E4.k.c(string);
        this.f1365h = string;
        this.i = parcel.readInt();
        this.f1366j = parcel.readBundle(C0098o.class.getClassLoader());
        Bundle bundle = parcel.readBundle(C0098o.class.getClassLoader());
        E4.k.c(bundle);
        this.f1367k = bundle;
    }
}
