package Z2;

import F1.C0097n;
import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p004a3.a {
    public static final Parcelable.Creator<c> CREATOR = new C0097n(11);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Scope[] f6004v = new Scope[0];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final W2.c[] f6005w = new W2.c[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6006h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6007j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f6008k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IBinder f6009l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Scope[] f6010m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bundle f6011n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Account f6012o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public W2.c[] f6013p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public W2.c[] f6014q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f6015r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f6016s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f6017t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f6018u;

    public c(int i, int i3, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, W2.c[] cVarArr, W2.c[] cVarArr2, boolean z5, int i7, boolean z6, String str2) {
        scopeArr = scopeArr == null ? f6004v : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        W2.c[] cVarArr3 = f6005w;
        cVarArr = cVarArr == null ? cVarArr3 : cVarArr;
        cVarArr2 = cVarArr2 == null ? cVarArr3 : cVarArr2;
        this.f6006h = i;
        this.i = i3;
        this.f6007j = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f6008k = "com.google.android.gms";
        } else {
            this.f6008k = str;
        }
        if (i < 2) {
            Account accountA = null;
            if (iBinder != null) {
                int i8 = AbstractBinderC0392a.f5998b;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface zVar = iInterfaceQueryLocalInterface instanceof d ? (d) iInterfaceQueryLocalInterface : new z(iBinder);
                if (zVar != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        accountA = ((z) zVar).a();
                    } catch (RemoteException unused) {
                    } finally {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                }
            }
            this.f6012o = accountA;
        } else {
            this.f6009l = iBinder;
            this.f6012o = account;
        }
        this.f6010m = scopeArr;
        this.f6011n = bundle;
        this.f6013p = cVarArr;
        this.f6014q = cVarArr2;
        this.f6015r = z5;
        this.f6016s = i7;
        this.f6017t = z6;
        this.f6018u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0097n.a(this, parcel, i);
    }
}
