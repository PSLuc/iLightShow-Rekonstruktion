package p010b3;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes.dex */
public final class a implements IInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBinder f7094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7095b;

    public a(IBinder iBinder, String str) {
        this.f7094a = iBinder;
        this.f7095b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7094a;
    }
}
