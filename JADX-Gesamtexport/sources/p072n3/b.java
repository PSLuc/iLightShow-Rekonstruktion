package p072n3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f10541a;

    public b(IBinder iBinder) {
        this.f10541a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10541a;
    }
}
